package easy.string

class ValidPalindrome {

    fun isPalindrome(s: String): Boolean {

        var left = 0
        var right = s.lastIndex

        while (right > left) {

            if (s[right].run { isDigit() || isLetter() } && !s[left].run { isDigit() || isLetter()}) {
                left++
            } else if (s[left].run { isDigit() || isLetter()} && !s[right].run { isDigit() || isLetter()}) {
                right--
            } else {
                if (s[right].run { isDigit() || isLetter() } && s[left].run { isDigit() || isLetter()}) {
                    if (s[right].toLowerCase() != s[left].toLowerCase()) {
                        return false
                    }
                }

                left++
                right--
            }

        }

        return true
    }

}