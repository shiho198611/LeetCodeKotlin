package easy.string

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LongestCommonPrefixTest {

    lateinit var longestCommonPrefix: LongestCommonPrefix

    @Before
    fun initTest() {
        longestCommonPrefix = LongestCommonPrefix()
    }

    @Test
    fun longestCommonPrefix_Test01() {
        val input = arrayOf("flower", "flow", "flight")
        val verify = "fl"

        val result = longestCommonPrefix.longestCommonPrefix(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun longestCommonPrefix_Test02() {
        val input = arrayOf("dog", "racecar", "car")
        val verify = ""

        val result = longestCommonPrefix.longestCommonPrefix(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun longestCommonPrefix_Test03() {
        val input = arrayOf("a")
        val verify = "a"

        val result = longestCommonPrefix.longestCommonPrefix(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun longestCommonPrefix_Test04() {
        val input = arrayOf("c", "c")
        val verify = "c"

        val result = longestCommonPrefix.longestCommonPrefix(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun longestCommonPrefix_Test05() {
        val input = arrayOf("aa", "aa")
        val verify = "aa"

        val result = longestCommonPrefix.longestCommonPrefix(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun longestCommonPrefix_Test06() {
        val input = arrayOf("aa", "ab")
        val verify = "a"

        val result = longestCommonPrefix.longestCommonPrefix(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun longestCommonPrefix_Test07() {
        val input = arrayOf("a", "a", "b")
        val verify = ""

        val result = longestCommonPrefix.longestCommonPrefix(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun longestCommonPrefix_Test08() {
        val input = arrayOf("aaa", "aa", "aaa")
        val verify = "aa"

        val result = longestCommonPrefix.longestCommonPrefix(input)

        Assert.assertEquals(result, verify)
    }
}