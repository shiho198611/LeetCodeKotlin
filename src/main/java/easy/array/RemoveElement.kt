package easy.array

class RemoveElement {

    fun removeElement(nums: IntArray, `val`: Int): Int {

        var index = 0

        for(i in nums.indices) {
            if(nums[i] != `val`) {
                nums[index] = nums[i]
                index++
            }
        }

        return index
    }

    fun removeElementFirst(nums: IntArray, `val`: Int): Int {

        if(nums.isEmpty()) return 0

        var f = 0
        var b = nums.lastIndex

        while (f < b) {
            if (nums[f] != `val` && nums[b] == `val`) {
                f++
                b--
            } else if (nums[f] != `val` && nums[b] != `val`) {
                f++
            } else if (nums[f] == `val` && nums[b] != `val`) {
                val tmp = nums[f]
                nums[f] = nums[b]
                nums[b] = tmp

                f++
                b--
            } else if (nums[f] == `val` && nums[b] == `val`) {
                b--
            }
        }

        return if(nums[f] == `val`) {
            f
        }
        else {
            f+1
        }

    }

}