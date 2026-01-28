# 88. Merge Sorted Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/merge-sorted-array/)

`Array` · `Two Pointers` · `Sorting`

## Approach

Accepted easy solution in java.
Relevant topics: Array, Two Pointers, Sorting.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m+n];
        int index = 0;

        for(int i = 0 ; i < m ; i++){
            temp[index++] = nums1[i];
        }
        for(int i = 0 ; i < n ; i++){
            temp[index++] = nums2[i];
        }
        Arrays.sort(temp);

        for(int i = 0;i < m+n ; i++){
            nums1[i] = temp[i];
        }
        
        
    }
}
```

---

**Runtime** 4 ms · **Memory** 44.3 MB

<sub>Synced by AILeetHub on 2026-01-28.</sub>
