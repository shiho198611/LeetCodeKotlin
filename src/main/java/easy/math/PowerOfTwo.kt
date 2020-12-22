package easy.math

class PowerOfTwo {

    fun isPowerOfTwo(n: Int): Boolean {

        if(n == 1) return true
        if(n == 0) return false

        var result = n

        while (result % 2 == 0) {
            result /= 2
        }

        return result == 1
    }

}