package easy

class RemoveDuplicatesFromSortedArray {

    fun removeDuplicates(nums: IntArray): Int {
        var lastNum = 0
        var lastIndex = 0

        nums.forEachIndexed { index, it ->
            if(lastIndex == 0) {
                lastNum = it
                lastIndex ++
            }
            if(it > lastNum) {
                lastNum = it

                nums[index] = nums[lastIndex]
                nums[lastIndex] = it

                lastIndex++
            }
        }

        return lastIndex
    }
}