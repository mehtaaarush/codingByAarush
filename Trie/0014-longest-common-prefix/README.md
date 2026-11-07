# 14. Longest Common Prefix

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/longest-common-prefix/)

`Array` · `String` · `Trie`

## Intuition  
The longest common prefix must be a prefix of the first string.  
If any other string does not start with that prefix, the common part can only be shorter.  
Thus we can iteratively shrink the candidate prefix until it matches the start of every string.

## Approach  
1. Assume the whole first string is the current prefix.  
2. For each subsequent string, repeatedly cut off the last character of the prefix until the string starts with it.  
3. If the prefix becomes empty at any point, there is no common prefix and we return `""`.  
4. After all strings are processed, the remaining prefix is the longest common prefix.

The algorithm uses `startsWith` to test prefix matches and `substring` to trim the prefix one character at a time.

## Complexity  
- **Time:** O(S) – each character of the prefix is examined and possibly removed at most once per string, where S is the total number of characters in all strings.  
- **Space:** O(1) – only a few variables are used; the prefix string itself is part of the input array and no additional data structures are allocated.

## Solution (Java)

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.length() == 0) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.4 MB (beats 98.7%)

<sub>Synced by AILeetHub on 2026-11-07.</sub>
