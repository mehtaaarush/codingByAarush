# 70. Climbing Stairs

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/climbing-stairs/)

`Math` · `Dynamic Programming` · `Memoization`

## Intuition
Each climb ends on a particular step, and the last move to that step can only be a 1‑step or a 2‑step jump.  
Therefore, the number of ways to reach step *i* equals the sum of ways to reach step *i‑1* (followed by a 1‑step) and the ways to reach step *i‑2* (followed by a 2‑step).  
This recurrence is identical to the Fibonacci sequence, shifted by one position, and guarantees that the solution can be built iteratively from the base cases.

## Approach
The algorithm treats the two smallest stairs separately:  
- If *n* equals 1, there is only one way.  
- If *n* equals 2, there are two ways (1+1 or 2).  

For *n* > 2, an integer array `dp` of length *n* + 1 is allocated.  
`dp[1]` and `dp[2]` are initialized to 1 and 2, respectively.  
A single `for` loop runs from 3 to *n*, computing each `dp[i]` as the sum of the two preceding values:  
`dp[i] = dp[i-1] + dp[i-2]`.  
After the loop, `dp[n]` contains the total number of distinct ways to reach the top, which is returned.  
This bottom‑up dynamic programming approach eliminates the exponential blow‑up of naive recursion while preserving the optimal substructure.

## Complexity
- **Time:** O(n) – one linear pass over the stairs.  
- **Space:** O(n) – an array of size n + 1 to store intermediate counts.

## Solution (java)

```java
class Solution {
    public int climbStairs(int n) {
        // if(n==1 || n==2) return n;
        // return climbStairs(n-1) + climbStairs(n-2);
        if(n==1) return 1;
        int[] dp = new int[n+1];

        dp[1] = 1 ; dp[2] = 2;

        for(int i = 3 ; i <= n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
        
    }
}
```

---

**Runtime** 0 ms · **Memory** 42 MB

<sub>Synced by AILeetHub on 2026-05-02.</sub>
