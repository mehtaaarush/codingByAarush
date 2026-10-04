# 2413. Smallest Even Multiple

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/smallest-even-multiple/)

`Math` · `Number Theory`

## Intuition
The task is to find the least positive integer that is simultaneously a multiple of the given number `n` and of 2. Since 2 is a fixed small integer, the answer depends solely on whether `n` itself is even or odd. An even number is already divisible by 2, so it is the smallest common multiple. An odd number cannot be divisible by 2, so the smallest multiple that satisfies both conditions must be twice the odd number.

## Approach
1. Check the parity of `n` using the modulo operator (`n % 2`).
2. If `n` is even (`n % 2 == 0`), return `n` directly.
3. If `n` is odd, return `2 * n`, which is the next multiple that is even.

This simple conditional logic guarantees the smallest positive integer that is a multiple of both `n` and 2.

## Complexity
- **Time:** O(1) – a single parity check and at most one multiplication.
- **Space:** O(1) – only a constant amount of additional storage is used.

## Solution (Java)

```java
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }else{
            return 2*n;
        }
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42 MB (beats 83.6%)

<sub>Synced by AILeetHub on 2026-10-04.</sub>
