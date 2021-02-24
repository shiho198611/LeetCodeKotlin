package easy.array

class SumOfUniqueElements {

    fun sumOfUnique(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]

        val mapArray = Array(101){0}
        for(index in nums) {
            mapArray[index] += 1
        }

        var result = 0
        mapArray.forEachIndexed { index, value ->
            if(value == 1) {
                result += index
            }
        }

        return result
    }

}