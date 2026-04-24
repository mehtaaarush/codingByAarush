# 2833. Furthest Point From Origin

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/furthest-point-from-origin/)

`String` · `Counting`

## Approach

Accepted easy solution in java.
Relevant topics: String, Counting.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, unknown = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') left++;
            else if (c == 'R') right++;
            else unknown++;
        }

        return Math.abs(right - left) + unknown;
    }
}
    
```

---

**Runtime** 1 ms · **Memory** 43.7 MB

<sub>Synced by AILeetHub on 2026-04-24.</sub>
