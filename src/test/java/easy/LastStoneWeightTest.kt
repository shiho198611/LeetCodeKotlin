package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LastStoneWeightTest {

    lateinit var lastStoneWeight: LastStoneWeight

    @Before
    fun initTest() {
        lastStoneWeight = LastStoneWeight()
    }

    @Test
    fun lastStoneWeight_Test01() {
        val input = intArrayOf(2,7,4,1,8,1)
        val verify = 1

        val result = lastStoneWeight.lastStoneWeight(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun lastStoneWeight_Test02() {
        val input = intArrayOf(10,5,4,2,1,1)
        val verify = 1

        val result = lastStoneWeight.lastStoneWeight(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun lastStoneWeight_Test03() {
        val input = intArrayOf(7,6,7,6,9)
        val verify = 3

        val result = lastStoneWeight.lastStoneWeight(input)

        Assert.assertEquals(result, verify)
    }

}