# 1979. Find Greatest Common Divisor of Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-greatest-common-divisor-of-array/)

`Array` · `Math` · `Number Theory` · `Euclidean Algorithm` · `Greatest Common Divisor`

## Intuition
The answer depends only on the smallest and largest elements of the array.  
If we know these two numbers, the greatest common divisor (GCD) is the largest integer that divides both.  
Because the numbers are bounded by 1000, a simple trial division from the smaller number downwards is fast enough.

## Approach
1. **Find extremes** – Iterate once over `nums` to record the minimum (`smallest`) and maximum (`largest`).  
2. **Trial division** – Starting from `smallest` and decreasing to 1, check whether the current divisor divides both `smallest` and `largest`.  
   - The first divisor that satisfies both conditions is the GCD, so return it immediately.  
3. If no divisor greater than 1 is found, return 1 (the loop guarantees this never happens, but it satisfies the return type).

This method directly follows the definition of GCD and leverages the small input range to keep the search trivial.

## Complexity
- **Time:** O(n + s) – one pass to find min/max (O(n)) plus a loop up to the smallest element `s` (≤ 1000).  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }

            if(nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        for(int div = smallest; div >= 1; div--) {
            if(smallest % div == 0 && largest % div == 0) {
                return div;
            }
        }

        return 1;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 44.7 MB (beats 93.9%)

<sub>Synced by AILeetHub on 2026-10-20.</sub>
