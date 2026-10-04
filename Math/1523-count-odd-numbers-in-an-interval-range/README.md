# 1523. Count Odd Numbers in an Interval Range

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)

`Math`

## Intuition
In the integer sequence, every two consecutive numbers contain exactly one odd number.  
If we can quickly determine how many odds exist from 0 up to any bound `n`, then the count of odds in `[low, high]` is simply the difference between the counts up to `high` and up to `low‑1`.  
The number of odds from 0 to `n` inclusive is `(n + 1) / 2` because the first odd is 1, the second is 3, and so on; each pair contributes one odd, and an extra odd appears if `n` itself is odd.

## Approach
1. Compute the number of odds up to `high`: `(high + 1) / 2`.  
2. Compute the number of odds up to `low - 1` by dividing `low` by 2 (since integer division truncates).  
3. Subtract the second value from the first to obtain the count of odds in the inclusive range `[low, high]`.  
This yields the closed‑form expression `((high + 1) / 2) - (low / 2)`.

## Complexity
- **Time:** O(1) – a constant number of arithmetic operations.  
- **Space:** O(1) – only a few integer variables are used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.1 MB (beats 42.6%)

<sub>Synced by AILeetHub on 2026-10-04.</sub>
