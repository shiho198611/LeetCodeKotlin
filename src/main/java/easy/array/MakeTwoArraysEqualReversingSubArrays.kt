package easy.array

class MakeTwoArraysEqualReversingSubArrays {

    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        val index = IntArray(1001)

        for (i in target.indices) {
            index[target[i]] += 1
            index[arr[i]] -= 1
        }

        for(num in index) {
            if(num != 0) {
                return false
            }
        }

        return true
    }

}