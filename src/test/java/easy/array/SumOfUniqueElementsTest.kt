package easy.array

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SumOfUniqueElementsTest {

    lateinit var sumOfUniqueElements: SumOfUniqueElements

    @Before
    fun initTest() {
        sumOfUniqueElements = SumOfUniqueElements()
    }

    @Test
    fun sumOfUniqueTest01() {

        val nums = intArrayOf(1,2,3,2)
        val verify = 4

        val result = sumOfUniqueElements.sumOfUnique(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun sumOfUniqueTest02() {

        val nums = intArrayOf(1,1,1,1,1)
        val verify = 0

        val result = sumOfUniqueElements.sumOfUnique(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun sumOfUniqueTest03() {

        val nums = intArrayOf(1,2,3,4,5)
        val verify = 15

        val result = sumOfUniqueElements.sumOfUnique(nums)

        Assert.assertEquals(result, verify)
    }
}