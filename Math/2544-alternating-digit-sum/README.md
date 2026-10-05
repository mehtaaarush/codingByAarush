# 2544. Alternating Digit Sum

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/alternating-digit-sum/)

`Math`

## Intuition
The required sum alternates signs starting with a positive sign on the most significant digit.  
Treating the number as a sequence of digits makes it easy to apply the alternating rule:  
the first digit (index 0) is added, the next (index 1) is subtracted, and so on.

## Approach
1. Convert the integer `n` to its decimal string representation.  
2. Iterate over each character of the string.  
   * Convert the character to its numeric value (`digit = s.charAt(i) - '0'`).  
   * If the current index `i` is even, add `digit` to the running total; otherwise subtract it.  
3. Return the accumulated total.

The conversion to a string guarantees that the most significant digit is processed first, preserving the required sign pattern without extra arithmetic.

## Complexity
- **Time:** O(d) – where *d* is the number of digits in `n`; each digit is processed once.  
- **Space:** O(1) – only a few integer variables are used; the string representation is a constant‑size auxiliary structure relative to the input size.

## Solution (Java)

```java
class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum = 0;

        for(int i = 0 ; i < s.length(); i++){
            int digit = s.charAt(i) - '0';

            if(i%2==0){
                sum +=digit;
            }else{
                sum -=digit;
            }
        }
        return sum;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.3 MB (beats 30.5%)

<sub>Synced by AILeetHub on 2026-10-05.</sub>
