# 746. Min Cost Climbing Stairs

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/min-cost-climbing-stairs/)

`Array` · `Dynamic Programming`

## Approach

Accepted easy solution in java.
Relevant topics: Array, Dynamic Programming.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0] ; dp[1] = cost[1];
        for(int i = 2 ; i<n ; i++){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}

// class Solution {
//     public int minCost(int[]cost , int index , int[] dp){
//         if(index==0 || index==1) return cost[index];
//         if(dp[index]!=-1) return dp[index];
//         return dp[index] = cost[index] + Math.min(minCost(cost,index-1,dp),minCost(cost,index-2,dp));
//     }

//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         int[] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
//     }
// }
```

---

**Runtime** 0 ms · **Memory** 44.9 MB

<sub>Synced by AILeetHub on 2026-05-02.</sub>
