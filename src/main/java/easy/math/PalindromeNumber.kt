package easy.math

class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {
        var xBottom2Top = 0
        var xTop2Bottom = x

        while (xTop2Bottom > 0) {
            xBottom2Top *= 10
            xBottom2Top += xTop2Bottom % 10
            xTop2Bottom /= 10
        }

        return xBottom2Top == x
    }

}