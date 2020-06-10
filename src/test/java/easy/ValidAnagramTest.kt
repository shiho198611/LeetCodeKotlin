package easy

import easy.hashtable.ValidAnagram
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ValidAnagramTest {

    lateinit var validAnagram: ValidAnagram

    @Before
    fun initTest() {
        validAnagram = ValidAnagram()
    }

    @Test
    fun validAnagram_Test01() {
        val s = "anagram"
        val t = "nagaram"

        val result = validAnagram.isAnagram(s, t)

        Assert.assertTrue(result)
    }

    @Test
    fun validAnagram_Test02() {
        val s = "rat"
        val t = "car"

        val result = validAnagram.isAnagram(s, t)

        Assert.assertTrue(!result)
    }

    @Test
    fun validAnagram_Test03() {
        val s = "aacc"
        val t = "ccac"

        val result = validAnagram.isAnagram(s, t)

        Assert.assertTrue(!result)
    }

}