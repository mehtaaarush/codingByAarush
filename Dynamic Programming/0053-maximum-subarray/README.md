# 53. Maximum Subarray

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-subarray/)

`Array` · `Divide and Conquer` · `Dynamic Programming`

## Intuition
The maximum‑sum subarray can be built incrementally: as we scan the array, we keep a running total of the current subarray. If this total ever becomes negative, it can never contribute to a larger sum later, so we discard it and start fresh. The best sum seen so far is stored separately.

## Approach
The implementation follows Kadane’s algorithm.  
1. Initialize `sum` to 0 and `maxSum` to the smallest integer.  
2. Iterate through each element `nums[i]`.  
   - Add the element to `sum`.  
   - Update `maxSum` with the larger of `sum` and `maxSum`.  
   - If `sum` drops below 0, reset it to 0, because any subarray starting before this point would only reduce future sums.  
3. After the loop, `maxSum` holds the maximum subarray sum and is returned.

This single pass ensures that every possible subarray ending at each index is considered, while negative prefixes are discarded to keep the running sum as high as possible.

## Complexity
- **Time:** O(n) – one linear scan over the array.  
- **Space:** O(1) – only a few integer variables are used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            maxSum = Math.max(sum , maxSum);

            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
```

---

**Runtime** 1 ms (beats 100.0%) · **Memory** 76.1 MB (beats 99.2%)

<sub>Synced by AILeetHub on 2026-11-27.</sub>
