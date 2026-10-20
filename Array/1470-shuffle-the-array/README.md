# 1470. Shuffle the Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/shuffle-the-array/)

`Array`

## Intuition  
The input array is split into two equal halves: the first `n` elements are the `x` values and the last `n` elements are the `y` values.  
To interleave them we need to place each `x[i]` immediately before its corresponding `y[i]`.  
Because the output length is known (exactly `2n`), we can construct a new array and fill it sequentially.

## Approach  
1. Allocate a new integer array `arr` of length `2*n`.  
2. Iterate `i` from `0` to `n-1`.  
   * Set `arr[2*i]` to `nums[i]` (the `x` element).  
   * Set `arr[2*i+1]` to `nums[n + i]` (the matching `y` element).  
3. Return the populated array.

This direct mapping preserves the required order `[x1, y1, x2, y2, …]` without modifying the original array.

## Complexity  
- **Time:** O(n) – a single loop over `n` elements performs constant‑time assignments.  
- **Space:** O(n) – the new array of size `2n` holds the shuffled result.

## Solution (Java)

```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i = 0 ; i < n; i++){
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[n + i];
        }
        return arr;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 46.2 MB (beats 92.8%)

<sub>Synced by AILeetHub on 2026-10-20.</sub>
