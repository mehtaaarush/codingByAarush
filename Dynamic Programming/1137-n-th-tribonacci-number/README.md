# 1137. N-th Tribonacci Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/n-th-tribonacci-number/)

`Math` · `Dynamic Programming` · `Memoization`

## Intuition
The Tribonacci sequence extends the Fibonacci idea: each term equals the sum of the three preceding terms.  
Because the recurrence depends only on the last three values, the entire sequence can be generated iteratively without storing all intermediate results.

## Approach
1. Handle the trivial cases:  
   * `n == 0` → 0  
   * `n == 1` or `n == 2` → 1  
2. Initialize three variables to represent the last three Tribonacci numbers: `a = T0`, `b = T1`, `c = T2`.  
3. For every index `i` from 3 up to `n`, compute the next value as `next = a + b + c`.  
4. Shift the window: set `a = b`, `b = c`, and `c = next`.  
5. After the loop, `c` holds `Tn`, which is returned.

This method follows the recurrence exactly while keeping only the necessary state.

## Complexity
- **Time:** O(n) – a single loop of `n‑2` iterations, each performing constant‑time arithmetic.  
- **Space:** O(1) – only three integer variables are maintained regardless of `n`.

## Solution (Java)

```java
class Solution {
    public int tribonacci(int n) {
        
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        
        for(int i = 3 ; i <= n ; i++){
            int next = a + b + c;

            a = b;
            b = c;
            c = next;
        }

        return c;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 41.5 MB (beats 98.6%)

<sub>Synced by AILeetHub on 2026-10-18.</sub>
