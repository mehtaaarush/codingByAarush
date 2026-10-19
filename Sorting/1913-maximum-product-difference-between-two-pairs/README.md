# 1913. Maximum Product Difference Between Two Pairs

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-product-difference-between-two-pairs/)

`Array` · `Sorting` · `Quicksort`

## Intuition  
The product difference is maximized when one pair has the largest possible product and the other pair the smallest possible product.  
Because all array elements are positive, the largest product comes from the two greatest numbers, and the smallest product comes from the two smallest numbers. Thus the answer is simply  
`(max1 * max2) – (min1 * min2)`.

## Approach  
1. **Sort** the array in ascending order.  
2. The two smallest values are at indices `0` and `1`; the two largest values are at indices `n‑2` and `n‑1`.  
3. Compute their products and return the difference.  
The implementation uses `Math.abs` to guard against negative results, though for positive inputs the difference is always non‑negative.

## Complexity  
- **Time:** O(n log n) – sorting dominates the runtime.  
- **Space:** O(1) – only a few integer variables are used; the sort is in‑place.

## Solution (Java)

```java
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return Math.abs((nums[0]*nums[1]) - (nums[nums.length -1 ]*nums[nums.length - 2]));
    }
}
```

---

**Runtime** 10 ms (beats 58.6%) · **Memory** 47.5 MB (beats 46.3%)

<sub>Synced by AILeetHub on 2026-10-19.</sub>
