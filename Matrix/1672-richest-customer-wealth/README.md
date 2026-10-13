# 1672. Richest Customer Wealth

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/richest-customer-wealth/)

`Array` · `Matrix`

## Intuition  
The wealth of a customer is simply the sum of all values in their row of the matrix.  
The richest customer is the one whose row sum is largest.  
Thus, we only need to compute each row’s sum once and keep track of the maximum.

## Approach  
Traverse the matrix row by row.  
For each customer (row), initialize a running total `wealth` to zero and add every bank balance in that row.  
After summing a row, compare the resulting `wealth` with the current `maxWealth` and update it if larger.  
Once all rows have been processed, `maxWealth` holds the richest customer’s wealth, which is returned.

## Complexity  
- **Time:** O(m × n) – each of the m rows contains n elements, all of which are visited once.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0 ; i < accounts.length ; i++){
            int wealth = 0;
            for(int j = 0 ; j < accounts[i].length ; j++){
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(wealth , maxWealth);
        }
        return maxWealth;
    }
}
```

---

**Runtime** 1 ms (beats 14.8%) · **Memory** 44.5 MB (beats 55.3%)

<sub>Synced by AILeetHub on 2026-10-13.</sub>
