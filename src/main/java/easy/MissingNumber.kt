package easy

class MissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var sum = 0
        var total = 0

        for (i in nums.indices) {
            sum+=nums[i]
            total+=i
        }

        return (total+nums.size) - sum
    }
}