# 191. Number of 1 Bits

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/number-of-1-bits/)

`Divide and Conquer` · `Bit Manipulation`

## Intuition  
The Hamming weight of an integer is the number of 1‑bits in its binary representation.  
By repeatedly examining the least significant bit (LSB) and then discarding it, we can count all set bits one by one.  
The expression `n & 1` isolates the LSB: it yields 1 if that bit is set, otherwise 0.  
Shifting the integer right by one (`n >> 1`) moves the next bit into the LSB position, preparing it for the next iteration.

## Approach  
1. Start with a counter `count = 0`.  
2. While the integer `n` is not zero:  
   * Add the value of `n & 1` to `count`.  
   * Right‑shift `n` by one (`n = n >> 1`).  
3. When `n` becomes zero, all bits have been processed; return `count`.  

This loop visits each bit of `n` exactly once. Because the input is a 32‑bit signed integer, the loop runs at most 31 times (the most significant bit is always 0 for positive numbers). The algorithm uses only a few integer variables and no additional data structures.

## Complexity  
- **Time:** O(b) where *b* is the number of bits in `n` (≤ 31). Each iteration handles one bit, so the total work is linear in the bit length.  
- **Space:** O(1). Only a constant amount of extra memory (the counter and the loop variable) is used, independent of input size.

## Solution (java)

```java
class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while(n!=0){
            count+= (n&1);
            n = n >> 1;
        }
        return count;
    }
}
```

---

**Runtime** 0 ms · **Memory** 42.3 MB

<sub>Synced by AILeetHub on 2026-05-07.</sub>
