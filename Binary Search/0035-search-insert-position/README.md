# 35. Search Insert Position

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/search-insert-position/)

`Array` · `Binary Search`

## Intuition
The array is sorted and contains distinct values, so a binary search can locate the target or determine where it would fit.  
If the target exists, its index is returned.  
If it does not exist, the index where it should be inserted is the first position where all elements to the left are smaller and all to the right are larger.

## Approach
Maintain two pointers, `low` and `high`, representing the current search window.  
While `low <= high`, compute the middle index `mid` using `low + (high - low) / 2` to avoid overflow.  
* If `nums[mid]` equals the target, return `mid`.  
* If `nums[mid]` is less than the target, the target must be to the right, so set `low = mid + 1`.  
* Otherwise, it must be to the left, so set `high = mid - 1`.  
When the loop ends, `low` points to the smallest index where the target could be inserted while maintaining order, so return `low`.

## Complexity
- **Time:** O(log n) – each iteration halves the search interval.  
- **Space:** O(1) – only a constant number of integer variables are used.

## Solution (java)

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}

```

---

**Runtime** 0 ms · **Memory** 45 MB

<sub>Synced by AILeetHub on 2026-01-11.</sub>
