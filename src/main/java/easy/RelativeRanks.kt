package easy

class RelativeRanks {

    fun findRelativeRanks(nums: IntArray): Array<String> {

        val scoreMap = mutableMapOf<Int, Int>()

        for((index, value) in nums.withIndex()) {
            scoreMap[value] = index
        }

        var result = Array(nums.size){""}

        nums.sortDescending()

        for((index, score) in nums.withIndex()) {
            if(index == 0) {
                result[scoreMap[score]!!] = "Gold Medal"
            }
            else if(index == 1) {
                result[scoreMap[score]!!] = "Silver Medal"
            }
            else if(index == 2) {
                result[scoreMap[score]!!] = "Bronze Medal"
            }
            else {
                result[scoreMap[score]!!] = (index+1).toString()
            }
        }

        return result
    }

}