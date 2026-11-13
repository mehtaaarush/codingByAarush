# 1903. Largest Odd Number in String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/largest-odd-number-in-string/)

`Math` · `String` · `Greedy`

## Intuition
The largest odd number obtainable as a substring will always be a prefix of the original string.  
If the last digit of a prefix is odd, that prefix itself is odd; extending it further would only add even digits, which cannot increase the value while keeping it odd.  
Thus, the optimal solution is the longest prefix that ends with an odd digit.

## Approach
Scan the string from right to left to locate the first odd digit.  
When an odd digit is found at position `i`, the substring `num[0..i]` is the longest possible odd number, so return it immediately.  
If the scan completes without encountering an odd digit, no odd substring exists, so return an empty string.

## Complexity
- **Time:** O(n) – a single pass over the string of length *n* to find the rightmost odd digit.  
- **Space:** O(1) – only a few integer variables are used; the returned substring shares the original string’s storage.

## Solution (Java)

```java
class Solution {
    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {

            if (num.charAt(i) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }
}
```

---

**Runtime** 1 ms (beats 99.9%) · **Memory** 46.8 MB (beats 62.7%)

<sub>Synced by AILeetHub on 2026-11-13.</sub>
