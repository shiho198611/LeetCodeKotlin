package easy

import easy.math.RangeAddition2
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class RangeAddition2Test {

    lateinit var rangeAddition2: RangeAddition2

    @Before
    fun initTest() {
        rangeAddition2 = RangeAddition2()
    }

    @Test
    fun rangeAddition2_Test01() {
        val m = 3
        val n = 3
        val ops = arrayOf(intArrayOf(2, 2), intArrayOf(3, 3))
        val verify = 4

        val result = rangeAddition2.maxCount(m, n, ops)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun rangeAddition2_Test02() {
        val m = 3
        val n = 3
        val ops = arrayOf(intArrayOf(2, 1), intArrayOf(1, 2), intArrayOf(3, 3))
        val verify = 1

        val result = rangeAddition2.maxCount(m, n, ops)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun rangeAddition2_Test03() {
        val m = 3
        val n = 3
        val ops = emptyArray<IntArray>()
        val verify = 9

        val result = rangeAddition2.maxCount(m, n, ops)

        Assert.assertEquals(result, verify)
    }

}