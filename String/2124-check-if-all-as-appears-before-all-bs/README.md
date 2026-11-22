# 2124. Check if All A's Appears Before All B's

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/)

`String`

## Intuition
The string contains only `'a'` and `'b'`.  
If any `'a'` appears after a `'b'`, the required ordering is violated.  
Thus we only need to locate the first `'b'` and ensure that no `'a'` follows it.

## Approach
1. Scan the string from left to right until the first `'b'` is found.  
   Let the index of this `'b'` be `i`.  
   If the entire string contains no `'b'`, the loop ends with `i = s.length()`.  
2. Starting from `i + 1`, scan the remainder of the string.  
   If an `'a'` is encountered, return `false` immediately – an `'a'` appears after a `'b'`.  
3. If the second scan completes without finding an `'a'`, return `true`.  
   This covers cases with only `'a'`s, only `'b'`s, or a clean block of `'a'`s followed by `'b'`s.

## Complexity
- **Time:** O(n) – each character is examined at most twice (once in each loop).  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public boolean checkString(String s) {
        int i;
        for(i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'b'){
                break;
            }
        }
        for(int j = i + 1 ; j < s.length() ; j++){
            if(s.charAt(j) == 'a'){
                return false;
            }
        }
        return true;
    }
}
```

---

**Runtime** 1 ms (beats 54.6%) · **Memory** 42.7 MB (beats 26.4%)

<sub>Synced by AILeetHub on 2026-11-22.</sub>
