package easy.dp

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ClimbingStairsTest {

    private lateinit var climbingStairs: ClimbingStairs

    @Before
    fun initTest() {
        climbingStairs = ClimbingStairs()
    }

    @Test
    fun testCase1() {
        val input = 2
        val result = climbingStairs.climbStairs(input)

        Assert.assertEquals(result, 2)
    }

    @Test
    fun testCase2() {
        val input = 3
        val result = climbingStairs.climbStairs(input)

        Assert.assertEquals(result, 3)
    }

    @Test
    fun testCase3() {
        val input = 4
        val result = climbingStairs.climbStairs(input)

        Assert.assertEquals(result, 5)
    }

    @Test
    fun testCase4() {
        val input = 5
        val result = climbingStairs.climbStairs(input)

        Assert.assertEquals(result, 8)
    }

    @Test
    fun testCase5() {
        val input = 6
        val result = climbingStairs.climbStairs(input)

        Assert.assertEquals(result, 13)
    }

}