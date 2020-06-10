package easy.array

class AddToArrayFormOfInteger {
    fun addToArrayForm(A: IntArray, K: Int): List<Int> {

        val result = mutableListOf<Int>()

        var index = A.size
        var tmpK = K

        while (index > 0 || tmpK > 0) {

            --index

            if(index >= 0) {
                tmpK += A[index]
            }

            result.add(tmpK % 10)
            tmpK /= 10
        }

        result.reverse()

        return result
    }
}