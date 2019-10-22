package easy

class SingleNumber {

    fun singleNumber(nums: IntArray): Int {

        var result = 0
        for(item in nums) {
            result = result xor item
        }
        return result

    }

}