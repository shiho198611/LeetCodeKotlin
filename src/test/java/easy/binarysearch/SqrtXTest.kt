package easy.binarysearch

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SqrtXTest {

    lateinit var sqrtX: SqrtX

    @Before
    fun initTest() {
        sqrtX = SqrtX()
    }

    @Test
    fun mySqrt_Test01() {
        val input = 4
        val verify = 2

        val result = sqrtX.mySqrt(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun mySqrt_Test02() {
        val input = 8
        val verify = 2

        val result = sqrtX.mySqrt(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun mySqrt_Test03() {
        val input = 2
        val verify = 1

        val result = sqrtX.mySqrt(input)

        Assert.assertEquals(result, verify)
    }

    @Test
    fun mySqrt_Test04() {
        val input = 2147483647
        val verify = 46340

        val result = sqrtX.mySqrt(input)

        Assert.assertEquals(result, verify)
    }

}