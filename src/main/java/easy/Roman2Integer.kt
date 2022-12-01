package easy

class Roman2Integer {

    fun romanToInt(s: String): Int {

        val mapArray = Array(89){0}
        mapArray[73] = 1
        mapArray[86] = 5
        mapArray[88] = 10
        mapArray[76] = 50
        mapArray[67] = 100
        mapArray[68] = 500
        mapArray[77] = 1000

        var result = 0

        for(i in s.lastIndex downTo  0) {

            val value = mapArray[s[i].toInt()]

            if(value > result) {
                result += value
            } else {
                if(value == mapArray[s[i+1].toInt()]) {
                    result += value
                } else {
                    result -= value
                }
            }

        }

        return result
    }

}