package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SumOfTwoIntegersTest {

    lateinit var sumOfTwoIntegers: SumOfTwoIntegers

    @Before
    fun initTest() {
        sumOfTwoIntegers = SumOfTwoIntegers()
    }

    @Test
    fun sumOfTwoIntegers_Test01() {
        val a = 1
        val b = 2
        val verify = a + b

        val result = sumOfTwoIntegers.getSum(a, b)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun sumOfTwoIntegers_Test02() {
        val a = -2
        val b = 3
        val verify = a + b

        val result = sumOfTwoIntegers.getSum(a, b)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun sumOfTwoIntegers_Test03() {
        val a = 2
        val b = 3
        val verify = a + b

        val result = sumOfTwoIntegers.getSum(a, b)

        Assert.assertEquals(result, verify)
    }

}