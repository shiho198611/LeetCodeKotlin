package easy

import easy.hashtable.CountPrimes
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CountPrimesTest {

    lateinit var countPrimes: CountPrimes

    @Before
    fun initTest() {
        countPrimes = CountPrimes()
    }

    @Test
    fun countPrimes_Test01() {
        val result = countPrimes.countPrimes(10)
        val verify = 4

        Assert.assertEquals(result, verify)
    }

    @Test
    fun countPrimes_Test02() {
        val result = countPrimes.countPrimes(1)
        val verify = 0

        Assert.assertEquals(result, verify)
    }

    @Test
    fun countPrimes_Test03() {
        val result = countPrimes.countPrimes(2)
        val verify = 0

        Assert.assertEquals(result, verify)
    }

    @Test
    fun countPrimes_Test04() {
        val result = countPrimes.countPrimes(0)
        val verify = 0

        Assert.assertEquals(result, verify)
    }

    @Test
    fun countPrimes_Test05() {
        val result = countPrimes.countPrimes(499979)
        val verify = 41537

        Assert.assertEquals(result, verify)
    }

}