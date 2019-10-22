package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class FirstUniqueCharacterInStringTest {

    lateinit var firstUniqueCharacterInString: FirstUniqueCharacterInString

    @Before
    fun initTest() {
        firstUniqueCharacterInString = FirstUniqueCharacterInString()
    }

    @Test
    fun firstUniqueCharacterInString_Test01() {
        val s = "leetcode"
        val verify = 0

        val result = firstUniqueCharacterInString.firstUniqChar(s)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun firstUniqueCharacterInString_Test02() {
        val s = "loveleetcode"
        val verify = 2

        val result = firstUniqueCharacterInString.firstUniqChar(s)

        Assert.assertEquals(result, verify)
    }
}