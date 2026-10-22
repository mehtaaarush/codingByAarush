# 9. Palindrome Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/palindrome-number/)

`Math`

## Intuition
A palindrome reads the same forward and backward. For an integer, the easiest way to verify this is to examine its decimal representation. By converting the number to a string we can treat each digit as a character and compare mirrored positions.

## Approach
1. Convert the integer `x` to a string with `Integer.toString(x)`.  
2. Set two indices: `left` at the start and `right` at the end of the string.  
3. While `left < right`, compare the characters at these indices.  
   * If they differ, the number is not a palindrome → return `false`.  
   * If they match, increment `left` and decrement `right`.  
4. If the loop finishes without a mismatch, all mirrored digits matched, so return `true`.

Negative numbers contain a leading `-` in the string, which will never match a digit, causing an immediate `false`.

## Complexity
- **Time:** O(n) – each digit is inspected at most once.  
- **Space:** O(n) – the string holds all digits of the input.

## Solution (Java)

```java
class Solution {
    public boolean isPalindrome(int x) {

        String s = Integer.toString(x);

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
```

---

**Runtime** 15 ms (beats 6.2%) · **Memory** 45.5 MB (beats 92.1%)

<sub>Synced by AILeetHub on 2026-10-22.</sub>
