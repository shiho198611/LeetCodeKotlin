package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RotateArrayTest {

    lateinit var rotateArray: RotateArray

    @Before
    fun initTest() {
        rotateArray = RotateArray()
    }

    @Test
    fun rotateArray_Test01() {
        val nums = intArrayOf(1,2,3,4,5,6,7)
        val k = 3
        val verify = intArrayOf(5,6,7,1,2,3,4)

        rotateArray.rotate(nums, k)

        Assert.assertArrayEquals(nums, verify)
    }

    @Test
    fun rotateArray_Test02() {
        val nums = intArrayOf(-1,-100,3,99)
        val k = 2
        val verify = intArrayOf(3,99,-1,-100)

        rotateArray.rotate(nums, k)

        Assert.assertArrayEquals(nums, verify)
    }

}