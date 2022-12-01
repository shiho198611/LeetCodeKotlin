package easy.string

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LengthOfLastWordTest {

    private lateinit var lengthOfLastWord: LengthOfLastWord

    @Before
    fun initTest() {
        lengthOfLastWord = LengthOfLastWord()
    }

    @Test
    fun testCase1() {
        val input = "Hello World"
        val result = lengthOfLastWord.lengthOfLastWord(input)

        Assert.assertEquals(result, 5)
    }

    @Test
    fun testCase2() {
        val input = "   fly me   to   the moon  "
        val result = lengthOfLastWord.lengthOfLastWord(input)

        Assert.assertEquals(result, 4)
    }

    @Test
    fun testCase3() {
        val input = "luffy is still joyboy"
        val result = lengthOfLastWord.lengthOfLastWord(input)

        Assert.assertEquals(result, 6)
    }

}