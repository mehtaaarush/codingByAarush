# 704. Binary Search

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/binary-search/)

`Array` · `Binary Search`

## Intuition  
The array is sorted in strictly increasing order, so the position of any element can be determined by repeatedly discarding half of the remaining candidates. This is the classic binary search idea: compare the target with the middle element and keep only the half that could still contain the target.

## Approach  
1. Set two pointers, `low` at the first index and `high` at the last.  
2. While `low <= high`:  
   * Compute `mid` as `low + (high - low) / 2` to avoid integer overflow.  
   * If `nums[mid]` equals the target, return `mid`.  
   * If `nums[mid]` is smaller, the target must lie to the right, so set `low = mid + 1`.  
   * Otherwise, it lies to the left, so set `high = mid - 1`.  
3. If the loop exits, the target is absent; return `-1`.  
The algorithm relies on the array’s uniqueness and ordering, guaranteeing that each comparison eliminates exactly half of the remaining search space.

## Complexity  
- **Time:** O(log n) – each iteration halves the interval, leading to logarithmic steps.  
- **Space:** O(1) – only a constant number of integer variables are used, independent of input size.

## Solution (java)

```java
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high  = nums.length - 1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]< target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
```

---

**Runtime** 0 ms · **Memory** 48.7 MB

<sub>Synced by AILeetHub on 2026-01-11.</sub>
