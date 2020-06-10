package easy.array

class BestTimeToBuyAndSellStock2 {

    fun maxProfit(prices: IntArray): Int {

        var result = 0

        for(index in 1 until prices.size) {
            val value = prices[index] - prices[index-1]
            if(value > 0) {
                result += value
            }
        }

        return result
    }

}