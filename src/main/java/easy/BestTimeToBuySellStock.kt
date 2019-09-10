package easy

class BestTimeToBuySellStock {

    fun maxProfit(prices: IntArray): Int {

        var left = Int.MAX_VALUE
        var result = 0

        for (index in prices.indices) {
            if(prices[index] < left) {
                left = prices[index]
            }

            val value = prices[index] - left
            if(value > result) {
                result = value
            }
        }

        return result
    }

}