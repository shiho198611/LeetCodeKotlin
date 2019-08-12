package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class IntersectionOfTwoArrays2Test {

    lateinit var intersectionArrays: IntersectionOfTwoArrays2

    @Before
    fun initTest() {
        intersectionArrays = IntersectionOfTwoArrays2()
    }

    @Test
    fun intersectionOfTwoArrays2_Test01() {
        val nums1 = intArrayOf(1, 2, 2, 1)
        val nums2 = intArrayOf(2, 2)

        val verify = intArrayOf(2, 2)

        val result= intersectionArrays.intersect(nums1, nums2)

        Assert.assertArrayEquals(result, verify)
    }

    @Test
    fun intersectionOfTwoArrays2_Test02() {
        val nums1 = intArrayOf(4,9,5)
        val nums2 = intArrayOf(9,4,9,8,4)

        val verify = intArrayOf(4,9)

        val result= intersectionArrays.intersect(nums1, nums2)

        Assert.assertArrayEquals(result, verify)
    }
}