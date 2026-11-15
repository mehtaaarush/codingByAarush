# 53. Maximum Subarray

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-subarray/)

`Array` · `Divide and Conquer` · `Dynamic Programming`

## Intuition
The maximum‑sum subarray can be built incrementally. While scanning the array, keep a running total of the current subarray. If this total ever becomes negative, it can never contribute to a larger sum later, so we discard it and start fresh from the next element. The best sum seen so far is stored separately.

## Approach
Initialize `sum` to 0 and `maxSum` to the smallest possible integer. For each element `x` in `nums`:
1. Add `x` to `sum`.
2. Update `maxSum` with `Math.max(sum, maxSum)`.
3. If `sum` drops below 0, reset it to 0 because any subarray starting before this point would be worse than starting anew.

After the loop, `maxSum` holds the largest subarray sum. This single pass handles arrays with all negative numbers because `maxSum` starts at `Integer.MIN_VALUE` and is updated before any reset.

## Complexity
- **Time:** O(n) – one linear scan of the array.  
- **Space:** O(1) – only a few integer variables are used.

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

**Runtime** 1 ms (beats 100.0%) · **Memory** 76.7 MB (beats 84.5%)

<sub>Synced by AILeetHub on 2026-11-15.</sub>
