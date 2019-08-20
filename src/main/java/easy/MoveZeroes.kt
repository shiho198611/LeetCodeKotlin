package easy

class MoveZeroes {

    fun moveZeroes(nums: IntArray): Unit {

        var zIndex = 0

        for(index in nums.indices) {

            if(nums[index] != 0) {
                val tmp = nums[index]
                nums[index] = nums[zIndex]
                nums[zIndex] = tmp

                zIndex++
            }

        }

    }

}