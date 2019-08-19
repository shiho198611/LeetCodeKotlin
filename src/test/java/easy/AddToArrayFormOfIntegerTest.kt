package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class AddToArrayFormOfIntegerTest {

    lateinit var addToArrayFormOfInteger: AddToArrayFormOfInteger

    @Before
    fun initTest() {
        addToArrayFormOfInteger = AddToArrayFormOfInteger()
    }

    @Test
    fun addToArrayFormOfInteger_Test01() {
        val nums = intArrayOf(1, 2, 0, 0)
        val k = 34

        val verify = listOf(1, 2, 3, 4)
        val result = addToArrayFormOfInteger.addToArrayForm(nums, k)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun addToArrayFormOfInteger_Test02() {
        val nums = intArrayOf(2,7,4)
        val k = 181

        val verify = listOf(4,5,5)
        val result = addToArrayFormOfInteger.addToArrayForm(nums, k)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun addToArrayFormOfInteger_Test03() {
        val nums = intArrayOf(2,1,5)
        val k = 806

        val verify = listOf(1,0,2,1)
        val result = addToArrayFormOfInteger.addToArrayForm(nums, k)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun addToArrayFormOfInteger_Test04() {
        val nums = intArrayOf(9,9,9,9,9,9,9,9,9,9)
        val k = 1

        val verify = listOf(1,0,0,0,0,0,0,0,0,0,0)
        val result = addToArrayFormOfInteger.addToArrayForm(nums, k)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun addToArrayFormOfInteger_Test05() {
        val nums = intArrayOf(0)
        val k = 0

        val verify = listOf(0)
        val result = addToArrayFormOfInteger.addToArrayForm(nums, k)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun addToArrayFormOfInteger_Test06() {
        val nums = intArrayOf(1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3)
        val k = 516

        val verify = listOf(1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,5,7,9)
        val result = addToArrayFormOfInteger.addToArrayForm(nums, k)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun addToArrayFormOfInteger_Test07() {
        val nums = intArrayOf(0)
        val k = 23

        val verify = listOf(2, 3)
        val result = addToArrayFormOfInteger.addToArrayForm(nums, k)

        Assert.assertEquals(verify, result)
    }

}