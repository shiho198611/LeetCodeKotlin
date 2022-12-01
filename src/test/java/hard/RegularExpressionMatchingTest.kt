package hard

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RegularExpressionMatchingTest {

    private lateinit var matching: RegularExpressionMatching

    @Before
    fun initTest() {
        matching = RegularExpressionMatching()
    }

    @Test
    fun testExample01() {
        val result = matching.isMatch("aa", "a")
        Assert.assertFalse(result)
    }

    @Test
    fun testExample02() {
        val result = matching.isMatch("aa", "a*")
        Assert.assertTrue(result)
    }

    @Test
    fun testExample03() {
        val result = matching.isMatch("ab", ".*")
        Assert.assertTrue(result)
    }

    @Test
    fun testExample04() {
        val result = matching.isMatch("aab", "c*a*b")
        Assert.assertTrue(result)
    }

    @Test
    fun testExample05() {
        val result = matching.isMatch("mississippi", "mis*is*p*.")
        Assert.assertFalse(result)
    }

    @Test
    fun testExample06() {
        val result = matching.isMatch("ab", ".*c")
        Assert.assertFalse(result)
    }

    @Test
    fun testExample07() {
        val result = matching.isMatch("aaa", "aaaa")
        Assert.assertFalse(result)
    }

    @Test
    fun testExample08() {
        val result = matching.isMatch("aaa", "ab*a*c*a")
        Assert.assertTrue(result)
    }

}