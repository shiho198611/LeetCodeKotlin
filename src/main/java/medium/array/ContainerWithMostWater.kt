package medium.array

import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWater {

    /**
     * Hint: Two Pointer Approach
     * */
    fun maxArea(height: IntArray): Int {
        var result = 0
        var right = height.lastIndex
        var left = 0

        while (right > left) {
            val container = (right - left) * min(height[left], height[right])
            result = max(container, result)
            if(height[left] > height[right]) {
                right--
            }
            else {
                left++
            }
        }

        return result
    }

    fun maxAreaOrigin(height: IntArray): Int {

        var result = 0

        for(i in height.lastIndex downTo 0) {
            for (j in height.indices) {
                val container = (i-j) * min(height[i], height[j])
                result = max(container, result)
            }
        }

        return result
    }


}