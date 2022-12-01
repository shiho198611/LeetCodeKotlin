package easy.math

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PalindromeNumberTest {

    private lateinit var palindromeNumber: PalindromeNumber

    @Before
    fun initTest() {
        palindromeNumber = PalindromeNumber()
    }

    @Test
    fun testCase1() {
        val input = 121
        val result = palindromeNumber.isPalindrome(input)

        Assert.assertTrue(result)
    }

    @Test
    fun testCase2() {
        val input = -121
        val result = palindromeNumber.isPalindrome(input)

        Assert.assertFalse(result)
    }

    @Test
    fun testCase3() {
        val input = 10
        val result = palindromeNumber.isPalindrome(input)

        Assert.assertFalse(result)
    }
}