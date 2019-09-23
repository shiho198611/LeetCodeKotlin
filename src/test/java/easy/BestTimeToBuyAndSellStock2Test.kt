package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BestTimeToBuyAndSellStock2Test {

    lateinit var bestTimeToBuyAndSellStock2: BestTimeToBuyAndSellStock2

    @Before
    fun initTest() {
        bestTimeToBuyAndSellStock2 = BestTimeToBuyAndSellStock2()
    }

    @Test
    fun bestTimeToBuyAndSellStock2_Test01() {
        val prices = intArrayOf(7,1,5,3,6,4)
        val verify = 7

        val result = bestTimeToBuyAndSellStock2.maxProfit(prices)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun bestTimeToBuyAndSellStock2_Test02() {
        val prices = intArrayOf(1,2,3,4,5)
        val verify = 4

        val result = bestTimeToBuyAndSellStock2.maxProfit(prices)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun bestTimeToBuyAndSellStock2_Test03() {
        val prices = intArrayOf(7,6,4,3,1)
        val verify = 0

        val result = bestTimeToBuyAndSellStock2.maxProfit(prices)

        Assert.assertEquals(result, verify)
    }

}