package easy

import easy.hashtable.HappyNumber
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class HappyNumberTest {

    lateinit var happyNumber: HappyNumber

    @Before
    fun initTest() {
        happyNumber = HappyNumber()
    }

    @Test
    fun happyNumber_Test01() {
        val num = 19
        val result = happyNumber.isHappy(num)

        Assert.assertTrue(result)
    }

    @Test
    fun happyNumber_Test02() {
        val num = 18
        val result = happyNumber.isHappy(num)

        Assert.assertFalse(result)
    }

    @Test
    fun happyNumber_Test03() {
        val num = 156
        val result = happyNumber.isHappy(num)

        Assert.assertFalse(result)
    }

    @Test
    fun happyNumber_Test04() {
        val num = 0
        val result = happyNumber.isHappy(num)

        Assert.assertFalse(result)
    }
}