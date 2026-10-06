# 191. Number of 1 Bits

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/number-of-1-bits/)

`Divide and Conquer` · `Bit Manipulation`

## Intuition  
The Hamming weight of an integer is simply the number of `1` bits in its binary representation. By converting the integer to a string of bits, each character can be inspected directly, making the counting straightforward.

## Approach  
1. Convert the integer `n` to its binary string using `Integer.toBinaryString(n)`.  
2. Initialize a counter to zero.  
3. Iterate over each character of the string.  
4. If the character is `'1'`, increment the counter.  
5. After the loop, return the counter value.  
This method leverages Java’s built‑in conversion to avoid manual bit manipulation, trading a small amount of memory for simplicity.

## Complexity  
- **Time:** O(k) – where *k* is the number of bits in `n` (≤ 31), because each bit is examined once.  
- **Space:** O(k) – the binary string stores one character per bit, so the auxiliary space grows linearly with the bit length.

## Solution (Java)

```java
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for(int i = 0 ; i < binary.length() ; i++){
            if(binary.charAt(i)=='1'){
                count += 1;
            }
        }
        return count;
    }
}
```

---

**Runtime** 1 ms (beats 29.9%) · **Memory** 42.6 MB (beats 11.8%)

<sub>Synced by AILeetHub on 2026-10-06.</sub>
