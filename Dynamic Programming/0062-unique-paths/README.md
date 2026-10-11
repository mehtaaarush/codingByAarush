# 62. Unique Paths

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/unique-paths/)

`Math` · `Dynamic Programming` · `Combinatorics`

## Intuition  
The robot can only move right or down, so every path from the top‑left to the bottom‑right is a sequence of `m‑1` down moves and `n‑1` right moves.  
Instead of enumerating all sequences, we observe that the number of ways to reach a cell equals the sum of ways to reach the cell directly above it and the cell directly to its left. This recurrence naturally leads to a dynamic programming solution.

## Approach  
The provided solution implements a depth‑first search with memoization.  
1. A 2‑D array `dp` of size `m × n` stores already computed results; `0` indicates “not yet computed”.  
2. The recursive helper starts at `(0,0)`.  
   * If the current cell is the destination `(m‑1, n‑1)`, it returns `1`.  
   * If the indices go out of bounds, it returns `0`.  
   * If `dp[i][j]` is non‑zero, the cached result is returned immediately.  
3. Otherwise, the function recursively calls itself for the cell below `(i+1, j)` and the cell to the right `(i, j+1)`.  
4. The sum of these two calls is stored in `dp[i][j]` and returned.  
Because each cell’s value is computed only once, the recursion explores each state a single time.

## Complexity  
- **Time:** O(m × n) – every cell is visited once and its value is computed in constant time.  
- **Space:** O(m × n) – the `dp` table stores a value for each cell; the recursion stack adds at most O(m + n) additional space, which is dominated by the table.

## Solution (Java)

```java
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        return helper(m,n,0,0,dp);


    }
    public int helper(int m, int n , int i , int j, int[][] dp){
        if(i == m-1 && j == n-1) return 1;
        if(i>= m || j >= n) return 0;

        if(dp[i][j] != 0) return dp[i][j];
        
        int down = helper(m , n , i + 1 ,j,dp);
        int right = helper(m , n , i ,j + 1,dp);
        return dp[i][j] = down + right;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.4 MB (beats 12.7%)

<sub>Synced by AILeetHub on 2026-10-11.</sub>
