# 2114. Maximum Number of Words Found in Sentences

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/)

`Array` · `String`

## Intuition  
The task reduces to counting words in each sentence and keeping the largest count.  
Because every sentence is guaranteed to have words separated by a single space and no leading/trailing spaces, the number of words equals the number of tokens obtained by splitting on whitespace.

## Approach  
Iterate through the `sentences` array.  
For each sentence, use `split("\\s+")` to break the string into an array of words.  
The length of this array is the word count for that sentence.  
Maintain a variable `count` that stores the maximum word count seen so far, updating it with `Math.max(count, words.length)` after each split.  
After processing all sentences, return `count`.

## Complexity  
- **Time:** O(n · m) – each of the `n` sentences is processed once, and splitting a sentence of length `m` takes linear time in its length.  
- **Space:** O(1) – aside from the temporary array returned by `split`, no additional data structures proportional to input size are used; the array is discarded after each iteration.

## Solution (Java)

```java
class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0;
        for(int i = 0 ; i < sentences.length ; i++){
            String[] words = sentences[i].split("\\s+");
            int maxCount = words.length;
            count = Math.max(count,maxCount);

        }
        return count;
    }
}
```

---

**Runtime** 15 ms (beats 5.3%) · **Memory** 47.3 MB (beats 5.6%)

<sub>Synced by AILeetHub on 2026-10-23.</sub>
