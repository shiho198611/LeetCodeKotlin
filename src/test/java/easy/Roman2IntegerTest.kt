package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * */
class Roman2IntegerTest {

    private lateinit var roman2Integer: Roman2Integer

    @Before
    fun initTest() {
        roman2Integer = Roman2Integer()
    }

    @Test
    fun testCase1() {
        val input = "III"
        val result = roman2Integer.romanToInt(input)

        Assert.assertEquals(result, 3)
    }

    @Test
    fun testCase2() {
        val input = "LVIII"
        val result = roman2Integer.romanToInt(input)

        Assert.assertEquals(result, 58)
    }

    @Test
    fun testCase3() {
        val input = "MCMXCIV"
        val result = roman2Integer.romanToInt(input)

        Assert.assertEquals(result, 1994)
    }

    @Test
    fun testCase4() {
        val input = "MMCMXCIV"
        val result = roman2Integer.romanToInt(input)

        Assert.assertEquals(result, 2994)
    }
}