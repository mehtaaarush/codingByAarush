# 1662. Check If Two String Arrays are Equivalent

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)

`Array` · `String`

## Intuition  
The two arrays represent the same string if, after concatenating all of their elements in order, the resulting strings are identical. Rather than comparing element by element, we can build the full strings once and perform a single equality check.

## Approach  
Create two `StringBuilder` objects, one for each array. Iterate over `word1`, appending each element to the first builder; repeat the same for `word2` with the second builder. After the loops, convert each builder to a `String` and compare them with `equals`. If the strings match, return `true`; otherwise, return `false`. This straightforward method leverages Java’s efficient string concatenation via `StringBuilder` and a single equality comparison.

## Complexity  
- **Time:** O(n + m) – each element of `word1` and `word2` is processed once during the append loops, and the final comparison scans the resulting strings.  
- **Space:** O(n + m) – the two `StringBuilder` instances store the concatenated characters of each array, requiring space proportional to the total length of the strings.

## Solution (Java)

```java
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();

        for(int i = 0 ; i < word1.length ; i++){
            w1.append(word1[i]);
        }
        for(int i = 0 ; i < word2.length ; i++){
            w2.append(word2[i]);
        }

        if(w1.toString().equals(w2.toString())){
            return true;
        }
        return false;
    }
}
```

---

**Runtime** 1 ms (beats 91.3%) · **Memory** 42.7 MB (beats 95.4%)

<sub>Synced by AILeetHub on 2026-10-24.</sub>
