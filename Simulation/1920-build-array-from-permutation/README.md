# 1920. Build Array from Permutation

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/build-array-from-permutation/)

`Array` · `Simulation`

## Intuition
The task is to build a new array where each element is the value two steps ahead in the given permutation. Because the input is a zero‑based permutation, every index is valid and unique, so we can compute each result independently in a single pass.

## Approach
1. Determine the length `n` of `nums` and allocate a new array `arr` of the same size.  
2. Iterate `i` from `0` to `n-1`.  
   - Compute the intermediate index `j = nums[i]`.  
   - Retrieve the value `nums[j]` and assign it to `arr[i]`.  
3. After the loop, return `arr`.  
This directly implements the definition `ans[i] = nums[nums[i]]`. The algorithm only reads from the input array and writes to the new array; it does not modify the original permutation.

## Complexity
- **Time:** O(n) – one linear scan over the array, constant work per element.  
- **Space:** O(n) – an auxiliary array of length `n` is created to store the result.

## Solution (Java)

```java
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
```

---

**Runtime** 1 ms (beats 99.6%) · **Memory** 46.5 MB (beats 97.8%)

<sub>Synced by AILeetHub on 2026-10-19.</sub>
