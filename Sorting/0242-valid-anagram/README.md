# 242. Valid Anagram

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/valid-anagram/)

`Hash Table` · `String` · `Sorting`

## Intuition  
Two strings are anagrams when they contain exactly the same characters with the same multiplicities. Counting how many times each character appears in both strings and comparing those counts is a direct way to verify this property.

## Approach  
1. **Length check** – If the strings differ in length, they cannot be anagrams.  
2. **Build frequency map** – Iterate over the first string, using a hash map to record how many times each character occurs.  
3. **Reduce counts with the second string** – Scan the second string, decrementing the corresponding count in the map for each character.  
4. **Validate** – After both passes, iterate over the map’s values; if any value is non‑zero, the strings differ. If all values are zero, the strings are anagrams.  
The use of `getOrDefault` handles characters that appear only in one string by treating missing entries as zero.

## Complexity  
- **Time:** O(n) – each string is traversed once, and the final map scan is proportional to the number of distinct characters.  
- **Space:** O(k) – the map stores at most one entry per distinct character (k ≤ 26 for lowercase letters, larger for Unicode).

## Solution (Java)

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        for(int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);

            map.put(ch , map.getOrDefault(ch , 0) - 1);
        }

        for(int value : map.values()){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
```

---

**Runtime** 16 ms (beats 22.2%) · **Memory** 46 MB (beats 44.2%)

<sub>Synced by AILeetHub on 2026-10-28.</sub>
