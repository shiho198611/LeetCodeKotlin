package medium

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class String2IntegerAtoiTest {

    lateinit var atoi: String2IntegerAtoi

    @Before
    fun initTest() {
        atoi = String2IntegerAtoi()
    }

    @Test
    fun testExample01() {
        val result = atoi.myAtoi("42")
        assertEquals(result, 42)
    }

    @Test
    fun testExample02() {
        val result = atoi.myAtoi("   -42")
        assertEquals(result, -42)
    }

    @Test
    fun testExample03() {
        val result = atoi.myAtoi("4193 with words")
        assertEquals(result, 4193)
    }

    @Test
    fun testExample04() {
        val result = atoi.myAtoi("words and 987")
        assertEquals(result, 0)
    }

    @Test
    fun testExample05() {
        val result = atoi.myAtoi("-91283472332")
        assertEquals(result, -2147483648)
    }

    @Test
    fun testExample06() {
        val result = atoi.myAtoi("3.14159")
        assertEquals(result, 3)
    }

    @Test
    fun testExample07() {
        val result = atoi.myAtoi("-")
        assertEquals(result, 0)
    }

    @Test
    fun testExample08() {
        val result = atoi.myAtoi("2147483648")
        assertEquals(result, 2147483647)
    }

    @Test
    fun testExample09() {
        val result = atoi.myAtoi("20000000000000000000")
        assertEquals(result, 2147483647)
    }

    @Test
    fun testExample10() {
        val result = atoi.myAtoi("0-1")
        assertEquals(result, 0)
    }

    @Test
    fun testExample11() {
        val result = atoi.myAtoi("+1")
        assertEquals(result, 1)
    }

    @Test
    fun testExample12() {
        val result = atoi.myAtoi("  0000000000012345678")
        assertEquals(result, 12345678)
    }

    @Test
    fun testExample13() {
        val result = atoi.myAtoi("  -0000000000012345678")
        assertEquals(result, -12345678)
    }

    @Test
    fun testExample14() {
        val result = atoi.myAtoi("   00000000000-12345678")
        assertEquals(result, 0)
    }

    @Test
    fun testExample15() {
        val result = atoi.myAtoi("")
        assertEquals(result, 0)
    }

    @Test
    fun testExample16() {
        val result = atoi.myAtoi("-+1")
        assertEquals(result, 0)
    }

    @Test
    fun testExample17() {
        val result = atoi.myAtoi("  -0012a42")
        assertEquals(result, -12)
    }

    @Test
    fun testExample18() {
        val result = atoi.myAtoi("2147483646")
        assertEquals(result, 2147483646)
    }

    @Test
    fun testExample19() {
        val result = atoi.myAtoi("-5-")
        assertEquals(result, -5)
    }

    @Test
    fun testExapmle20() {
        val result = atoi.myAtoi("0  123")
        assertEquals(result, 0)
    }

//    @Test
//    fun testing() {
//        val result = atoi.myAtoi("-00012345678")
//
//        println(result)
//
////        assertEquals(result, 3)
//    }
//
//    @Test
//    fun testing2() {
//        val result = atoi.myAtoi("2019")
//
//        println(result)
//
////        assertEquals(result, 3)
//    }

}