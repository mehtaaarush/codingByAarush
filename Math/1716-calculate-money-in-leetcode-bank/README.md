# 1716. Calculate Money in Leetcode Bank

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/calculate-money-in-leetcode-bank/)

`Math`

## Intuition  
Each week starts with a deposit that is one dollar higher than the previous week’s Monday.  
Within a week the deposit grows by one dollar each day.  
Thus the amount deposited on the *i*‑th day (0‑indexed) can be expressed as the sum of three parts: the base $1, the week offset, and the day offset.

## Approach  
Iterate over all days from 0 to *n* − 1.  
For each day *i*:
1. Compute `week = i / 7` (integer division) – how many full weeks have passed.  
2. Compute `day = i % 7` – the day’s position within the current week (0 for Monday, 6 for Sunday).  
3. The deposit for that day is `1 + week + day`.  
Add this value to a running total.  
After the loop, return the accumulated total.

This direct simulation follows the exact rule set: Monday’s base increases by one each week, and each subsequent day adds one more dollar than the previous day.

## Complexity  
- **Time:** O(n) – a single pass over *n* days.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int totalMoney(int n) {
        int total = 0;

        for (int i = 0; i < n; i++) {
            int week = i / 7;
            int day = i % 7;

            total += 1 + week + day;
        }

        return total;
    }
}
```

---

**Runtime** 2 ms (beats 33.1%) · **Memory** 41.8 MB (beats 89.0%)

<sub>Synced by AILeetHub on 2026-10-18.</sub>
