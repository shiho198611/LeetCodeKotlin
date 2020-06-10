package easy.array

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MakeTwoArraysEqualReversingSubArraysTest {

    lateinit var makeTwo: MakeTwoArraysEqualReversingSubArrays

    @Before
    fun initTest() {
        makeTwo = MakeTwoArraysEqualReversingSubArrays()
    }

    @Test
    fun canBeEqual_Test01() {
        val target = intArrayOf(1, 2, 3, 4)
        val arr = intArrayOf(2, 4, 1, 3)

        Assert.assertTrue(makeTwo.canBeEqual(target, arr))
    }

    @Test
    fun canBeEqual_Test02() {
        val target = intArrayOf(7)
        val arr = intArrayOf(7)

        Assert.assertTrue(makeTwo.canBeEqual(target, arr))
    }

    @Test
    fun canBeEqual_Test03() {
        val target = intArrayOf(1, 12)
        val arr = intArrayOf(12, 1)

        Assert.assertTrue(makeTwo.canBeEqual(target, arr))
    }

    @Test
    fun canBeEqual_Test04() {
        val target = intArrayOf(3, 7, 9)
        val arr = intArrayOf(3, 7, 11)

        Assert.assertFalse(makeTwo.canBeEqual(target, arr))
    }

    @Test
    fun canBeEqual_Test05() {
        val target = intArrayOf(1, 1, 1, 1, 1)
        val arr = intArrayOf(1, 1, 1, 1, 1)

        Assert.assertTrue(makeTwo.canBeEqual(target, arr))
    }

    @Test
    fun canBeEqual_Test06() {
        val target = intArrayOf(1, 2, 3)
        val arr = intArrayOf(2, 2, 2)

        Assert.assertFalse(makeTwo.canBeEqual(target, arr))
    }

}