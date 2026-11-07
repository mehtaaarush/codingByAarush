# 58. Length of Last Word

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/length-of-last-word/)

`String`

## Intuition
The last word is the final sequence of non‑space characters in the string.  
By trimming trailing spaces we can safely split the string on single spaces and
the last element of the resulting array will always be that word.

## Approach
1. **Trim** the input string to remove leading and trailing spaces.  
2. **Split** the trimmed string on the space character `" "`; this yields an array of words.  
3. **Select** the last element of the array (`words[words.length - 1]`).  
4. **Count** the characters of this word by iterating through its characters and incrementing a counter.  
5. Return the counter as the length of the last word.

The loop that counts characters is equivalent to `word.length()`, but it demonstrates the explicit counting process used in the solution.

## Complexity
- **Time:** O(n) – the string is trimmed, split, and each character of the last word is examined once.  
- **Space:** O(n) – the `split` operation creates an array that can hold up to all words in the string.

## Solution (Java)

```java
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        String word = words[words.length - 1];
        int length = 0;

        for(int i = 0 ; i < word.length() ; i++){
            length++;
        }
        return length;
    }
}
```

---

**Runtime** 1 ms (beats 26.5%) · **Memory** 42.8 MB (beats 71.3%)

<sub>Synced by AILeetHub on 2026-11-07.</sub>
