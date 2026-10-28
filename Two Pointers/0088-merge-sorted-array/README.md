# 88. Merge Sorted Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/merge-sorted-array/)

`Array` · `Two Pointers` · `Sorting`

## Intuition  
The goal is to merge two sorted arrays into the first one without allocating extra space for the result.  
The provided solution sidesteps the two‑pointer in‑place strategy by creating a temporary array that holds all meaningful elements, then sorting the final array.

## Approach  
1. Allocate a new array `arr` of size `m + n`.  
2. Copy the first `m` non‑zero elements from `nums1` into `arr`.  
3. Append all `n` elements of `nums2` to `arr`.  
4. Copy the sorted contents of `arr` back into `nums1`.  
5. Finally, sort `nums1` with `Arrays.sort`, which orders the merged values.

This method guarantees that `nums1` ends up containing the merged, sorted sequence, but it does not exploit the fact that the input arrays are already sorted.

## Complexity  
- **Time:** O((m + n) log(m + n)) – the dominant cost is the final sort of the combined array.  
- **Space:** O(m + n) – an auxiliary array of the same size as the merged result is allocated.

## Solution (Java)

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        int k = 0;

        for(int i = 0 ; i < nums1.length ; i++){
            if(nums1[i] != 0){
                arr[k] = nums1[i];
                k++;
            }
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

**Runtime** 4 ms (beats 15.1%) · **Memory** 43.8 MB (beats 54.4%)

<sub>Synced by AILeetHub on 2026-10-28.</sub>
