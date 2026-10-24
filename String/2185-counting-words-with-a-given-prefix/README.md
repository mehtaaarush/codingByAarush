# 2185. Counting Words With a Given Prefix

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/counting-words-with-a-given-prefix/)

`Array` · `String` · `String Matching`

## Intuition
The task is to count how many strings in the array start with a given prefix. Each string can be examined independently; no global state or preprocessing is necessary.

## Approach
Iterate through the `words` array. For each word, call `String.startsWith(pref)`. This built‑in method compares the first `pref.length()` characters of the word with the prefix. If the comparison succeeds, increment a counter. After all words have been processed, return the counter. The algorithm uses only a few primitive variables and relies on Java’s efficient native implementation of `startsWith`.

## Complexity
- **Time:** O(W · P) – where W is the number of words and P is the prefix length, because each `startsWith` call scans up to P characters.
- **Space:** O(1) – only constant‑size variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public int prefixCount(String[] words, String pref) {
        int n = pref.length();
        int count = 0;

        for(int i = 0 ; i < words.length ; i++){
            if(words[i].startsWith(pref)){
                count += 1;
            }
        }
        return count;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 44 MB (beats 80.4%)

<sub>Synced by AILeetHub on 2026-10-24.</sub>
