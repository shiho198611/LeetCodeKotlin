package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ValidParenthesesTest {

    lateinit var validParentheses: ValidParentheses

    @Before
    fun initTest() {
        validParentheses = ValidParentheses()
    }

    @Test
    fun validParentheses_Test01() {
        val input = "()"
        val result = validParentheses.isValid(input)

        Assert.assertTrue(result)
    }

    @Test
    fun validParentheses_Test02() {
        val input = "()[]{}"
        val result = validParentheses.isValid(input)

        Assert.assertTrue(result)
    }

    @Test
    fun validParentheses_Test03() {
        val input = "(]"
        val result = validParentheses.isValid(input)

        Assert.assertFalse(result)
    }

    @Test
    fun validParentheses_Test04() {
        val input = "([)]"
        val result = validParentheses.isValid(input)

        Assert.assertFalse(result)
    }

    @Test
    fun validParentheses_Test05() {
        val input = "{[]}"
        val result = validParentheses.isValid(input)

        Assert.assertTrue(result)
    }

    @Test
    fun validParentheses_Test06() {
        val input = "]}"
        val result = validParentheses.isValid(input)

        Assert.assertFalse(result)
    }

    @Test
    fun validParentheses_Test07() {
        val input = ""
        val result = validParentheses.isValid(input)

        Assert.assertTrue(result)
    }

    @Test
    fun validParentheses_Test08() {
        val input = "["
        val result = validParentheses.isValid(input)

        Assert.assertFalse(result)
    }
}