# 643. Maximum Average Subarray I

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)

`Array` · `Sliding Window`

## Intuition
The maximum‑average subarray of fixed length `k` is equivalent to the subarray with the maximum sum, because the divisor `k` is constant for all candidates. Thus, we only need to find the contiguous block of `k` elements that yields the largest sum.

## Approach
1. Compute the sum of the first `k` elements; this is the initial window sum.
2. Record this sum as the current maximum.
3. Slide the window one position at a time:  
   - Add the new element entering the window (`nums[i]`).  
   - Subtract the element leaving the window (`nums[i-k]`).  
   - Update the maximum if the new window sum is larger.
4. After processing all windows, divide the maximum sum by `k` to obtain the average.

The sliding window updates the sum in constant time per step, ensuring that each element is added and removed exactly once.

## Complexity
- **Time:** O(n) – a single pass over the array, with constant‑time operations per element.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (java)

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i = 0; i < k;i++){
            sum = sum + nums[i];
        }
        int maxSum = sum;

        for(int i = k ; i<nums.length;i++){
            sum = sum + nums[i];
            sum = sum - nums[i-k];
            maxSum = Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
    }
}
```

---

**Runtime** 3 ms · **Memory** 69.7 MB

<sub>Synced by AILeetHub on 2026-01-12.</sub>
