package easy.string

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ValidPalindromeTest {

    private lateinit var validPalindrome: ValidPalindrome

    @Before
    fun initTest() {
        validPalindrome = ValidPalindrome()
    }

    @Test
    fun testCase1() {
        val input = "A man, a plan, a canal: Panama"
        val result = validPalindrome.isPalindrome(input)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase2() {
        val input = "race a car"
        val result = validPalindrome.isPalindrome(input)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase3() {
        val input = " "
        val result = validPalindrome.isPalindrome(input)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase4() {
        val input = "0P"
        val result = validPalindrome.isPalindrome(input)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase5() {
        val input = "a."
        val result = validPalindrome.isPalindrome(input)

        Assert.assertTrue(result)
    }
}