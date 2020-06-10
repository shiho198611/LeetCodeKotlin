package easy

import easy.array.MergeSortedArray
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MergeSortedArrayTest {

    lateinit var mergeSortedArray: MergeSortedArray

    @Before
    fun initTest() {
        mergeSortedArray = MergeSortedArray()
    }

    @Test
    fun merge_Test01() {
        val nums1 = intArrayOf(1,2,3,0,0,0)
        val m = 3

        val nums2 = intArrayOf(2,5,6)
        val n = 3

        val verify = intArrayOf(1,2,2,3,5,6)

        mergeSortedArray.merge(nums1, m, nums2, n)

        Assert.assertArrayEquals(nums1, verify)
    }

    @Test
    fun merge_Test02() {
        val nums1 = intArrayOf(1)
        val m = 1

        val nums2 = intArrayOf()
        val n = 0

        val verify = intArrayOf(1)

        mergeSortedArray.merge(nums1, m, nums2, n)

        Assert.assertArrayEquals(nums1, verify)
    }

    @Test
    fun merge_Test03() {
        val nums1 = intArrayOf(2,0)
        val m = 1

        val nums2 = intArrayOf(1)
        val n = 1

        val verify = intArrayOf(1,2)

        mergeSortedArray.merge(nums1, m, nums2, n)

        Assert.assertArrayEquals(nums1, verify)
    }

    @Test
    fun merge_Test04() {
        val nums1 = intArrayOf(4,0,0,0,0,0)
        val m = 1

        val nums2 = intArrayOf(1,2,3,5,6)
        val n = 5

        val verify = intArrayOf(1,2,3,4,5,6)

        mergeSortedArray.merge(nums1, m, nums2, n)

        Assert.assertArrayEquals(nums1, verify)
    }

    @Test
    fun merge_Test05() {
        val nums1 = intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)
        val m = 0

        val nums2 = intArrayOf(-50,-50,-48,-47,-44,-44,-37,-35,-35,-32,-32,-31,-29,-29,-28,-26,-24,-23,-23,-21,-20,-19,-17,-15,-14,-12,-12,-11,-10,-9,-8,-5,-2,-2,1,1,3,4,4,7,7,7,9,10,11,12,14,16,17,18,21,21,24,31,33,34,35,36,41,41,46,48,48)
        val n = 63

        val verify = intArrayOf(-50,-50,-48,-47,-44,-44,-37,-35,-35,-32,-32,-31,-29,-29,-28,-26,-24,-23,-23,-21,-20,-19,-17,-15,-14,-12,-12,-11,-10,-9,-8,-5,-2,-2,1,1,3,4,4,7,7,7,9,10,11,12,14,16,17,18,21,21,24,31,33,34,35,36,41,41,46,48,48)

        mergeSortedArray.merge(nums1, m, nums2, n)

        Assert.assertArrayEquals(nums1, verify)
    }

    @Test
    fun merge_Test06() {
        val nums1 = intArrayOf(4,5,6,0,0,0)
        val m = 3

        val nums2 = intArrayOf(1,2,3)
        val n = 3

        val verify = intArrayOf(1,2,3,4,5,6)

        mergeSortedArray.merge(nums1, m, nums2, n)

        Assert.assertArrayEquals(nums1, verify)
    }

    @Test
    fun merge_Test07() {
        val nums1 = intArrayOf(1,2,4,5,6,0)
        val m = 5

        val nums2 = intArrayOf(3)
        val n = 1

        val verify = intArrayOf(1,2,3,4,5,6)

        mergeSortedArray.merge(nums1, m, nums2, n)

        Assert.assertArrayEquals(nums1, verify)
    }

}