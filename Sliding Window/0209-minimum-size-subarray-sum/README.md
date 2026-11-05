# 209. Minimum Size Subarray Sum

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/minimum-size-subarray-sum/)

`Array` · `Binary Search` · `Sliding Window` · `Prefix Sum`

## Intuition  
The array contains only positive numbers, so extending the right end of a subarray can only increase its sum, while moving the left end to the right can only decrease it. This monotonicity allows a two‑pointer (sliding window) technique: grow the window until the sum meets or exceeds the target, then shrink it from the left to find the smallest window that still satisfies the condition.

## Approach  
Maintain two indices, `left` and `right`, and a running `sum`.  
1. Iterate `right` from 0 to `nums.length-1`, adding `nums[right]` to `sum`.  
2. While `sum` is at least `target`, update the minimal length (`right - left + 1`), subtract `nums[left]` from `sum`, and increment `left` to shrink the window.  
3. After the loop, if no window was found (`minLength` unchanged), return 0; otherwise return `minLength`.

This ensures every element is added once and removed once, yielding an optimal linear scan.

## Complexity  
- **Time:** O(n) – each element is processed at most twice (once when added, once when removed).  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
                
                while(sum >= target){
                    minLength = Math.min(minLength, right - left + 1);
                    sum -= nums[left];
                    left++;
                }
            }   

        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
    }
}
```

---

**Runtime** 1 ms (beats 99.8%) · **Memory** 68.9 MB (beats 72.7%)

<sub>Synced by AILeetHub on 2026-11-05.</sub>
