package easy.array

class PlusOne {

    fun plusOne(digits: IntArray): IntArray {

        digits[digits.lastIndex] += 1
        var result: IntArray? = null

        for(i in digits.lastIndex downTo 0) {

            if(digits[i]/10 == 0) {
                result = digits
            } else {
                digits[i] = 0
                if(i > 0) {
                    digits[i-1] += 1
                } else {
                    result = intArrayOf(1, *digits)
                }

            }
        }

        return result!!
    }

}