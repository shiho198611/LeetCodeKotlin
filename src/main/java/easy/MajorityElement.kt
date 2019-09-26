package easy

class MajorityElement {

    fun majorityElement(nums: IntArray): Int {
        var cnt = 0
        var candidate = nums[0]

        for(index in nums.indices) {

            if(cnt == 0) {
                candidate = nums[index]
                cnt++
            }
            else {
                if(candidate == nums[index]) {
                    cnt++
                }
                else {
                    cnt--
                }
            }
        }

        return candidate
    }

    fun majorityElementInit(nums: IntArray): Int {

        val cntMap = HashMap<Int, Int>()
        val size = nums.size.div(2).plus(1)

        for(index in nums.indices) {
            val cnt = (cntMap[nums[index]]?:0).plus(1)
            if(cnt >= size) {
                return nums[index]
            }
            else {
                cntMap[nums[index]] = cnt
            }
        }

        return 0
    }

}