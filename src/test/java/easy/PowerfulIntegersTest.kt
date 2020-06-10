package easy

import easy.hashtable.PowerfulIntegers
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PowerfulIntegersTest {

    lateinit var powerfulIntegers: PowerfulIntegers

    @Before
    fun initTest() {
        powerfulIntegers = PowerfulIntegers()
    }

    @Test
    fun powerfulIntegers_Test01() {
        val x = 2
        val y = 3
        val bound = 10

        val verify = listOf(2,3,4,5,7,9,10)
        val result = powerfulIntegers.powerfulIntegers(x, y, bound)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun powerfulIntegers_Test02() {
        val x = 3
        val y = 5
        val bound = 15

        val verify = listOf(2,4,6,8,10,14)
        val result = powerfulIntegers.powerfulIntegers(x, y, bound)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun powerfulIntegers_Test03() {
        val x = 2
        val y = 1
        val bound = 10

        val verify = listOf(9,2,3,5)
        val result = powerfulIntegers.powerfulIntegers(x, y, bound)

        Assert.assertEquals(result.sorted(), verify.sorted())
    }

    @Test
    fun powerfulIntegers_Test04() {
        val x = 1
        val y = 1
        val bound = 0

        val verify = emptyList<Int>()
        val result = powerfulIntegers.powerfulIntegers(x, y, bound)

        Assert.assertEquals(result.sorted(), verify.sorted())
    }

    @Test
    fun powerfulIntegers_Test05() {
        val x = 1
        val y = 1
        val bound = 1

        val verify = emptyList<Int>()
        val result = powerfulIntegers.powerfulIntegers(x, y, bound)

        Assert.assertEquals(result.sorted(), verify.sorted())
    }

    @Test
    fun powerfulIntegers_Test06() {
        val x = 1
        val y = 1
        val bound = 100000

        val verify = listOf<Int>(2)
        val result = powerfulIntegers.powerfulIntegers(x, y, bound)

        Assert.assertEquals(result.sorted(), verify.sorted())
    }

}