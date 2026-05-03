# 198. House Robber

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/house-robber/)

`Array` · `Dynamic Programming`

## Intuition  
The robber can either take the money from a house or skip it, but never two adjacent houses.  
For any position *i*, the best amount that can be obtained from the suffix starting at *i* depends only on the two choices:  
* take house *i* and then solve the subproblem starting at *i + 2*;  
* skip house *i* and solve the subproblem starting at *i + 1*.  
This leads naturally to a recursive definition with overlapping subproblems.

## Approach  
The solution implements a **top‑down dynamic programming** (memoized recursion).  
1. `amount(nums, i, dp, n)` returns the maximum money that can be robbed from index *i* to the end.  
2. Base case: if *i* is beyond the last house, return 0.  
3. Memoization: if `dp[i]` is already computed, return it to avoid recomputation.  
4. Compute two options:  
   * `take = nums[i] + amount(nums, i + 2, dp, n)` – rob current house.  
   * `skip = amount(nums, i + 1, dp, n)` – skip current house.  
5. Store the maximum of these two in `dp[i]` and return it.  
6. `rob` initializes the memoization array with `-1` and starts the recursion from index 0.

## Complexity  
- **Time:** O(n) – each index is evaluated once and stored in `dp`.  
- **Space:** O(n) – the `dp` array plus the recursion stack can grow to depth *n*.

## Solution (java)

```java
class Solution {

    public int amount(int[] nums, int i, int[] dp, int n){
        if(i >= n) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i] + amount(nums, i + 2, dp, n);
        int skip = amount(nums, i + 1, dp, n);
        
        return dp[i] = Math.max(take, skip);
    }
    
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        
        return amount(nums, 0, dp, n);
    }
}
```

---

**Runtime** 0 ms · **Memory** 42.5 MB

<sub>Synced by AILeetHub on 2026-05-03.</sub>
