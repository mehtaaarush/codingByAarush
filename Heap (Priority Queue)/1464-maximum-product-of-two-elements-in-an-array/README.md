# 1464. Maximum Product of Two Elements in an Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/)

`Array` · `Sorting` · `Heap (Priority Queue)`

## Intuition  
The expression \((nums[i]-1)\times(nums[j]-1)\) is maximized when both factors are as large as possible.  
Since subtracting 1 is a monotonic transformation, the two largest values in the array will produce the largest product after the subtraction. Thus the problem reduces to finding the two maximum elements.

## Approach  
Iterate once through the array while maintaining two variables: `max` (the largest seen so far) and `smax` (the second largest).  
For each element `x`:
1. If `x` exceeds `max`, shift the current `max` to `smax` and set `max` to `x`.  
2. Otherwise, if `x` exceeds `smax`, update `smax` to `x`.  
After the loop, compute \((max-1)\times(smax-1)\) and return it.  
This single pass guarantees that `max` and `smax` are the two greatest numbers in the array.

## Complexity  
- **Time:** O(n) – one traversal of the array.  
- **Space:** O(1) – only two integer variables are used regardless of input size.

## Solution (java)

```java
class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int smax = -1;

        for(int i = 0; i<nums.length;i++){
            if(max<nums[i]){
                smax = max;
                max = nums[i];
            }else if( smax<nums[i]){
                smax = nums[i];
                
            }}
            int ans = (max-1) * (smax-1);

            return ans;
        }}

```

---

**Runtime** 1 ms · **Memory** 44.3 MB

<sub>Synced by AILeetHub on 2025-12-14.</sub>
