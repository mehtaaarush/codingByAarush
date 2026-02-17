# 58. Length of Last Word

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/length-of-last-word/)

`String`

## Intuition
We only need the last word, so scanning from the end is enough. By first skipping any trailing spaces we land on the last non‑space character. Counting backwards until the next space (or the start) yields the length of that word.

## Approach
1. Start `i` at the last index of `s`.  
2. While `i >= 0` and `s.charAt(i)` is a space, decrement `i`.  
3. Initialize `length` to 0.  
4. While `i >= 0` and `s.charAt(i)` is not a space, increment `length` and decrement `i`.  
5. Return `length`.

Only a few integer variables are used, and the loop runs over the suffix of the string that contains the last word.

## Complexity
- **Time:** O(n) – in the worst case we scan the entire string once (no trailing spaces).  
- **Space:** O(1) – a constant number of variables are maintained, independent of input size.

## Solution (java)

```java
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
            return length;
    }
}
```

---

**Runtime** 0 ms · **Memory** 43.1 MB

<sub>Synced by AILeetHub on 2026-02-17.</sub>
