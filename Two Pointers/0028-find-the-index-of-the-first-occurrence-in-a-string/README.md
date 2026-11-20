# 28. Find the Index of the First Occurrence in a String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

`Two Pointers` · `String` · `String Matching` · `Z Algorithm` · `Knuth–Morris–Pratt Algorithm` · `Boyer–Moore String-Search Algorithm`

## Intuition  
The task is to find the first position where a pattern string (`needle`) appears inside a larger string (`haystack`). Since the input sizes are modest (≤ 10⁴), a straightforward linear scan is sufficient: slide a window of length `m` (the length of `needle`) over `haystack` and compare each window to `needle`. The moment a match is found, the current index is the answer.

## Approach  
1. Compute the lengths `n` and `m` of `haystack` and `needle`.  
2. Iterate `i` from `0` to `n - m`.  
3. For each `i`, extract the substring `haystack[i … i+m)` and compare it with `needle` using `String.equals`.  
4. If they match, return `i` immediately.  
5. If the loop completes without a match, return `-1`.  
This is a classic brute‑force string matching algorithm that checks every possible alignment of `needle` within `haystack`.

## Complexity  
- **Time:** O((n‑m+1) · m) – each of the at most `n‑m+1` windows requires up to `m` character comparisons.  
- **Space:** O(1) – only a few integer variables are used; the substring operation does not allocate additional space proportional to input size.

## Solution (Java)

```java
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for(int i = 0 ; i <= n - m ; i++){
            if(haystack.substring(i , i + m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
```

---

**Runtime** 1 ms (beats 55.1%) · **Memory** 42.8 MB (beats 48.9%)

<sub>Synced by AILeetHub on 2026-11-20.</sub>
