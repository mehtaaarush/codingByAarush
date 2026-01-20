# 136. Single Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/single-number/)

`Array` · `Bit Manipulation`

## Intuition  
The XOR operation has two key properties that make it ideal for this problem:  
1. **Self‑cancellation** – `x ^ x = 0`.  
2. **Identity** – `x ^ 0 = x`.  

Because every number except one appears exactly twice, XORing all elements will cancel out the duplicates, leaving only the unique number.

## Approach  
Initialize a variable `result` to 0. Iterate through the array, updating `result` with `result ^ num` for each element. After processing the entire array, `result` holds the single number that never had a duplicate to cancel it out. This works for negative numbers as well because XOR operates on the binary representation of integers.

## Complexity  
- **Time:** O(n) – each element is visited once.  
- **Space:** O(1) – only a single integer variable is used, regardless of input size.

## Solution (java)

```java
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result = result ^ num;
        }
        return result;
    }
}
```

---

**Runtime** 1 ms · **Memory** 46.8 MB

<sub>Synced by AILeetHub on 2026-01-20.</sub>
