# 121. Best Time to Buy and Sell Stock

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

`Array` · `Dynamic Programming`

## Intuition
We need a pair of days (i, j) with i < j that maximizes prices[j] − prices[i]. While scanning once, we can keep the lowest price seen so far. The best profit that ends on the current day is the current price minus that minimum. The maximum of these profits over all days gives the answer.

## Approach
Start with `minValue` set to a very large number and `maxProfit` to a very small number. For each price in the array:
1. Update `minValue` to the smaller of itself and the current price.
2. Compute `profit = current price − minValue`.
3. Update `maxProfit` to the larger of itself and `profit`.

After the loop, return `maxProfit`. This greedy strategy works because the best sell day for any chosen buy day is the maximum price after that day, and the best buy day for any chosen sell day is the minimum price before that day.

## Complexity
- **Time:** O(n) – a single pass over the array.  
- **Space:** O(1) – only a few integer variables are used.

## Solution (Java)

```java
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
```

---

**Runtime** 1 ms (beats 99.9%) · **Memory** 93.9 MB (beats 89.5%)

<sub>Synced by AILeetHub on 2026-11-06.</sub>
