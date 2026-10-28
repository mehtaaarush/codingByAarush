# 387. First Unique Character in a String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/first-unique-character-in-a-string/)

`Hash Table` · `String` · `Queue` · `Counting`

## Intuition  
To know whether a character is unique we must know how many times it appears in the string.  
The first non‑repeating character is the one whose total count is one and that occurs earliest in the original order.

## Approach  
1. **Count frequencies** – Iterate once over the string, storing each character’s occurrence count in a `HashMap<Character,Integer>`.  
2. **Find the first unique** – Iterate a second time over the string; for each character, check its stored count. The first character whose count equals one is the answer, and its index is returned immediately.  
3. If no character has a count of one, return `-1`.

This two‑pass strategy guarantees that we preserve the original order while still having constant‑time lookups for frequencies.

## Complexity  
- **Time:** O(n) – two linear scans over the string of length *n*.  
- **Space:** O(1) – the map holds at most 26 entries for lowercase English letters, a constant amount of extra space.

## Solution (Java)

```java
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(map.get(ch) == 1){
                return i;
            }
        }
        return -1; 
        
        

        
    }
}
```

---

**Runtime** 36 ms (beats 10.5%) · **Memory** 46.6 MB (beats 89.3%)

<sub>Synced by AILeetHub on 2026-10-28.</sub>
