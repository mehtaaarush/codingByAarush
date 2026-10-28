# 66. Plus One

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/plus-one/)

`Array` · `Math`

## Intuition  
Adding one to a decimal number is a simple carry‑propagation problem.  
Starting from the least significant digit, if the digit is less than 9 we can
increment it and finish.  
If it is 9, it becomes 0 and the carry moves to the next more significant
digit.  
When every digit is 9, the carry propagates past the most significant digit,
requiring an extra leading 1.

## Approach  
The algorithm scans the array from right to left.  
For each position:  
1. If the digit is < 9, increment it and return the modified array immediately.  
2. If the digit is 9, set it to 0 and continue the loop to propagate the carry.  

If the loop completes without returning, all digits were 9.  
A new array of length `digits.length + 1` is created, its first element set to 1
(the carry), and the rest are implicitly 0, yielding the final result.

## Complexity  
- **Time:** O(n) – each digit is examined at most once.  
- **Space:** O(1) – only a few integer variables are used; the output array is the same size as the input or one element larger.

## Solution (Java)

```java
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.9 MB (beats 89.6%)

<sub>Synced by AILeetHub on 2026-10-28.</sub>
