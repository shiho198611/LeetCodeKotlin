package easy.dp

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PascalTriangle2Test {

    private lateinit var pascalTriangle2: PascalTriangle2

    @Before
    fun initTest() {
        pascalTriangle2 = PascalTriangle2()
    }

    @Test
    fun testCase1() {
        val result = pascalTriangle2.getRow(3)
        val expect = intArrayOf(1, 3, 3, 1)

        Assert.assertArrayEquals(expect, result.toIntArray())
    }

    @Test
    fun testCase2() {
        val result = pascalTriangle2.getRow(0)
        val expect = intArrayOf(1)

        Assert.assertArrayEquals(expect, result.toIntArray())
    }

    @Test
    fun testCase3() {
        val result = pascalTriangle2.getRow(1)
        val expect = intArrayOf(1, 1)

        Assert.assertArrayEquals(expect, result.toIntArray())
    }
}