// Last updated: 8/12/2026, 12:14:37 PM
class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            // update minimum buying price
            if (price < minPrice) {
                minPrice = price;
            }

            // calculate profit if sold today
            int profit = price - minPrice;

            // update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}