# 1342. Number of Steps to Reduce a Number to Zero

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)

`Math` · `Bit Manipulation`

## Intuition
Each step either halves the current number when it is even or decrements it by one when it is odd.  
Halving quickly reduces the magnitude, while a subtraction is only needed to make an odd number even so that the next step can halve it.  
Thus the process naturally follows the binary representation of the number: every `1` bit causes a subtraction, and each bit position contributes a division.

## Approach
The algorithm repeatedly applies the rules until the number becomes zero:

1. Initialize a counter `step` to 0.  
2. While `num > 0`:
   - If `num` is even (`num % 2 == 0`), divide it by 2.  
   - Otherwise, subtract 1 from it.  
   - Increment `step`.  
3. Return `step`.

The loop directly implements the problem’s definition, performing at most one operation per iteration and updating the counter accordingly.

## Complexity
- **Time:** O(log num) – each division by two reduces the number’s magnitude, and the total number of iterations is bounded by twice the number of bits in `num`.  
- **Space:** O(1) – only a few integer variables are used, independent of the input size.

## Solution (Java)

```java
class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while(num > 0){
        if(num % 2==0){
            num = num/2;
        }else{
            num = num - 1;
        }
        step += 1;
    }
    return step;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.3 MB (beats 17.9%)

<sub>Synced by AILeetHub on 2026-10-05.</sub>
