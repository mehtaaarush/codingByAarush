# 88. Merge Sorted Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/merge-sorted-array/)

`Array` · `Two Pointers` · `Sorting`

## Intuition  
The goal is to combine two sorted arrays into one sorted array stored in `nums1`.  
Instead of merging element‑by‑element, the solution first gathers all relevant values into a temporary array, then relies on a built‑in sort to order them.

## Approach  
1. Allocate a new array `arr` of length `m + n`.  
2. Copy the first `m` elements of `nums1` into `arr`.  
3. Append all `n` elements of `nums2` to `arr`.  
4. Copy the sorted contents of `arr` back into `nums1`.  
5. Finally, call `Arrays.sort(nums1)` to sort the combined array in place.  
This method treats the merge as a two‑step process: concatenation followed by a full sort, rather than a classic two‑pointer merge.

## Complexity  
- **Time:** O((m + n) log(m + n)) – the dominant cost is the final `Arrays.sort` call on the combined array.  
- **Space:** O(m + n) – an auxiliary array of size `m + n` is used to hold all elements before copying back.

## Solution (Java)

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int k = 0;

        for(int i = 0 ; i < m ; i++){
            
                arr[k] = nums1[i];
                k++;
            
        }
        for(int i = 0 ; i < nums2.length ; i++){
            arr[k] = nums2[i];
            k++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            nums1[i] = arr[i];
        }
        Arrays.sort(nums1);
    }
}
```

---

**Runtime** 4 ms (beats 15.1%) · **Memory** 43.7 MB (beats 68.0%)

<sub>Synced by AILeetHub on 2026-10-28.</sub>
