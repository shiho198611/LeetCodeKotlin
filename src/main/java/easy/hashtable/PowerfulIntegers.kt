package easy.hashtable

import kotlin.math.pow

class PowerfulIntegers {

    fun powerfulIntegers(x: Int, y: Int, bound: Int): List<Int> {

        val result = HashSet<Int>()

        val xPowSet = mutableListOf<Double>()
        val yPowSet = HashSet<Double>()

        val dX = x.toDouble()
        val dY = y.toDouble()

        run loopY@ {
            for(yInx in 0..19) {
                val yPow = dY.pow(yInx)
                if(yPow <= bound) {
                    yPowSet.add(yPow)
                }
                else {
                    return@loopY
                }
            }
        }

        run loopX@ {
            for(xInx in 0..19) {
                val xPow = dX.pow(xInx)
                if(xPow <= bound) {
                    xPowSet.add(xPow)
                }
                else {
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