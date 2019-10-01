package easy

class CountAndSay {

    fun countAndSay(n: Int): String {

        var result = "1"

        for(index in 2 until (n+1)) {

            var tmp = '0'
            var tmpCnt = 0
            var rTmp = ""

            for(index in result.indices) {
                if(result[index] != tmp) {
                    tmp = result[index]
                    tmpCnt++
                    rTmp += (tmpCnt.toString()+tmp.toString())
                }

                result = rTmp

            }

        }

        return result

    }

}