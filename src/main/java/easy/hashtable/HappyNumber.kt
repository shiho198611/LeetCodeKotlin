package easy.hashtable

import kotlin.math.pow

class HappyNumber {
    fun isHappy(n: Int): Boolean {

        val repeatSet = HashSet<Int>()
        var tmp = n

        while (true) {

            var sum = 0
            while (tmp != 0) {
                sum += ((tmp % 10).toDouble().pow(2).toInt())
                tmp /= 10
            }

            if(sum == 1) {
                return true
            }
            else {
                if(repeatSet.contains(sum)) {
                    return false
                } else {
                    repeatSet.add(sum)
                    tmp = sum
                }
            }
        }
    }

}