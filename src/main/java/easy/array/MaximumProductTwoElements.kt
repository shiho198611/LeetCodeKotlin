package easy.array

class MaximumProductTwoElements {

    fun maxProduct(nums: IntArray): Int {

        var first = 1
        var second = 1

        for(num in nums) {
            if(num >= first) {
                second = first
                first = num
            } else if(num >= second) {
                second = num
            }
        }

        return (first - 1) * (second - 1)
    }

}