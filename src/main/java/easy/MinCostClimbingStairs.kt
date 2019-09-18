package easy

import kotlin.math.min

class MinCostClimbingStairs {

    fun minCostClimbingStairs(cost: IntArray): Int {

        var f1 = 0
        var f2 = 0

        for(index in cost.size - 1 downTo 0) {
            val f = cost[index] + min(f1, f2)
            f2 = f1
            f1 = f
        }
        return min(f1, f2)

    }

}