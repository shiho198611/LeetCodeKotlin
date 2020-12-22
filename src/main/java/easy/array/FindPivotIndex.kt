package easy.array

class FindPivotIndex {

    fun pivotIndex(nums: IntArray): Int {

        var rightSum = nums.fold(0){acc: Int, i: Int -> acc+i }
        var result = -1
        var leftSum = 0

        for(inx in nums.indices) {

            rightSum -= nums[inx]

            if(leftSum == rightSum) {
                result = inx
                break
            }
            else {
                leftSum += nums[inx]
            }
        }

        return result
    }

}