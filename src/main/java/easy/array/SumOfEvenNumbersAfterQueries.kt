package easy.array

class SumOfEvenNumbersAfterQueries {
    fun sumEvenAfterQueries(A: IntArray, queries: Array<IntArray>): IntArray {

        val result = IntArray(A.size)
        var sum = A.filter { it%2 == 0 }.fold(0){acc, i -> acc+i}

        queries.forEachIndexed { index, ints ->

            val aIndex = ints[1]
            val change = ints[0]

            var itemSum = A[aIndex] + change

            if(A[aIndex] % 2 == 0) {
                sum -= A[aIndex]
            }

            if(itemSum % 2 == 0) {
                sum += itemSum
            }

            A[aIndex] += change

            result[index] = sum
        }

        return result
    }
}