# 14. Longest Common Prefix

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/longest-common-prefix/)

`Array` · `String` · `Trie`

## Intuition  
The longest common prefix must be a prefix of the first string in the array.  
If any character at a given position differs among the strings, the prefix ends just before that position.

## Approach  
1. Handle the edge case where the input array is empty or null by returning an empty string.  
2. Iterate over each character index `i` of the first string.  
3. For each `i`, store the character `ch` from the first string.  
4. Compare `ch` with the character at the same index in every other string:  
   * If the current string is shorter than `i+1` or its character differs from `ch`, the common prefix ends at `i`.  
   * Return the substring of the first string from 0 to `i`.  
5. If the loop completes without a mismatch, the entire first string is the common prefix; return it.

## Complexity  
- **Time:** O(n · m) – each of the `n` strings is examined up to the length `m` of the first string until a mismatch is found.  
- **Space:** O(1) – only a few integer variables and a constant‑size character are used; the output string is part of the input.

## Solution (java)

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
        return "";
        }

        for(int i = 0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
                for(int j = 1;j<strs.length;j++){
                    if(i>=strs[j].length() || strs[j].charAt(i) !=ch){
                        return strs[0].substring(0,i);
                    }

            }
        }
        return strs[0];
    }
}
```

---

**Runtime** 1 ms · **Memory** 43.6 MB

<sub>Synced by AILeetHub on 2026-01-26.</sub>
