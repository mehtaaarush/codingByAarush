# 1768. Merge Strings Alternately

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/merge-strings-alternately/)

`Two Pointers` · `String`

## Intuition  
The merged string is built by taking one character from each word in turn.  
When one word runs out, the remaining characters of the longer word are simply appended.  
Thus the task reduces to iterating over the common prefix length and then handling the tail.

## Approach  
1. Create a `StringBuilder` to accumulate the result.  
2. Determine the lengths `l1` and `l2`.  
3. If the lengths are equal, iterate `i` from `0` to `l1‑1` and append `word1[i]` followed by `word2[i]`.  
4. If `l1 < l2`, perform the same alternating loop for `i < l1`, then append the substring of `word2` from index `l1` to the end.  
5. If `l1 > l2`, alternate for `i < l2`, then append the remaining part of `word1` from index `l2`.  
6. Return the built string.

The code explicitly handles the three cases (equal, first shorter, first longer) with simple `for` loops and substring appends, ensuring each character is processed exactly once.

## Complexity  
- **Time:** O(n + m) – each character of both strings is visited once.  
- **Space:** O(n + m) – the result string stores all characters from both inputs.

## Solution (Java)

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int l1 = word1.length();
        int l2 = word2.length();

        if(l1 == l2){
            for(int i = 0 ; i < l1 ; i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            }
        }
        else if(l1 < l2){
            for(int i = 0 ; i < l1 ; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            for(int i = l1 ; i < l2 ; i++){
                result.append(word2.charAt(i));
            }
        }else{
            for(int i = 0 ; i < l2 ; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            for(int i = l2 ; i < l1 ; i++){
                result.append(word1.charAt(i));

        }
        
        }
        return result.toString();
    }
    
}
```

---

**Runtime** 1 ms (beats 96.0%) · **Memory** 42.6 MB (beats 95.7%)

<sub>Synced by AILeetHub on 2026-10-23.</sub>
