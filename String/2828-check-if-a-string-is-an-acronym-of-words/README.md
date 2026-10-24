# 2828. Check if a String Is an Acronym of Words

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/)

`Array` · `String`

## Intuition  
An acronym is built by taking the first letter of each word in order.  
Thus, the length of the acronym must match the number of words, and each
character in the acronym must equal the first character of the corresponding
word. Checking these two conditions is enough to decide the answer.

## Approach  
1. **Length check** – If `words.size()` differs from `s.length()`, the strings
   can never match; return `false`.  
2. **Character comparison** – Iterate over the indices `i` from `0` to
   `words.size() - 1`.  
   * Retrieve the first character of `words.get(i)` with `charAt(0)`.  
   * Compare it to `s.charAt(i)`.  
   * If any pair differs, immediately return `false`.  
3. If the loop completes without mismatches, all first letters match the
   acronym; return `true`.

This direct, linear scan mirrors the provided Java implementation.

## Complexity  
- **Time:** O(n) – one pass over the words list, where *n* is its length.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length())
            return false;
        for(int i = 0 ; i < words.size() ; i++){
            if(words.get(i).charAt(0) != s.charAt(i)){
                return false;
            }
            
        }
        return true;
    }
}
```

---

**Runtime** 2 ms (beats 56.3%) · **Memory** 45.9 MB (beats 92.3%)

<sub>Synced by AILeetHub on 2026-10-24.</sub>
