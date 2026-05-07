# 231. Power of Two

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/power-of-two/)

`Math` · `Bit Manipulation` · `Recursion`

## Approach

Accepted easy solution in java.
Relevant topics: Math, Bit Manipulation, Recursion.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;

        return (n&(n-1))==0;
    }
}
```

---

**Runtime** 1 ms · **Memory** 42.7 MB

<sub>Synced by AILeetHub on 2026-05-07.</sub>
