package easy.math

import kotlin.math.min

class RangeAddition2 {

    fun maxCount(m: Int, n: Int, ops: Array<IntArray>): Int {

        var minA = m
        var minB = n

        for(i in ops.indices) {
            minA = min(ops[i][0], minA)
            minB = min(ops[i][1], minB)
        }

        return minA*minB
    }

    fun maxCountOrigin(m: Int, n: Int, ops: Array<IntArray>): Int {
        if(ops.isEmpty()) {
            return m*n
        }

        var minA = Int.MAX_VALUE
        var minB = Int.MAX_VALUE

        for(i in ops.indices) {

            if(ops[i][0] < minA) {
                minA = ops[i][0]
            }
            if(ops[i][1] < minB) {
                minB = ops[i][1]
            }

        }

        return minA*minB
    }

}