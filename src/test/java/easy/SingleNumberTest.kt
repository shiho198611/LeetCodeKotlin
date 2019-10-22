package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SingleNumberTest {

    lateinit var singleNumber: SingleNumber

    @Before
    fun initTest() {
        singleNumber = SingleNumber()
    }

    @Test
    fun singleNumber_Test01() {
        val input = intArrayOf(2,2,1)
        val verify = 1

        val result = singleNumber.singleNumber(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun singleNumber_Test02() {
        val input = intArrayOf(4,1,2,1,2)
        val verify = 4

        val result = singleNumber.singleNumber(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun singleNumber_Test03() {
        val input = intArrayOf(-1)
        val verify = -1

        val result = singleNumber.singleNumber(input)

        Assert.assertEquals(result, verify)
    }

}