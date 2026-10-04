# 2651. Calculate Delayed Arrival Time

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/calculate-delayed-arrival-time/)

`Math`

## Intuition
The clock repeats every 24 hours. Adding a delay can cross midnight; the resulting hour must wrap back to 0. Modulo 24 is the simplest way to perform this wrap‑around.

## Approach
1. Compute the raw arrival time after the delay: `total = arrivalTime + delayedTime`.  
2. Apply modulo 24: `result = total % 24`.  
   - If `total` is less than 24, the modulo leaves it unchanged.  
   - If `total` is 24 or more, the modulo subtracts 24 repeatedly until the value falls in the 0–23 range, which is exactly the 24‑hour representation.  
3. Return `result`.  
Because `delayedTime ≤ 24`, at most one wrap occurs, but the modulo works for any larger values as well. This one‑liner captures the entire logic and guarantees correct output for any valid input.

## Complexity
- **Time:** O(1) – a fixed number of arithmetic operations, independent of the input values.  
- **Space:** O(1) – only a handful of integer variables are allocated, regardless of the input size.

## Solution (Java)

```java
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime)%24;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.4 MB (beats 61.5%)

<sub>Synced by AILeetHub on 2026-10-04.</sub>
