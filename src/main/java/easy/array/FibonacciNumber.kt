package easy.array

class FibonacciNumber {

    fun fib(N: Int): Int {

        return when (N) {
            0 -> 0
            1 -> 1
            else -> {
                fib(N - 1) + fib(N - 2)
            }
        }

    }

}