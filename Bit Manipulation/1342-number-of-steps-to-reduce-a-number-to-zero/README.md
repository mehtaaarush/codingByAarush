# 1342. Number of Steps to Reduce a Number to Zero

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/)

`Math` · `Bit Manipulation`

## Intuition
The process mimics how a binary representation shrinks: an even number ends with 0, so dividing by 2 simply removes that trailing zero; an odd number ends with 1, so subtracting 1 turns the trailing 1 into 0, making the next step an even division. Repeating these two operations will eventually clear all bits of the integer.

## Approach
We iterate while the current value is greater than zero. For each iteration we check the parity of the number. If it is even, we halve it; if it is odd, we decrement it by one. After performing the operation we increment a counter that tracks the number of steps taken. The loop terminates when the number reaches zero, at which point the counter holds the total steps required.

## Complexity
- **Time:** O(log num) – each division removes one binary digit, and each subtraction turns an odd digit into an even one, so the total number of iterations is proportional to the number of bits in `num`.
- **Space:** O(1) – only a few integer variables are used regardless of input size.

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

**Runtime** 0 ms (beats 100.0%) · **Memory** 42 MB (beats 86.7%)

<sub>Synced by AILeetHub on 2026-10-13.</sub>
