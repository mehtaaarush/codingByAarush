# 121. Best Time to Buy and Sell Stock

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

`Array` · `Dynamic Programming`

## Intuition
We only need one transaction, so the best profit is the maximum difference between a later price and an earlier price. While scanning the array we can keep the smallest price seen so far; any later price can be paired with that minimum to produce a candidate profit.

## Approach
Traverse the array once. Maintain two variables: `minValue` (the lowest price up to the current index) and `maxProfit` (the best profit found). For each price `p`:
1. Update `minValue` to `min(minValue, p)`.
2. Compute `profit = p - minValue`.
3. Update `maxProfit` to `max(maxProfit, profit)`.

Because `minValue` is always the cheapest day before or on the current day, `profit` represents the best sale on day `i`. After the loop, `maxProfit` holds the maximum achievable profit; if all prices decrease, the computed profit never exceeds zero, so the algorithm naturally returns 0.

## Complexity
- **Time:** O(n) – a single pass over the price array.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
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
```

---

**Runtime** 1 ms (beats 99.9%) · **Memory** 93.8 MB (beats 89.5%)

<sub>Synced by AILeetHub on 2026-11-06.</sub>
