package easy

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MoveZeroesTest {

    lateinit var moveZeroes: MoveZeroes

    @Before
    fun initTest() {
        moveZeroes = MoveZeroes()
    }

    @Test
    fun moveZeroes_Test01() {
        val nums = intArrayOf(0,1,0,3,12)
        val verify = intArrayOf(1,3,12,0,0)

        moveZeroes.moveZeroes(nums)

        Assert.assertArrayEquals(nums, verify)
    }

}