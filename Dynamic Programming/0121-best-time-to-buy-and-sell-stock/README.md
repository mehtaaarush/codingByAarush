# 121. Best Time to Buy and Sell Stock

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

`Array` · `Dynamic Programming`

## Intuition
The profit from buying on day *i* and selling on day *j* (j > i) equals `prices[j] – prices[i]`.  
To maximize this difference we only need to know the smallest price seen so far when we examine each day.  
If the current price is lower than any seen before, it becomes the new buying candidate.  
Otherwise, selling at the current price against the best previous buying price yields a candidate profit.

## Approach
Traverse the array once, maintaining two variables:

1. `minPrice` – the lowest price encountered up to the current index.
2. `maxProfit` – the highest profit found so far.

For each price:
- Update `minPrice` to the smaller of itself and the current price.
- Compute the profit if we sold today (`price – minPrice`) and update `maxProfit` if this profit is larger.

After the loop, `maxProfit` holds the maximum achievable profit; if no profit is possible it remains 0.

## Complexity
- **Time:** O(n) – one pass over the price list.  
- **Space:** O(1) – only two integer variables are used, regardless of input size.

## Solution (java)

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            minPrice = Math.min(minPrice,price);
            maxProfit = Math.max(maxProfit,price - minPrice);

        }
        return maxProfit;
    }
}
```

---

**Runtime** 1 ms · **Memory** 94.6 MB

<sub>Synced by AILeetHub on 2026-04-23.</sub>
