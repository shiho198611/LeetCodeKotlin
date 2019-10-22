package easy

class SumOfTwoIntegers {

    fun getSum(a: Int, b: Int): Int {
        var aDigit = a
        var bDigit = b
        while (bDigit != 0) {
            val c = aDigit and bDigit
            aDigit = aDigit xor bDigit
            bDigit = c shl 1
        }
        return aDigit
    }
}