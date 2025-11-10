# 242. Valid Anagram

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/valid-anagram/)

`Hash Table` · `String` · `Sorting`

## Intuition  
Two strings are anagrams when they contain exactly the same characters with the same multiplicities.  
Because the input alphabet is limited to the 26 lowercase English letters, we can keep a fixed‑size counter for each letter instead of using a hash map or sorting.

## Approach  
1. **Length check** – If the two strings differ in length, they cannot be anagrams, so return `false` immediately.  
2. **Counting** – Create an integer array of size 26 (`count`).  
   Iterate over the indices of the strings once.  
   * For the character from the first string, increment the corresponding counter: `count[s.charAt(i) - 'a']++`.  
   * For the character from the second string, decrement the corresponding counter: `count[t.charAt(i) - 'a']--`.  
   This simultaneous update ensures that matching characters cancel each other out.  
3. **Verification** – After the loop, scan the `count` array. If any element is non‑zero, the strings differ in character composition, so return `false`.  
4. **Result** – If all counters are zero, the strings are anagrams; return `true`.

## Complexity  
- **Time:** O(n) – one pass over the strings and a constant‑size scan, where n is the string length.  
- **Space:** O(1) – the 26‑element array is fixed and independent of input size.

## Solution (java)

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] count = new int[26];

        for(int i = 0 ; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c : count){
            if(c!=0) return false;
        }
        return true;
    }
}
```

---

**Runtime** 6 ms · **Memory** 44.2 MB

<sub>Synced by AILeetHub on 2025-11-10.</sub>
