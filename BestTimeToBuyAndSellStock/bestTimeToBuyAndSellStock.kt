class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = Int.MAX_VALUE
        var maxProfit = 0
        for (i in 0..prices.size-1) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]
            }
        else if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice
        }
        }
        return maxProfit
    }
}