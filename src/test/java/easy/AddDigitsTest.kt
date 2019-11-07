package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class AddDigitsTest {

    lateinit var addDigits: AddDigits

    @Before
    fun initTest() {
        addDigits = AddDigits()
    }

    @Test
    fun addDigits_Test01() {
        val input = 38
        val verify = 2

        val result = addDigits.addDigits(input)

        Assert.assertEquals(verify, result)
    }

    @Test
    fun addDigits_Test02() {
        val input = 1
        val verify = 1

        val result = addDigits.addDigits(input)

        Assert.assertEquals(verify, result)
    }

}