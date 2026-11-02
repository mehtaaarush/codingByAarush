# 977. Squares of a Sorted Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/squares-of-a-sorted-array/)

`Array` · `Two Pointers` · `Sorting`

## Intuition
The input array is already sorted, but squaring its elements can break that order because negative numbers become positive. A straightforward way to restore order is to square each element and then sort the resulting values.

## Approach
1. **Square in place** – Iterate over the array once, replacing each element with its square. This keeps the operation linear and uses the original array for storage.
2. **Sort the squared values** – Apply a standard sorting routine (`Arrays.sort`) to the modified array. Since the array now contains only non‑negative numbers, the sort will arrange them in non‑decreasing order.
3. **Return the sorted array** – The sorted, squared array is returned as the result.

This two‑step process leverages the built‑in sort, which is efficient for typical Java arrays.

## Complexity
- **Time:** O(n log n) – one linear pass to square elements plus an O(n log n) sort.
- **Space:** O(1) – the algorithm modifies the input array in place and uses only a constant amount of extra memory.

## Solution (Java)

```java
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = (nums[i]) * (nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
}
```

---

**Runtime** 10 ms (beats 34.2%) · **Memory** 46.7 MB (beats 94.2%)

<sub>Synced by AILeetHub on 2026-11-02.</sub>
