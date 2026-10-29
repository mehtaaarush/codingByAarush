# 383. Ransom Note

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/ransom-note/)

`Hash Table` · `String` · `Counting`

## Intuition  
To build the ransom note we only need to know how many times each letter appears in the magazine. If any required letter is missing or appears too few times, construction is impossible. Counting the letters once and then verifying the note against that count gives a linear‑time solution.

## Approach  
1. **Count magazine letters** – Iterate over `magazine`, storing each character’s frequency in a `HashMap<Character,Integer>`.  
2. **Validate ransom note** – Iterate over `ransomNote`. For each character, decrement its count in the map.  
3. **Early exit** – If any count becomes negative, return `false` immediately, because the note requires more of that letter than the magazine provides.  
4. If the loop completes without a negative count, return `true`.

The map is updated in place, so no additional data structures are needed beyond the frequency table.

## Complexity  
- **Time:** O(n + m) – one pass over `magazine` and one over `ransomNote`.  
- **Space:** O(k) – at most one entry per distinct character (k ≤ 26 for lowercase letters).

## Solution (Java)

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i < magazine.length() ; i++){
            char ch = magazine.charAt(i);

            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        for(int i = 0 ; i < ransomNote.length() ; i++){
            char ch = ransomNote.charAt(i);

            map.put(ch , map.getOrDefault(ch , 0) - 1);
        

            if(map.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}
```

---

**Runtime** 19 ms (beats 9.5%) · **Memory** 46.7 MB (beats 38.9%)

<sub>Synced by AILeetHub on 2026-10-29.</sub>
