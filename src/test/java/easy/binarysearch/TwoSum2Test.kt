package easy.binarysearch

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TwoSum2Test {

    lateinit var twoSum2: TwoSum2

    @Before
    fun initTest() {
        twoSum2 = TwoSum2()
    }

    @Test
    fun twoSum_Test01() {
        val input = intArrayOf(2, 7, 11, 15)
        val target = 9
        val verify = intArrayOf(1, 2)

        val result = twoSum2.twoSum(input, target)

        Assert.assertArrayEquals(result, verify)
    }

    @Test
    fun twoSum_Test02() {
        val input = intArrayOf(2, 7, 11, 15)
        val target = 17
        val verify = intArrayOf(1, 4)

        val result = twoSum2.twoSum(input, target)

        Assert.assertArrayEquals(result, verify)
    }

    @Test
    fun twoSum_Test03() {
        val input = intArrayOf(1, 2, 3, 4, 4, 9, 56, 90)
        val target = 8
        val verify = intArrayOf(4, 5)

        val result = twoSum2.twoSum(input, target)

        Assert.assertArrayEquals(result, verify)
    }

    @Test
    fun twoSum_Test04() {
        val input = intArrayOf(1, 2, 3, 3, 4, 4, 9, 56, 90)
        val target = 8
        val verify = intArrayOf(5, 6)

        val result = twoSum2.twoSum(input, target)

        Assert.assertArrayEquals(result, verify)
    }

    @Test
    fun twoSum_Test05() {
        val input = intArrayOf(0, 0, 3, 4)
        val target = 0
        val verify = intArrayOf(1, 2)

        val result = twoSum2.twoSum(input, target)

        Assert.assertArrayEquals(result, verify)
    }

}