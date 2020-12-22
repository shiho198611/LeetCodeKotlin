package easy.binarysearch

class BinarySearch {

    fun search(nums: IntArray, target: Int): Int {

        var right = nums.lastIndex
        var left = 0

        while (left <= right) {
            val half = left + (right - left) / 2

            if (nums[half] == target) {
                return half
            }

            if (nums[half] > target) {
                right = half - 1
            } else {
                left = half + 1
            }
        }

        return -1
    }

}