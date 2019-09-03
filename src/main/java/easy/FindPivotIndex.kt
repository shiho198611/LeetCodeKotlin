package easy

class FindPivotIndex {

    fun pivotIndex(nums: IntArray): Int {

        if(nums.isEmpty()) {
            return -1
        }

        var leftIndex = 0
        var rightIndex = nums.size - 1

        var leftSum = nums[0]
        var rightSum = nums[nums.size - 1]

        while (leftIndex < rightIndex) {

            if(leftSum > rightSum) {
                rightIndex--
                rightSum += nums[rightIndex]
            }
            else {
                leftIndex++
                leftSum += nums[leftIndex]
            }
        }

        if(leftSum == rightSum) {
            return leftIndex
        }

        return -1
    }

}