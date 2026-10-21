# 709. To Lower Case

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/to-lower-case/)

`String`

## Intuition
The task is to transform every uppercase ASCII letter in a string to its lowercase counterpart. Java’s `String` class already provides a method that performs this conversion according to Unicode case mapping, so the solution can rely on that built‑in functionality rather than manual character manipulation.

## Approach
The implementation simply calls `s.toLowerCase()` on the input string. This method iterates over each character, applies the Unicode lowercase mapping, and constructs a new `String` containing the transformed characters. Because the input is guaranteed to contain only printable ASCII characters, the conversion is straightforward and deterministic.

## Complexity
- **Time:** O(n) – each of the `n` characters is examined once to apply the lowercase mapping.  
- **Space:** O(n) – a new string of the same length is allocated to hold the result.

## Solution (Java)

```java
class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.4 MB (beats 95.1%)

<sub>Synced by AILeetHub on 2026-10-21.</sub>
