package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CountAndSayTest {

    lateinit var countAndSay: CountAndSay

    @Before
    fun initTest() {
        countAndSay = CountAndSay()
    }

    @Test
    fun countAndSay_Test01() {
        val input = 1
        val verify = "1"

        val result = countAndSay.countAndSay(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun countAndSay_Test02() {
        val input = 4
        val verify = "1211"

        val result = countAndSay.countAndSay(input)

        Assert.assertEquals(result, verify)
    }

}