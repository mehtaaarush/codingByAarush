# 387. First Unique Character in a String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/first-unique-character-in-a-string/)

`Hash Table` · `String` · `Queue` · `Counting`

## Intuition  
The first unique character is the one that appears exactly once and is positioned earliest in the string.  
By counting how many times each character occurs we can later check the order of appearance to find the first one whose count is one.

## Approach  
1. **Count frequencies** – Traverse the string once, inserting each character into a `LinkedHashMap`.  
   *The map’s key is the character, and the value is its occurrence count.*  
   `LinkedHashMap` preserves insertion order, which is the order of first appearance in the string.

2. **Find the first unique** – Iterate over the string again.  
   For each character, look up its count in the map.  
   The first character whose count equals `1` is the answer; return its index.  
   If no such character exists, return `-1`.

This two‑pass strategy guarantees that the earliest unique character is found without scanning the string multiple times for each character.

## Complexity  
- **Time:** O(n) – two linear scans over the string of length *n*.  
- **Space:** O(k) – the map stores at most *k* distinct characters (k ≤ 26 for lowercase letters), so the extra space is bounded by the alphabet size.

## Solution (java)

```java
class Solution {
    public int firstUniqChar(String s) {
    LinkedHashMap <Character,Integer> map = new LinkedHashMap<>();

    for(int i = 0;i<s.length();i++){
        char c = s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
    }

    for(int i = 0;i<s.length();i++){
        if(map.get(s.charAt(i))==1){
        return i;
    }       }
    return -1;
    }
}
```

---

**Runtime** 34 ms · **Memory** 47.1 MB

<sub>Synced by AILeetHub on 2026-03-03.</sub>
