class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int buy = 0;

        for(int i = 0 ; i < prices.length ; i++){
            buy = prices[i];
            minValue = Math.min(buy , minValue);

            int profit = prices[i] - minValue;

            maxProfit = Math.max(profit , maxProfit);

        }
        return maxProfit;
    }
}