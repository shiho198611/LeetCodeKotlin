package easy.binarysearch

class SearchInsertPosition {

    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {

            val mid = (left + right)/2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> left = mid + 1
                else -> right = mid - 1
            }
        }
        return left
    }

    fun searchInsertOrigin(nums: IntArray, target: Int): Int {
        for(index in nums.indices) {
            if(target <= nums[index]) {
                return index
            }
        }
        return nums.size
    }

}