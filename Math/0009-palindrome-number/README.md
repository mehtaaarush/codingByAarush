# 9. Palindrome Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/palindrome-number/)

`Math`

## Intuition  
A number is a palindrome if it reads the same forward and backward.  
Instead of converting the integer to a string, we can reverse its digits mathematically and compare the reversed value to the original. If they match, the number is a palindrome.

## Approach  
1. **Negative check** – Any negative integer has a leading minus sign, so it can never be a palindrome; return `false` immediately.  
2. **Store original** – Keep a copy of the input (`original`) for later comparison.  
3. **Reverse the number** – While the number (`x`) is not zero, extract the last digit (`x % 10`), append it to `reverse` (`reverse * 10 + digit`), and drop the last digit (`x / 10`).  
4. **Compare** – After the loop, if `reverse` equals `original`, the number is a palindrome; otherwise, it is not.  

This method uses only integer arithmetic, avoiding string manipulation and extra memory for a character array.

## Complexity  
- **Time:** O(d) – where *d* is the number of digits in `x`; each digit is processed once.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (java)

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
        return false;
        }
        int original = x;
        int reverse = 0;

        while(x!=0){
            int digit = x % 10;
            reverse = reverse *10 + digit;
            x = x / 10;
        }
        if(reverse == original){
            return true;
        }
        else{
            return false;
        }
    }
}
```

---

**Runtime** 5 ms · **Memory** 46.1 MB

<sub>Synced by AILeetHub on 2025-12-29.</sub>
