# 2769. Find the Maximum Achievable Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-the-maximum-achievable-number/)

`Math`

## Intuition  
An operation moves **x** and **num** in opposite directions by one unit each.  
To make **x** equal to **num** after at most *t* operations, we can either  
* increase **x** while decreasing **num**, or  
* decrease **x** while increasing **num**.  

If we want the largest possible starting value of **x**, we should always
decrease **x** (so it can be brought down) and increase **num** (so it can
catch up). Each operation reduces the gap between them by 2 units
(1 from **x**, 1 from **num**).  
Thus, after *t* operations the gap can shrink by at most *2t*.  
Starting with **x = num + 2t** guarantees that after *t* operations the two
values become equal, and no larger starting value can satisfy the condition.

## Approach  
The algorithm directly applies the derived formula:  
`maxDist = num + 2 * t`.  
It returns this value as the maximum achievable **x**.  
No loops or additional data structures are needed.

## Complexity  
- **Time:** O(1) – a single arithmetic computation.  
- **Space:** O(1) – only a constant number of variables are used.

## Solution (Java)

```java
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int max_dist = num + 2*t;
        return max_dist;
    }
}
```

---

**Runtime** 1 ms (beats 100.0%) · **Memory** 43.3 MB (beats 47.7%)

<sub>Synced by AILeetHub on 2026-09-17.</sub>
