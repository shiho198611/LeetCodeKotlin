package easy.array

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class FibonacciNumberTest {

    lateinit var fibonacciNumber: FibonacciNumber

    @Before
    fun initTest() {
        fibonacciNumber = FibonacciNumber()
    }

    @Test
    fun fibTestCase01() {
        val result = fibonacciNumber.fib(2)
        val verify = 1

        Assert.assertEquals(result, verify)
    }

    @Test
    fun fibTestCase02() {
        val result = fibonacciNumber.fib(3)
        val verify = 2

        Assert.assertEquals(result, verify)
    }

    @Test
    fun fibTestCase03() {
        val result = fibonacciNumber.fib(4)
        val verify = 3

        Assert.assertEquals(result, verify)
    }

}