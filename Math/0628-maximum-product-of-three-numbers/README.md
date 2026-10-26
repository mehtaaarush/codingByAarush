# 628. Maximum Product of Three Numbers

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-product-of-three-numbers/)

`Array` · `Math` · `Sorting`

## Intuition
The maximum product of three numbers can only come from two patterns:  
1. The three largest values in the array.  
2. The two smallest values (which may be negative) multiplied together with the largest value.  
Sorting the array places the extremes at the ends, making it trivial to evaluate both possibilities.

## Approach
1. Sort `nums` in ascending order.  
2. Let `n` be the length.  
3. Compute `product1 = nums[n-1] * nums[n-2] * nums[n-3]` – product of the three largest numbers.  
4. Compute `product2 = nums[0] * nums[1] * nums[n-1]` – product of the two smallest numbers and the largest number.  
5. Return the larger of `product1` and `product2`.

This directly implements the observation that only these two combinations can yield the maximum product.

## Complexity
- **Time:** O(n log n) – sorting dominates the runtime.  
- **Space:** O(1) – the sort is performed in place and only a few integer variables are used.

## Solution (Java)

```java
class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        
        int n = nums.length;

        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
        int product2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(product1 , product2);
    }
}
```

---

**Runtime** 17 ms (beats 8.8%) · **Memory** 47.4 MB (beats 75.9%)

<sub>Synced by AILeetHub on 2026-10-26.</sub>
