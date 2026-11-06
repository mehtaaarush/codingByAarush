class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        

        for(int i = 0 ; i < prices.length ; i++){
            
            minValue = Math.min(prices[i] ,  minValue);

            int profit = prices[i] - minValue;

            maxProfit = Math.max(profit , maxProfit);

        }
        return maxProfit;
    }
}