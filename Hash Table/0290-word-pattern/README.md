# 290. Word Pattern

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/word-pattern/)

`Hash Table` · `String`

## Intuition  
The task is to establish a one‑to‑one mapping between the letters of `pattern` and the words of `s`.  
If a letter has already been assigned a word, every later occurrence of that letter must match the same word.  
At the same time, a word that has already been used for one letter cannot be reused for another.  
Thus we must enforce both forward and reverse uniqueness simultaneously.

## Approach  
1. Split `s` on whitespace to obtain an array of words.  
2. If the number of words differs from `pattern.length()`, return `false`.  
3. Iterate over the indices of the pattern. For each index `i`:
   - Let `c = pattern.charAt(i)` and `w = words[i]`.  
   - If `c` is already in the map, compare the stored word with `w`; a mismatch yields `false`.  
   - If `c` is new, first check whether `w` is already a value in the map (to preserve injectivity).  
     If it is, return `false`.  
   - Otherwise, insert the pair `c → w`.  
4. If the loop completes without conflicts, return `true`.

## Complexity  
- **Time:** O(n) – each word is processed once and all map operations are O(1).  
- **Space:** O(k) – the map holds at most one entry per distinct character in the pattern.

## Solution (Java)

```java
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character , String> map = new HashMap<>();
        String[] words = s.split("\\s+");

        if(pattern.length() != words.length){
            return false;
        }

        for(int i = 0 ; i < pattern.length() ; i++){
            char a = pattern.charAt(i);
            String b = words[i];
        

        if(map.containsKey(a)){
                if(!map.get(a).equals(b)){
                    return false;
                }
        }else{
                if(map.containsValue(b)){
                    return false;
                }

                map.put(a, b);
            }
        }
            return true;
        }

        
    }

```

---

**Runtime** 2 ms (beats 13.6%) · **Memory** 42.5 MB (beats 73.0%)

<sub>Synced by AILeetHub on 2026-11-10.</sub>
