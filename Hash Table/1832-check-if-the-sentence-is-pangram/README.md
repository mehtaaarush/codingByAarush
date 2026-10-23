# 1832. Check if the Sentence Is Pangram

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)

`Hash Table` · `String`

## Intuition
A pangram contains every letter of the alphabet at least once.  
Instead of checking each letter individually, we can collect the distinct letters that appear in the sentence and then verify that we have all 26 English letters.

## Approach
The algorithm iterates through each character of the input string and inserts it into a `HashSet`.  
Because a set automatically discards duplicates, after the loop the set contains exactly the unique letters present in the sentence.  
Finally, the algorithm compares the size of the set to 26.  
If the size is 26, every letter has appeared at least once, so the sentence is a pangram; otherwise it is not.

## Complexity
- **Time:** O(n) – each of the n characters is processed once.  
- **Space:** O(1) – the set holds at most 26 characters, a constant amount of additional memory.

## Solution (Java)

```java
class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();

        for(int i = 0 ; i < sentence.length() ; i++){
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    }
}
```

---

**Runtime** 4 ms (beats 17.9%) · **Memory** 42.5 MB (beats 94.4%)

<sub>Synced by AILeetHub on 2026-10-23.</sub>
