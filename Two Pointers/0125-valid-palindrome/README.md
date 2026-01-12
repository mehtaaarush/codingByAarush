# 125. Valid Palindrome

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/valid-palindrome/)

`Two Pointers` · `String`

## Intuition  
A palindrome can be verified by comparing characters from the start and end of the string while ignoring case and non‑alphanumeric symbols. If at any point the two examined characters differ, the string cannot be a palindrome. Using two pointers that move towards the center ensures each relevant character is processed only once.

## Approach  
1. Initialize two indices, `left` at the beginning and `right` at the end of the string.  
2. While `left < right`:  
   * Advance `left` until it points to an alphanumeric character or crosses `right`.  
   * Advance `right` until it points to an alphanumeric character or crosses `left`.  
   * Compare the lowercase forms of the characters at `left` and `right`. If they differ, return `false`.  
   * Move `left` forward and `right` backward to continue the comparison.  
3. If the loop completes without mismatches, return `true`.  

This two‑pointer scan naturally skips spaces, punctuation, and case differences, yielding the desired result.

## Complexity  
- **Time:** O(n) – each character is examined at most twice (once by each pointer).  
- **Space:** O(1) – only a constant number of integer variables are used regardless of input size.

## Solution (java)

```java
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
            return false;;
            left++;
            right--;
        }
        return true;
    }
}
```

---

**Runtime** 2 ms · **Memory** 44.1 MB

<sub>Synced by AILeetHub on 2026-01-12.</sub>
