# 1822. Sign of the Product of an Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/sign-of-the-product-of-an-array/)

`Array` · `Math`

## Intuition  
The product of all numbers is zero as soon as any element equals zero, so we can short‑circuit in that case.  
If no zeros are present, the sign of the product depends solely on the parity of negative numbers: an even count yields a positive product, an odd count yields a negative product.  
Thus we only need to know whether the number of negatives is even or odd.

## Approach  
Traverse the array once.  
* If the current element is `0`, return `0` immediately.  
* If it is negative, increment a `negative` counter.  
After the loop, examine `negative % 2`.  
* If the remainder is `0`, return `1` (positive product).  
* Otherwise, return `-1` (negative product).  
This single pass avoids computing the actual product, preventing overflow and keeping the algorithm simple.

## Complexity  
- **Time:** O(n) – a single linear scan over `nums`.  
- **Space:** O(1) – only a counter and loop variables are used.

## Solution (Java)

```java
class Solution {
    public int arraySign(int[] nums) {
        int negative = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }

            if (nums[i] < 0) {
                negative++;
            }
        }

        if (negative % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
```

---

**Runtime** 1 ms (beats 26.9%) · **Memory** 45.1 MB (beats 74.2%)

<sub>Synced by AILeetHub on 2026-10-12.</sub>
