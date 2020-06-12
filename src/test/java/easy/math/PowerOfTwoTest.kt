package easy.math

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PowerOfTwoTest {

    lateinit var powerOfTwo: PowerOfTwo

    @Before
    fun initTest() {
        powerOfTwo = PowerOfTwo()
    }

    @Test
    fun isPowerOfTwo_Test01() {
        val input = 1
        val result = powerOfTwo.isPowerOfTwo(input)

        Assert.assertTrue(result)
    }

    @Test
    fun isPowerOfTwo_Test02() {
        val input = 16
        val result = powerOfTwo.isPowerOfTwo(input)

        Assert.assertTrue(result)
    }

    @Test
    fun isPowerOfTwo_Test03() {
        val input = 218
        val result = powerOfTwo.isPowerOfTwo(input)

        Assert.assertFalse(result)
    }

    @Test
    fun isPowerOfTwo_Test04() {
        val input = 0
        val result = powerOfTwo.isPowerOfTwo(input)

        Assert.assertFalse(result)
    }

    @Test
    fun isPowerOfTwo_Test05() {
        val input = 5
        val result = powerOfTwo.isPowerOfTwo(input)

        Assert.assertFalse(result)
    }

    @Test
    fun isPowerOfTwo_Test06() {
        val input = -16
        val result = powerOfTwo.isPowerOfTwo(input)

        Assert.assertFalse(result)
    }
}