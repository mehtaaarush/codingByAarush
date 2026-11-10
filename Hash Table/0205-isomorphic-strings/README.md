# 205. Isomorphic Strings

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/isomorphic-strings/)

`Hash Table` · `String`

## Intuition
We must establish a one‑to‑one correspondence between characters of `s` and `t`.  
If a character from `s` has already been mapped, the next character in `t` must match that mapping.  
No two distinct characters from `s` may map to the same character in `t`.

## Approach
Create a `HashMap<Character, Character>` to record mappings from `s` to `t`.  
Iterate through both strings simultaneously:

1. Let `a = s.charAt(i)` and `b = t.charAt(i)`.
2. If `a` is already a key, return `false` if `map.get(a) != b`.
3. If `a` is new, ensure `b` is not already a mapped value (`map.containsValue(b)`); if it is, return `false`.
4. Insert the new mapping `a → b` into the map.

If the loop finishes without conflicts, the strings are isomorphic.

## Complexity
- **Time:** O(n²) – each iteration may call `containsValue`, which scans the map’s values.  
- **Space:** O(n) – the map holds at most one entry per distinct character in `s`.

## Solution (Java)

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(map.containsKey(a)){
                if (map.get(a) != b) {
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

**Runtime** 11 ms (beats 59.3%) · **Memory** 43.3 MB (beats 92.1%)

<sub>Synced by AILeetHub on 2026-11-10.</sub>
