package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class FindAllNumbersDisappearedInAnArrayTest {

    lateinit var findAllNumbersDisappearedInAnArray: FindAllNumbersDisappearedInAnArray

    @Before
    fun initTest() {
        findAllNumbersDisappearedInAnArray = FindAllNumbersDisappearedInAnArray()
    }

    @Test
    fun findAllNumbersDisappearedInAnArray_Test01() {
        val nums = intArrayOf(4,3,2,7,8,2,3,1)
        val verify = listOf(5,6)

        val result = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun findAllNumbersDisappearedInAnArray_Test02() {
        val nums = intArrayOf()
        val verify = emptyList<Int>()

        val result = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun findAllNumbersDisappearedInAnArray_Test03() {
        val nums = intArrayOf(1,1)
        val verify = listOf(2)

        val result = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums)

        Assert.assertEquals(verify, result)
    }

}