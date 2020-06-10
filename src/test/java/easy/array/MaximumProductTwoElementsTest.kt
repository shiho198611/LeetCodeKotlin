package easy.array

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MaximumProductTwoElementsTest {

    lateinit var maximumProductTwoElements: MaximumProductTwoElements

    @Before
    fun initTest() {
        maximumProductTwoElements = MaximumProductTwoElements()
    }

    @Test
    fun maxProduct_Test01() {
        val nums = intArrayOf(3, 4, 5, 2)
        val verify = 12
        val result = maximumProductTwoElements.maxProduct(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun maxProduct_Test02() {
        val nums = intArrayOf(1, 5, 4, 5)
        val verify = 16
        val result = maximumProductTwoElements.maxProduct(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun maxProduct_Test03() {
        val nums = intArrayOf(3, 7)
        val verify = 12
        val result = maximumProductTwoElements.maxProduct(nums)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun maxProduct_Test04() {
        val nums = intArrayOf(10,2,5,2)
        val verify = 36
        val result = maximumProductTwoElements.maxProduct(nums)

        Assert.assertEquals(result, verify)
    }

}