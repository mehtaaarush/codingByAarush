# 1480. Running Sum of 1d Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/running-sum-of-1d-array/)

`Array` · `Prefix Sum`

## Intuition
The running sum at position *i* is simply the sum of all elements up to that index. Instead of recomputing the sum from scratch for each position, we can build it incrementally: once we know the sum up to *i‑1*, the sum up to *i* is that value plus *nums[i]*. This observation turns the problem into a single left‑to‑right pass.

## Approach
We keep the input array as the output to avoid extra allocation. Starting from the second element (index 1), we replace each entry with the sum of itself and the previous entry. Concretely, for every `i` from 1 to n‑1 we perform `nums[i] += nums[i‑1]`. After the loop, `nums` contains the desired running sums and is returned.

## Complexity
- **Time:** O(n) – one linear scan over the array.  
- **Space:** O(1) – updates are done in place; no additional data structures are used.

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

**Runtime** 0 ms (beats 100.0%) · **Memory** 43.7 MB (beats 96.7%)

<sub>Synced by AILeetHub on 2026-10-19.</sub>
