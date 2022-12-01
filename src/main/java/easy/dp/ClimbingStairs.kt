package easy.dp

class ClimbingStairs {

    fun climbStairs(n: Int): Int {

        var n1 = 1
        var n2 = 1
        var times = n - 1

        while (times > 0) {
            val sum = n2 + n1
            n1 = n2
            n2 = sum
            times--
        }

        return n2
    }

}