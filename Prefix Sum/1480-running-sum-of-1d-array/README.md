# 1480. Running Sum of 1d Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/running-sum-of-1d-array/)

`Array` · `Prefix Sum`

## Intuition  
The running sum at position *i* is simply the sum of all elements from the start up to *i*.  
If we already know the running sum up to *i‑1*, we can obtain the sum up to *i* by adding the current element to that value. This observation allows us to compute the entire array in a single left‑to‑right pass without any extra storage.

## Approach  
1. Let *n* be the length of the input array.  
2. Starting from index 1, iterate through the array.  
3. For each index *i*, replace `nums[i]` with `nums[i] + nums[i‑1]`.  
   - `nums[i‑1]` now holds the running sum up to the previous element, so the addition yields the running sum up to *i*.  
4. After the loop, `nums` contains the desired running sums, which is returned.

The algorithm modifies the input array in place, so no additional arrays are created.

## Complexity  
- **Time:** O(n) – a single traversal of the array.  
- **Space:** O(1) – only a few integer variables are used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;

        for(int i = 1 ; i < n ; i++){
            nums[i] = nums[i] + nums[i-1];
        }
    return nums;

    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 44.1 MB (beats 85.5%)

<sub>Synced by AILeetHub on 2026-10-12.</sub>
