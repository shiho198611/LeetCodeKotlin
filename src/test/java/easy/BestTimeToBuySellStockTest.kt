package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BestTimeToBuySellStockTest {

    lateinit var bestTimeToBuySellStock: BestTimeToBuySellStock

    @Before
    fun intTest() {
        bestTimeToBuySellStock = BestTimeToBuySellStock()
    }

    @Test
    fun bestTimeToBuySellStock_Test01() {
        val verify = 5
        val input = intArrayOf(7,1,5,3,6,4)

        val result = bestTimeToBuySellStock.maxProfit(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun bestTimeToBuySellStock_Test02() {
        val verify = 0
        val input = intArrayOf(7,6,4,3,1)

        val result = bestTimeToBuySellStock.maxProfit(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun bestTimeToBuySellStock_Test03() {
        val verify = 0
        val input = intArrayOf()

        val result = bestTimeToBuySellStock.maxProfit(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun bestTimeToBuySellStock_Test04() {
        val verify = 2
        val input = intArrayOf(2, 4, 1)

        val result = bestTimeToBuySellStock.maxProfit(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun bestTimeToBuySellStock_Test05() {
        val verify = 4
        val input = intArrayOf(3,2,6,5,0,3)

        val result = bestTimeToBuySellStock.maxProfit(input)

        Assert.assertEquals(result, verify)
    }
}