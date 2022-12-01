package easy.array

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class PlusOneTest {

    private lateinit var plusOne: PlusOne

    @Before
    fun initTest() {
        plusOne = PlusOne()
    }

    @Test
    fun testCase1() {
        val input = intArrayOf(1, 2, 3)
        val result = plusOne.plusOne(input)

        Assert.assertArrayEquals(result, intArrayOf(1, 2, 4))
    }

    @Test
    fun testCase2() {
        val input = intArrayOf(4, 3, 2, 1)
        val result = plusOne.plusOne(input)

        Assert.assertArrayEquals(result, intArrayOf(4, 3, 2, 2))
    }

    @Test
    fun testCase3() {
        val input = intArrayOf(9)
        val result = plusOne.plusOne(input)

        Assert.assertArrayEquals(result, intArrayOf(1, 0))
    }

    @Test
    fun testCase4() {
        val input = intArrayOf(9, 9)
        val result = plusOne.plusOne(input)

        Assert.assertArrayEquals(result, intArrayOf(1, 0, 0))
    }
}