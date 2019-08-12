package easy

class CountPrimes {
    fun countPrimes(n: Int): Int {

        if(n < 3) {
            return 0
        }

        val marks = BooleanArray(n)
        var result = n-2

        run loop@ {
            for(i in 2..n) {
                run loopIn@ {
                    for(j in 2..n) {
                        if(i*j >= n) {
                            return@loopIn
                        }
                        else {
                            if(!marks[i*j]) {
                                --result
                                marks[i*j] = true
                            }
                        }
                    }
                }

                if(i*i >= n) {
                    return@loop
                }
            }
        }

        return result
    }

}