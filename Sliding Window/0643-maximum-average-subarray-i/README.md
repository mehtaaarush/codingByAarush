# 643. Maximum Average Subarray I

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-average-subarray-i/)

`Array` · `Sliding Window`

## Intuition
The average of a subarray of fixed length k is its sum divided by k.  
Since k is constant, maximizing the average is identical to maximizing the sum.  
Thus the problem reduces to finding the contiguous block of k elements with the largest total.

## Approach
1. Compute the sum of the first k elements; store it as both the current window sum and the current maximum sum.  
2. Slide the window one position at a time: for each new index i (≥ k) subtract the element that leaves the window (`nums[i‑k]`) and add the new element (`nums[i]`).  
3. After each slide, update the maximum sum if the new window sum is larger.  
4. When the scan finishes, divide the maximum sum by k and return the result as a `double`.

This single‑pass sliding‑window technique guarantees that every possible length‑k subarray is considered exactly once.

## Complexity
- **Time:** O(n) – one linear traversal of the array.  
- **Space:** O(1) – only a handful of integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int sum = 0;

       for(int i = 0 ; i < k ; i++){
            sum += nums[i];
       }
       int maxSum = sum;
       
        for(int i = k; i < nums.length; i++){
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}
```

---

**Runtime** 3 ms (beats 78.4%) · **Memory** 69 MB (beats 89.7%)

<sub>Synced by AILeetHub on 2026-11-04.</sub>
