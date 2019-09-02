package easy

import kotlin.math.pow

class PowerfulIntegers {

    fun powerfulIntegers(x: Int, y: Int, bound: Int): List<Int> {

        val result = HashSet<Int>()

        val xPowSet = mutableListOf<Double>()
        val yPowSet = HashSet<Double>()

        var tmpPowY = 1.0
        var yIndex = 0

        run loopY@ {
            while (tmpPowY < bound) {
                tmpPowY = y.toDouble().pow(yIndex)

                yPowSet.add(tmpPowY)
                yIndex++
                if(y == 1) {
                    return@loopY
                }
            }
        }

        var tmpPowX = 1.0
        var xIndex = 0

        run loopX@ {
            while (tmpPowX < bound) {
                tmpPowX = x.toDouble().pow(xIndex)
                xPowSet.add(tmpPowX)
                xIndex++
                if(x == 1) {
                    return@loopX
                }
            }
        }

        for(index in xPowSet.indices) {
            val itr = yPowSet.iterator()
            while (itr.hasNext()) {
                val sum = xPowSet[index] + itr.next()
                if(sum <= bound) {
                    result.add(sum.toInt())
                }
            }
        }

        return result.toList()
    }

}