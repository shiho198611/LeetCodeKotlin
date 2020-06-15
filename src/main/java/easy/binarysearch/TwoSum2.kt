package easy.binarysearch

class TwoSum2 {

    fun twoSum(numbers: IntArray, target: Int): IntArray {

        var left = 0
        var right = numbers.lastIndex

        while (left <= right) {
            val sum = numbers[left] + numbers[right]
            if (sum == target) {
                break
            } else if(sum > target) {
                right--
            } else {
                left++
            }
        }

        return intArrayOf(left + 1, right + 1)
    }

    fun twoSumOrigin(numbers: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        numbers.forEachIndexed { index, it ->
            if (map.containsKey(it)) {
                return intArrayOf(map[it]!! + 1, index + 1)
            } else {
                map[target - it] = index
            }
        }
        return intArrayOf()
    }

}