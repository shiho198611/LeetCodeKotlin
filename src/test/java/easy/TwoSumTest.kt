package easy

import easy.array.TwoSum
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TwoSumTest {

    lateinit var twoSum: TwoSum

    @Before
    fun initTest() {
        twoSum = TwoSum()
    }

    @Test
    fun twoSum_Test01() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val verify = intArrayOf(0, 1)

        val result = twoSum.twoSum(nums, target)

        Assert.assertArrayEquals(result, verify)
    }

}