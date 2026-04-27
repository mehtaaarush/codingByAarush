# 209. Minimum Size Subarray Sum

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/minimum-size-subarray-sum/)

`Array` · `Binary Search` · `Sliding Window` · `Prefix Sum`

## Intuition  
The array contains only positive numbers, so extending a subarray can only increase its sum.  
This monotonicity allows a two‑pointer “sliding window” that expands to reach the target sum and then contracts to find the smallest possible window.

## Approach  
1. Initialise two indices, `left` at the start and `right` that will iterate through the array.  
2. Keep a running `sum` of the current window `[left, right]`.  
3. For each `right`, add `nums[right]` to `sum`.  
4. While `sum` is at least `target`, the current window satisfies the requirement.  
   * Update `minLen` with the smaller of its current value and the window length `right - left + 1`.  
   * Shrink the window from the left by subtracting `nums[left]` from `sum` and incrementing `left`.  
5. After the loop, if `minLen` was never updated, return `0`; otherwise return `minLen`.

This process guarantees that every possible subarray is considered exactly once, and the window is always the smallest that ends at the current `right`.

## Complexity  
- **Time:** O(n) – each element is added to and removed from the sum at most once.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (java)

```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0 , sum = 0 , minLen = Integer.MAX_VALUE;

        for(int right = 0 ; right < nums.length ; right++){
            sum += nums[right];
        
        while(sum>=target){
            minLen = Math.min(minLen, right - left + 1);
            sum -=nums[left];
            left++;
        }
        }
        return minLen==Integer.MAX_VALUE ? 0 : minLen;

    }
}
```

---

**Runtime** 1 ms · **Memory** 61.8 MB

<sub>Synced by AILeetHub on 2026-04-27.</sub>
