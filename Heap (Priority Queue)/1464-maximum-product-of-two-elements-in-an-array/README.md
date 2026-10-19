# 1464. Maximum Product of Two Elements in an Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/)

`Array` · `Sorting` · `Heap (Priority Queue)`

## Intuition  
The expression to maximize is \((a-1)(b-1)\) where \(a\) and \(b\) are two distinct elements of the array.  
Since subtraction by 1 is monotonic, the product is maximized when \(a\) and \(b\) are the two largest values in the array.  
Thus the problem reduces to finding the two maximum elements.

## Approach  
1. Sort the array in ascending order.  
2. The last two elements of the sorted array are the two largest values.  
3. Compute \((nums[n-1]-1) \times (nums[n-2]-1)\) and return the result.  
Sorting guarantees that the largest two elements are at the end, so no additional scanning is required.

## Complexity  
- **Time:** \(O(n \log n)\) – sorting dominates the runtime.  
- **Space:** \(O(1)\) – the sort is performed in place, requiring only constant extra memory.

## Solution (Java)

```java
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        

        return (nums[n-1]-1)* (nums[n-2] -1);

        
    }
}
```

---

**Runtime** 5 ms (beats 38.8%) · **Memory** 44.6 MB (beats 42.2%)

<sub>Synced by AILeetHub on 2026-10-19.</sub>
