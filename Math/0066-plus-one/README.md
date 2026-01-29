# 66. Plus One

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/plus-one/)

`Array` · `Math`

## Intuition  
Adding one to a number represented as an array of digits is analogous to manual addition: start from the least significant digit, propagate any carry leftwards, and if all digits become zero, prepend a new most‑significant digit.

## Approach  
Traverse the array from right to left.  
- If the current digit is less than 9, simply increment it and return the modified array—no further carry is needed.  
- If the digit is 9, set it to 0 and continue the loop to handle the carry.  
If the loop finishes without returning, every digit was 9, so the result is 1 followed by all zeros. Allocate a new array of length + 1, set its first element to 1, and return it.

## Complexity  
- **Time:** O(n) – a single pass over the digits.  
- **Space:** O(n) – in the worst case a new array of size + 1 is created; otherwise the operation is in‑place.

## Solution (java)

```java
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length -1;i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;


      

    }
}
```

---

**Runtime** 0 ms · **Memory** 43.7 MB

<sub>Synced by AILeetHub on 2026-01-29.</sub>
