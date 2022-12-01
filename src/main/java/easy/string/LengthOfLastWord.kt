package easy.string

class LengthOfLastWord {

    fun lengthOfLastWord(s: String): Int {

        var result = 0

        for(i in s.lastIndex downTo 0) {
            if(s[i] == ' ') {
                if(result > 0) {
                    break
                }
            } else {
                result++
            }
        }

        return result
    }

}