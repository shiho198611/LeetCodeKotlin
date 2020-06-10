package easy.array

class RotateArray {
    fun rotate(nums: IntArray, k: Int): Unit {
        val tmpNums = Array(nums.size) {0}
        for(i in nums.indices) {
            tmpNums[(i+k)%nums.size] = nums[i]
        }

        for (i in nums.indices) {
            nums[i] = tmpNums[i]
        }
    }
}