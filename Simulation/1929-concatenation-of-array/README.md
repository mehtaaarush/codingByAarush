# 1929. Concatenation of Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/concatenation-of-array/)

`Array` · `Simulation`

## Intuition
The result array is simply two copies of the original array placed side by side.  
Instead of building the first half and then appending a copy, we can fill both halves in a single pass.

## Approach
1. Determine the length `n` of the input array.  
2. Allocate a new array `arr` of size `2*n`.  
3. Iterate `i` from `0` to `n-1`.  
   * Set `arr[i]` to `nums[i]` – this fills the first half.  
   * Set `arr[i+n]` to `nums[i]` – this places the same element in the second half.  
4. Return the fully populated `arr`.

This direct mapping guarantees that each element of `nums` appears twice in order, once at its original index and once offset by `n`.

## Complexity
- **Time:** O(n) – a single loop over the `n` elements.  
- **Space:** O(n) – the output array of size `2n` dominates additional memory usage.

## Solution (Java)

```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        for(int i = 0 ; i < n; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];

        }
        
        return arr;
    }
}
```

---

**Runtime** 1 ms (beats 97.5%) · **Memory** 47 MB (beats 85.7%)

<sub>Synced by AILeetHub on 2026-10-19.</sub>
