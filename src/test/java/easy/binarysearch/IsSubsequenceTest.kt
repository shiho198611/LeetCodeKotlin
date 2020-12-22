package easy.binarysearch

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class IsSubsequenceTest {

    lateinit var isSubsequence: IsSubsequence

    @Before
    fun initTest() {
        isSubsequence = IsSubsequence()
    }

    @Test
    fun isSubsequence_Test01() {
        val s = "abc"
        val t = "ahbgdc"

        val result = isSubsequence.isSubsequence(s, t)

        Assert.assertTrue(result)
    }

    @Test
    fun isSubsequence_Test02() {
        val s = "axc"
        val t = "ahbgdc"

        val result = isSubsequence.isSubsequence(s, t)

        Assert.assertFalse(result)
    }

    @Test
    fun isSubsequence_Test03() {
        val s = ""
        val t = "ahbgdc"

        val result = isSubsequence.isSubsequence(s, t)

        Assert.assertTrue(result)
    }

}