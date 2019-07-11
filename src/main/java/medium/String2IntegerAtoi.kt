package medium

class String2IntegerAtoi {

    fun myAtoi(str: String): Int {

        var sum = 0L
        var sign = 1
        var isCalcute = false
        var check = 0

        run digitLoop@ {
            for (it in str) {

                if(isCalcute && !it.isDigit()) {
                    return@digitLoop
                }


                if(it == '-') {
                    if(check > 0) {
                        return@digitLoop
                    }
                    isCalcute = true
                    sign = -1

                    continue
                }
                else if(it == '+') {
                    if(check > 0) {
                        return@digitLoop
                    }
                    isCalcute = true

                    continue
                }
                else if(it == ' ') {
                    if(check > 0) {
                        return@digitLoop
                    }
                    continue
                }
                else if(it.isDigit()) {
                    check++
                    sum = sum * 10 + (it - '0')
                    if(sum > Int.MAX_VALUE) {
                        if(sign == 1) {
                            return Int.MAX_VALUE
                        }
                        else {
                            return Int.MIN_VALUE
                        }
                    }
                }
                else {
                    return@digitLoop
                }

            }
        }

        return (sum * sign).toInt()
    }

}