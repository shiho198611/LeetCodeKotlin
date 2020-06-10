package easy

import easy.array.RemoveDuplicatesFromSortedArray
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RemoveDuplicatesFromSortedArrayTest {

    lateinit var removeDuplicatesFromSortedArray: RemoveDuplicatesFromSortedArray

    @Before
    fun initTest() {
        removeDuplicatesFromSortedArray = RemoveDuplicatesFromSortedArray()
    }

    @Test
    fun removeDuplicatesFromSortedArray_Test01() {
        val nums = intArrayOf(1, 1, 2)
        val verifyNums = intArrayOf(1, 2)

        val size = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        val resultNums = nums.slice(0 until size).toIntArray()

        Assert.assertEquals(size, verifyNums.size)
        Assert.assertArrayEquals(resultNums, verifyNums)
    }

    @Test
    fun removeDuplicatesFromSortedArray_Test02() {
        val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        val verifyNums = intArrayOf(0, 1, 2, 3, 4)

        val size = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        val resultNums = nums.slice(0 until size).toIntArray()

        Assert.assertEquals(size, verifyNums.size)
        Assert.assertArrayEquals(resultNums, verifyNums)
    }

    @Test
    fun removeDuplicatesFromSortedArray_Test03() {
        val nums = intArrayOf(1)
        val verifyNums = intArrayOf(1)

        val size = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        val resultNums = nums.slice(0 until size).toIntArray()

        Assert.assertEquals(size, verifyNums.size)
        Assert.assertArrayEquals(resultNums, verifyNums)
    }

    @Test
    fun removeDuplicatesFromSortedArray_Test04() {
        val nums = intArrayOf()
        val verifyNums = intArrayOf()

        val size = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        val resultNums = nums.slice(0 until size).toIntArray()

        Assert.assertEquals(size, verifyNums.size)
        Assert.assertArrayEquals(resultNums, verifyNums)
    }

    @Test
    fun removeDuplicatesFromSortedArray_Test05() {
        val nums = intArrayOf(1, 1)
        val verifyNums = intArrayOf(1)

        val size = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        val resultNums = nums.slice(0 until size).toIntArray()

        Assert.assertEquals(size, verifyNums.size)
        Assert.assertArrayEquals(resultNums, verifyNums)
    }

    @Test
    fun removeDuplicatesFromSortedArray_Test06() {
        val nums = intArrayOf(1, 2)
        val verifyNums = intArrayOf(1, 2)

        val size = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        val resultNums = nums.slice(0 until size).toIntArray()

        Assert.assertEquals(size, verifyNums.size)
        Assert.assertArrayEquals(resultNums, verifyNums)
    }

    @Test
    fun removeDuplicatesFromSortedArray_Test07() {
        val nums = intArrayOf(-1,0,0,0,0,3,3)
        val verifyNums = intArrayOf(-1,0,3)

        val size = removeDuplicatesFromSortedArray.removeDuplicates(nums)
        val resultNums = nums.slice(0 until size).toIntArray()

        Assert.assertEquals(size, verifyNums.size)
        Assert.assertArrayEquals(resultNums, verifyNums)
    }

}