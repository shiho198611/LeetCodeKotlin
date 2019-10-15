package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RelativeRanksTest {

    lateinit var relativeRanks: RelativeRanks

    @Before
    fun initTest() {
        relativeRanks = RelativeRanks()
    }

    @Test
    fun relativeRanks_Test01() {
        val input = intArrayOf(5,4,3,2,1)
        val verify = arrayOf("Gold Medal", "Silver Medal", "Bronze Medal", "4", "5")

        val result = relativeRanks.findRelativeRanks(input)

        Assert.assertArrayEquals(result, verify)
    }

}