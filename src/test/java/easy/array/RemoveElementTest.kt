package easy.array

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RemoveElementTest {

    lateinit var removeElement: RemoveElement

    @Before
    fun initTest() {
        removeElement = RemoveElement()
    }

    @Test
    fun removeElement_Test01() {
        val nums = intArrayOf(3, 2, 2, 3)
        val value = 3

        val length = removeElement.removeElement(nums, value)

        val resultArray = IntArray(length)

        val verify = intArrayOf(2, 2)

        for (i in 0 until length) {
            resultArray[i] = nums[i]
        }

        verify.sort()
        resultArray.sort()

        Assert.assertArrayEquals(verify, resultArray)

    }

    @Test
    fun removeElement_Test02() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val value = 2

        val verify = intArrayOf(0, 1, 3, 0, 4)
        val length = removeElement.removeElement(nums, value)

        val resultArray = IntArray(length)

        for (i in 0 until length) {
            resultArray[i] = nums[i]
        }

        verify.sort()
        resultArray.sort()

        Assert.assertArrayEquals(verify, resultArray)

    }

    @Test
    fun removeElement_Test03() {
        val nums = intArrayOf(4, 5)
        val value = 4

        val verify = intArrayOf(5)
        val length = removeElement.removeElement(nums, value)

        val resultArray = IntArray(length)

        for (i in 0 until length) {
            resultArray[i] = nums[i]
        }

        verify.sort()
        resultArray.sort()

        Assert.assertArrayEquals(verify, resultArray)

    }

    @Test
    fun removeElement_Test04() {
        val nums = intArrayOf(2, 2, 3)
        val value = 2

        val verify = intArrayOf(3)
        val length = removeElement.removeElement(nums, value)

        val resultArray = IntArray(length)

        for (i in 0 until length) {
            resultArray[i] = nums[i]
        }

        verify.sort()
        resultArray.sort()

        Assert.assertArrayEquals(verify, resultArray)

    }

}