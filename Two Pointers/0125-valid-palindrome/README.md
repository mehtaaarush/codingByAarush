# 125. Valid Palindrome

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/valid-palindrome/)

`Two Pointers` · `String`

## Intuition  
A palindrome reads identically from both ends once all irrelevant characters are removed and case is ignored. By first normalizing the string—stripping non‑alphanumerics and converting to lowercase—we reduce the problem to a simple two‑pointer comparison on a clean sequence.

## Approach  
1. **Clean the input**: `replaceAll("[^a-zA-Z0-9]", "")` removes any character that isn’t a letter or digit.  
2. **Uniform case**: `toLowerCase()` ensures that letter case does not affect equality.  
3. **Two‑pointer scan**: Initialize `left` at the start and `right` at the end of the cleaned string. While `left < right`, compare the characters at these indices. If any pair differs, the string is not a palindrome and the function returns `false`. Otherwise, advance `left` and decrement `right`.  
4. If the loop completes without mismatches, the string is a palindrome; return `true`.

This method checks each character pair once, guaranteeing correctness while keeping the logic straightforward.

## Complexity  
- **Time:** O(n) – one pass to clean the string and one pass to compare characters.  
- **Space:** O(n) – the cleaned string occupies additional memory proportional to the input length.

## Solution (Java)

```java
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]" , "");
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```

---

**Runtime** 15 ms (beats 20.3%) · **Memory** 45.6 MB (beats 33.4%)

<sub>Synced by AILeetHub on 2026-11-02.</sub>
