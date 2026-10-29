# 1897. Redistribute Characters to Make All Strings Equal

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/)

`Hash Table` · `String` · `Counting`

## Intuition
The operation lets you move any single character from one string to another, so the only thing that matters is how many times each character appears in total.  
If every string ends up identical, each character must appear the same number of times in every string.  
Thus, for a character with total count `c`, it must be divisible by the number of strings `n`; otherwise the remainder cannot be distributed evenly.

## Approach
1. Count the total occurrences of each character across all strings with a hash map.  
2. For every character count `c` in the map, check if `c % n == 0`.  
3. If any count fails this divisibility test, return `false`.  
4. If all counts pass, return `true`.

The algorithm relies solely on the global frequency of characters; no explicit string manipulation is needed.

## Complexity
- **Time:** O(total length of all strings) – each character is examined once.  
- **Space:** O(1) – the map stores at most 26 entries for lowercase letters, independent of input size.

## Solution (Java)

```java
class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < words[i].length() ; j++){
                char ch = words[i].charAt(j);

                map.put(ch , map.getOrDefault(ch , 0) + 1);
            }
        }
        for(int freq : map.values()){
            if(freq % words.length != 0){
                return false;
            }
        }
        return true;

    }
}
```

---

**Runtime** 13 ms (beats 8.0%) · **Memory** 46 MB (beats 27.5%)

<sub>Synced by AILeetHub on 2026-10-29.</sub>
