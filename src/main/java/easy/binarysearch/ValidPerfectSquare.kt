package easy.binarysearch

class ValidPerfectSquare {

    fun isPerfectSquare(num: Int): Boolean {

        for (i in 1..65536) {
            val sum = i * i
            if (sum == num) {
                return true
            } else if (sum > num) {
                return false
            }
        }

        return false
    }

}