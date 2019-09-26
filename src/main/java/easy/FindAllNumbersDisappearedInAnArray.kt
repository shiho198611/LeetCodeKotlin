package easy

class FindAllNumbersDisappearedInAnArray {

    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val mark = Array(nums.size){false}
        val result = mutableListOf<Int>()

        for(element in nums) {
            mark[element-1] = true
        }

        for(index in mark.indices) {
            if(!mark[index]) {
                result.add(index+1)
            }
        }

        return result
    }

}