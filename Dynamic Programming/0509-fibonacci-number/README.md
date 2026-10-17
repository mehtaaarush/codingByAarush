# 509. Fibonacci Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/fibonacci-number/)

`Math` · `Dynamic Programming` · `Recursion` · `Memoization`

## Intuition
The Fibonacci sequence is defined recursively: each term is the sum of the two preceding terms.  
Because the definition directly mirrors the recurrence relation, a straightforward implementation is to call the same function for `n‑1` and `n‑2` until the base cases `0` and `1` are reached.

## Approach
The provided solution implements a pure recursive algorithm:

1. If `n` is `0` or `1`, return `n` immediately.  
2. Otherwise, compute `fib(n‑1)` and `fib(n‑2)` recursively and return their sum.  

No memoization or iterative optimization is used; the function simply follows the mathematical definition.

## Complexity
- **Time:** O(2ⁿ) – each call spawns two more calls, leading to an exponential number of evaluations.  
- **Space:** O(n) – recursion depth grows linearly with `n`, storing one call frame per level.

## Solution (Java)

```java
class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fib(n-1) + fib(n-2);
        
    }
}
```

---

**Runtime** 10 ms (beats 25.8%) · **Memory** 41.6 MB (beats 95.4%)

<sub>Synced by AILeetHub on 2026-10-17.</sub>
