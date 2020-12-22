package easy.binarysearch

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ValidPerfectSquareTest {

    lateinit var validPerfectSquare: ValidPerfectSquare

    @Before
    fun initTest() {
        validPerfectSquare = ValidPerfectSquare()
    }

    @Test
    fun isPerfectSquare_Test01() {
        val num = 16
        val result = validPerfectSquare.isPerfectSquare(num)

        Assert.assertTrue(result)
    }

    @Test
    fun isPerfectSquare_Test02() {
        val num = 14
        val result = validPerfectSquare.isPerfectSquare(num)

        Assert.assertFalse(result)
    }

    @Test
    fun isPerfectSquare_Test03() {
        val num = 1
        val result = validPerfectSquare.isPerfectSquare(num)

        Assert.assertTrue(result)
    }

    @Test
    fun isPerfectSquare_Test04() {
        val num = 9
        val result = validPerfectSquare.isPerfectSquare(num)

        Assert.assertTrue(result)
    }
}