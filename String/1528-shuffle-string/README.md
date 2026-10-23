# 1528. Shuffle String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/shuffle-string/)

`Array` · `String`

## Intuition
The problem gives a direct mapping from each original index to a new index.  
If we know where every character should end up, we can build the final string in a single pass: place each character at its target position and then read the array back as a string.

## Approach
1. Create a `char[] result` of the same length as `s`.  
2. Iterate over the indices of `s`.  
   * For each position `i`, take the character `s.charAt(i)` and store it in `result[indices[i]]`.  
3. After the loop, all positions of `result` are filled with the correct characters.  
4. Convert the `char[]` back to a `String` and return it.

This method directly follows the definition of the shuffle: the character at position `i` moves to `indices[i]`. No additional data structures or sorting are needed.

## Complexity
- **Time:** O(n) – one linear scan over the string and indices.  
- **Space:** O(n) – auxiliary array to hold the reordered characters.

## Solution (Java)

```java
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];

        for(int i = 0 ; i < s.length() ; i++){
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
```

---

**Runtime** 1 ms (beats 64.3%) · **Memory** 45 MB (beats 94.8%)

<sub>Synced by AILeetHub on 2026-10-23.</sub>
