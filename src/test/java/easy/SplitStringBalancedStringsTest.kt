package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SplitStringBalancedStringsTest {

    lateinit var splitStringBalancedStrings: SplitStringBalancedStrings

    @Before
    fun initTest() {
        splitStringBalancedStrings = SplitStringBalancedStrings()
    }

    @Test
    fun balancedStringSplit_Test01() {
        val input = "RLRRLLRLRL"
        val verify = 4

        val result = splitStringBalancedStrings.balancedStringSplit(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun balancedStringSplit_Test02() {
        val input = "RLLLLRRRLR"
        val verify = 3

        val result = splitStringBalancedStrings.balancedStringSplit(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun balancedStringSplit_Test03() {
        val input = "LLLLRRRR"
        val verify = 1

        val result = splitStringBalancedStrings.balancedStringSplit(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun balancedStringSplit_Test04() {
        val input = "RRLRRLRLLLRL"
        val verify = 2

        val result = splitStringBalancedStrings.balancedStringSplit(input)

        Assert.assertEquals(result, verify)
    }

}