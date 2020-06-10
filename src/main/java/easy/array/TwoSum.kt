package easy.array

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {

        val tag = mutableMapOf<Int, Int>()
        for ((index, num) in nums.withIndex()) {
            if(tag.containsKey(num)) {
                return intArrayOf(tag.getValue(num), index)
            }
            else {
                tag[target - num] = index
            }
        }

        return intArrayOf()
    }

}