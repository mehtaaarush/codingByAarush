# 53. Maximum Subarray

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-subarray/)

`Array` · `Divide and Conquer` · `Dynamic Programming`

## Approach

Accepted medium solution in java.
Relevant topics: Array, Divide and Conquer, Dynamic Programming.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int current = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            current = Math.max(nums[i],current+nums[i]);
            maxSum = Math.max(current,maxSum);

        }
        return maxSum;
    }
}
```

---

**Runtime** 1 ms · **Memory** 77 MB

<sub>Synced by AILeetHub on 2026-04-23.</sub>
