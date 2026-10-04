# 2119. A Number After a Double Reversal

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/a-number-after-a-double-reversal/)

`Math`

## Intuition

Reversing an integer drops any trailing zeros because they become leading zeros and are discarded. If a number remains the same after two reversals, its trailing zeros must have been removed in the first reversal and the resulting number must reverse back to the original. The task is to verify that property.

## Approach

The solution follows the problem statement literally. A helper method `reverse` iterates over the decimal digits of a non‑negative integer, building the reversed number by repeatedly taking the last digit (`num % 10`), appending it to the result (`rev = rev * 10 + digit`), and dropping the processed digit (`num /= 10`). The main routine calls this helper twice: first to obtain `reverse1`, then to obtain `reverse2` from `reverse1`. Finally it returns `true` if `reverse2` equals the input `num`, otherwise `false`. The helper works in place and does not use any auxiliary data structures.

## Complexity

- **Time:** O(d) where d is the number of digits in `num`; each reversal scans the digits once.  
- **Space:** O(1) because only a few integer variables are used and no additional data structures grow with input size.

## Solution (Java)

```java
class Solution {
    public boolean isSameAfterReversals(int num) {
        int reverse1 = reverse(num);
        int reverse2 = reverse(reverse1);
        if(reverse2 == num){
            return true;
        }else{
            return false;
        }
    }

    public static int reverse(int num){
        int rev = 0;

        while(num > 0){
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num / 10;
        }
        return rev;

    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42 MB (beats 81.7%)

<sub>Synced by AILeetHub on 2026-10-04.</sub>
