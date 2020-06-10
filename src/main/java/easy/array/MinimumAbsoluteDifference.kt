package easy.array

class MinimumAbsoluteDifference {

    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {

        arr.sort()

        var min = Int.MAX_VALUE
        for(index in 0 until arr.lastIndex) {
            val abs = Math.abs(arr[index] - arr[index + 1])
            if(abs < min) {
                min = abs
            }
        }

        val map = mutableMapOf<Int, Int>()
        val result = mutableListOf<List<Int>>()

        for(index in arr.indices) {

            val tmp = map[arr[index]]

            map[arr[index] + min] = arr[index]
            map[arr[index] - min] = arr[index]

            if(tmp != null) {
                result.add(listOf(tmp, arr[index]))
            }
        }

        return result
    }

}