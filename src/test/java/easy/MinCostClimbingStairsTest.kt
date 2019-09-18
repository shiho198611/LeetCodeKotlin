package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MinCostClimbingStairsTest {

    lateinit var minCostClimbingStairs: MinCostClimbingStairs

    @Before
    fun initTest() {
        minCostClimbingStairs = MinCostClimbingStairs()
    }

    @Test
    fun minCostClimbingStairs_Test01() {
        val cost = intArrayOf(10, 15, 20)
        val verify = 15

        val result = minCostClimbingStairs.minCostClimbingStairs(cost)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun minCostClimbingStairs_Test02() {
        val cost = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)
        val verify = 6

        val result = minCostClimbingStairs.minCostClimbingStairs(cost)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun minCostClimbingStairs_Test03() {
        val cost = intArrayOf(1,0,2,2)
        val verify = 2

        val result = minCostClimbingStairs.minCostClimbingStairs(cost)

        Assert.assertEquals(result, verify)
    }

}