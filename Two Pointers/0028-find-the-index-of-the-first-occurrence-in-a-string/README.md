# 28. Find the Index of the First Occurrence in a String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

`Two Pointers` · `String` · `String Matching` · `Z Algorithm` · `Knuth–Morris–Pratt Algorithm` · `Boyer–Moore String-Search Algorithm`

## Intuition
The task is to locate the first position where a short pattern (`needle`) appears inside a longer text (`haystack`).  
Because the input size is modest (≤ 10⁴), a straightforward comparison of the pattern against every possible starting position in the text is both simple and fast enough.

## Approach
1. **Edge case** – if the pattern is empty, return 0 immediately.  
2. Iterate over each index `i` in `haystack` where the pattern could start: `0 … haystack.length - needle.length`.  
3. For each `i`, compare characters one by one: while the characters at `haystack[i + j]` and `needle[j]` match, increment `j`.  
4. If `j` reaches the length of `needle`, a full match has been found; return the current index `i`.  
5. If the loop finishes without a match, return `-1`.

This is the classic *naïve* string‑matching algorithm, which checks each potential alignment until a mismatch occurs.

## Complexity
- **Time:** O((n − m + 1) · m) – in the worst case we compare the pattern against every possible start position, each comparison taking up to `m` steps.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (java)

```java
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            while (j < needle.length() && 
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
```

---

**Runtime** 1 ms · **Memory** 42.6 MB

<sub>Synced by AILeetHub on 2026-03-04.</sub>
