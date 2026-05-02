# 509. Fibonacci Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/fibonacci-number/)

`Math` · `Dynamic Programming` · `Recursion` · `Memoization`

## Intuition
The Fibonacci sequence is defined recursively, but evaluating it directly leads to repeated work. By storing already computed values we can build each number from the two preceding ones in a single pass, turning the exponential recursion into a linear process.

## Approach
The solution uses bottom‑up dynamic programming.  
1. Handle the trivial cases `n <= 1` immediately.  
2. Create an array `dp` of length `n+1`.  
3. Initialize `dp[0] = 0` and `dp[1] = 1`.  
4. Iterate from `i = 2` to `n`, setting `dp[i] = dp[i-1] + dp[i-2]`.  
5. Return `dp[n]` as the result.  
This method ensures each Fibonacci number is computed once, using only previously computed values.

## Complexity
- **Time:** O(n) – a single loop of `n-1` iterations, each doing constant work.  
- **Space:** O(n) – an array of size `n+1` stores all intermediate Fibonacci numbers.

## Solution (java)

```java
class Solution {
    public int fib(int n) {
    if(n<=1) return n;
    int[] dp = new int[n+1];
    dp[0] = 0 ; dp[1] = 1;
    for(int i = 2 ; i <= n ; i++){
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
    }
}

// class Solution {
//     public int fibo(int n,int[] dp) {
//         if(n<=1) return n;
//         if(dp[n]!=0) return dp[n];
//         // int ans = fibo(n-1,dp) + fibo(n-2,dp);
//         // dp[n] = ans;
//         return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
//     }

//     public int fib(int n) {
//     int[] dp = new int[n+1];
//     return fibo(n,dp);
//     }
// }
```

---

**Runtime** 0 ms · **Memory** 41.8 MB

<sub>Synced by AILeetHub on 2026-05-02.</sub>
