package easy

class SplitStringBalancedStrings {
    fun balancedStringSplit(s: String): Int {

        var result = 0
        var tmp = 0

        for(it in s) {
            if(it.toInt() == 82) tmp++
            else tmp--
            if(tmp == 0) result++
        }

        return result
    }
}