package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class JewelsAndStonesTest {

    lateinit var jewelsAndStones: JewelsAndStones

    @Before
    fun initTest() {
        jewelsAndStones = JewelsAndStones()
    }

    @Test
    fun numJewelsInStones_Test01() {
        val j = "aA"
        val s = "aAAbbbb"
        val verify = 3

        val result = jewelsAndStones.numJewelsInStones(j, s)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun numJewelsInStones_Test02() {
        val j = "z"
        val s = "ZZ"
        val verify = 0

        val result = jewelsAndStones.numJewelsInStones(j, s)

        Assert.assertEquals(result, verify)
    }

}