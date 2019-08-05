package hard

import com.sun.tools.javac.util.Assert
import org.junit.Before
import org.junit.Test

class RegularExpressionMatchingTest {

    lateinit var matching: RegularExpressionMatching

    @Before
    fun initTest() {
        matching = RegularExpressionMatching()
    }

    @Test
    fun testExample01() {
        val result = matching.isMatch("aa", "a")
        Assert.check(!result)
    }

    @Test
    fun testExample02() {
        val result = matching.isMatch("aa", "a*")
        Assert.check(result)
    }

    @Test
    fun testExample03() {
        val result = matching.isMatch("ab", ".*")
        Assert.check(result)
    }

    @Test
    fun testExample04() {
        val result = matching.isMatch("aab", "c*a*b")
        Assert.check(result)
    }

    @Test
    fun testExample05() {
        val result = matching.isMatch("mississippi", "mis*is*p*.")
        Assert.check(!result)
    }

    @Test
    fun testExample06() {
        val result = matching.isMatch("ab", ".*c")
        Assert.check(!result)
    }

    @Test
    fun testExample07() {
        val result = matching.isMatch("aaa", "aaaa")
        Assert.check(!result)
    }

    @Test
    fun testExample08() {
        val result = matching.isMatch("aaa", "ab*a*c*a")
        Assert.check(result)
    }

}