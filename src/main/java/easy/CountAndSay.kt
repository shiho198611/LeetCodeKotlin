package easy

class CountAndSay {

    fun countAndSay(n: Int): String {

        var result = "1"

        for(cnt in 2 until (n+1)) {

            var tmp = '0'
            var tmpCnt = 0
            var rTmp = StringBuilder()

            for(digit in result) {
                if(digit != tmp) {
                    if(tmp != '0') {
                        rTmp.append(tmpCnt).append(tmp)
                        tmpCnt = 0
                    }
                    tmp = digit
                    tmpCnt++
                }
                else{
                    tmpCnt++
                }
            }

            rTmp.append(tmpCnt).append(tmp)
            result = rTmp.toString()
        }

        return result

    }

}