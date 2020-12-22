package medium

import medium.array.ContainerWithMostWater
import org.junit.Assert
import org.junit.Test


class ContainerWithMostWaterTest {

    private val containerWithMostWater = ContainerWithMostWater()

    @Test
    fun maxArea_Test01() {
        val input = intArrayOf(1,8,6,2,5,4,8,3,7)
        val verify = 49
        val result = containerWithMostWater.maxArea(input)

        Assert.assertEquals(verify, result)
    }

}