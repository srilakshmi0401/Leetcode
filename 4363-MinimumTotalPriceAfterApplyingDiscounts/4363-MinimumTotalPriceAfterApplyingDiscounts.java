// Last updated: 8/12/2026, 11:53:04 AM
class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double totalsum=0.0;
        int pIndex=prices.length-1;
        int dIndex=discounts.length-1;
        while(pIndex>=0&&dIndex>=0){
            totalsum+=prices[pIndex]*(100.0-discounts[dIndex])/100.0;
            pIndex--;
            dIndex--;
        }
        while(pIndex>=0){
            totalsum+=prices[pIndex];
            pIndex--;
        }
        return totalsum;
    }
}