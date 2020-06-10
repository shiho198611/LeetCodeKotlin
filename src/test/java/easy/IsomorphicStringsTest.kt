package easy

import easy.hashtable.IsomorphicStrings
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class IsomorphicStringsTest {

    lateinit var isomorphicStrings: IsomorphicStrings

    @Before
    fun initTest() {
        isomorphicStrings = IsomorphicStrings()
    }

    @Test
    fun isomorphicStrings_Test01() {
        val s = "egg"
        val t = "add"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertTrue(result)
    }

    @Test
    fun isomorphicStrings_Test02() {
        val s = "foo"
        val t = "bar"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertFalse(result)
    }

    @Test
    fun isomorphicStrings_Test03() {
        val s = "paper"
        val t = "title"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertTrue(result)
    }

    @Test
    fun isomorphicStrings_Test04() {
        val s = "ab"
        val t = "aa"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertFalse(result)
    }

    @Test
    fun isomorphicStrings_Test05() {
        val s = ""
        val t = ""

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertTrue(result)
    }

    @Test
    fun isomorphicStrings_Test06() {
        val s = "a"
        val t = "a"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertTrue(result)
    }

    @Test
    fun isomorphicStrings_Test07() {
        val s = "ab"
        val t = "ac"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertTrue(result)
    }

    @Test
    fun isomorphicStrings_Test08() {
        val s = "abc"
        val t = "def"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertTrue(result)
    }

    @Test
    fun isomorphicStrings_Test09() {
        val s = "aa"
        val t = "ab"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertFalse(result)
    }

    @Test
    fun isomorphicStrings_Test10() {
        val s = "aab"
        val t = "aaa"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertFalse(result)
    }

    @Test
    fun isomorphicStrings_Test11() {
        val s = "aba"
        val t = "baa"

        val result = isomorphicStrings.isIsomorphic(s, t)

        Assert.assertFalse(result)
    }

}