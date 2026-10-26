# 414. Third Maximum Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/third-maximum-number/)

`Array` · `Sorting`

## Intuition  
The third maximum must be one of the largest values in the array.  
By sorting the array ascending, the largest values appear at the end.  
Scanning from the end while skipping duplicates lets us count distinct maxima
without extra data structures.

## Approach  
1. Sort `nums` in ascending order.  
2. Initialize a counter `count = 1` (the largest element is the first distinct maximum).  
3. Iterate from the second‑to‑last element down to the first.  
   * If the current element differs from the next one, increment `count`.  
   * When `count` reaches 3, the current element is the third distinct maximum; return it.  
4. If the loop finishes without reaching a count of 3, the array contains fewer than three distinct values; return the last element (the maximum).

The algorithm relies on the sorted order to identify distinct values by simple equality checks and uses a single pass after sorting.

## Complexity  
- **Time:** O(n log n) – sorting dominates the runtime.  
- **Space:** O(1) – the sort is in‑place and only a few variables are used.

## Solution (Java)

```java
class Solution {
    public int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int count = 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != nums[i + 1]) {
                count++;
            }

            if (count == 3) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
```

---

**Runtime** 7 ms (beats 30.5%) · **Memory** 44.8 MB (beats 50.2%)

<sub>Synced by AILeetHub on 2026-10-26.</sub>
