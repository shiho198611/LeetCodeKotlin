package easy.hashtable

class ContainsDuplicate2 {

    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {

        val table = mutableMapOf<Int, Int>()

        for(i in nums.indices) {
            if(table.containsKey(nums[i])) {
                if(i - table[nums[i]]!! <= k) {
                    return true
                }
            }

            table.put(nums[i], i)
        }

        return false
    }

}