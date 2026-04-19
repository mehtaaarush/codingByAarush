# 1855. Maximum Distance Between a Pair of Values

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/)

`Array` · `Two Pointers` · `Binary Search`

## Approach

Accepted medium solution in java.
Relevant topics: Array, Two Pointers, Binary Search.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res = 0;
        int i = 0;
        int j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <=nums2[j]){
                res = Math.max(res,j-i);
                j++;
            }else{
                i++;
            }

        }
        return res;
//         for(int i = 0 ; i<n;i++){
//             for(int j = i; j<m;j++){
//                 if(nums1[i] <=nums2[j]){
//                     res = Math.max(res,j - i);
//                 }
//             }
//         }
//         return res;
     }
 }
```

---

**Runtime** 3 ms · **Memory** 90 MB

<sub>Synced by AILeetHub on 2026-04-19.</sub>
