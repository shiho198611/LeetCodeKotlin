package easy.math

class AddDigits {
    fun addDigits(num: Int): Int {

        if(num < 10) {
            return num
        }

        var digit = num
        var result = 0

        while (digit / 10 > 0) {
            result = 0
            while (digit != 0) {
                result += digit % 10
                digit /= 10
            }
            digit = result
        }

        return result
    }

    fun addDigitsFaster(num: Int): Int {
        return (num - 1) % 9 + 1
    }

}