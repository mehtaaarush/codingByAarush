# 349. Intersection of Two Arrays

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)

`Array` · `Hash Table` · `Two Pointers` · `Binary Search` · `Sorting`

## Intuition
The intersection of two arrays consists of all values that appear in both lists.  
Because the result must contain each value only once, a set is a natural data structure to deduplicate automatically while collecting matches.

## Approach
The solution iterates over every element of `nums1` and, for each one, scans the entire `nums2`.  
Whenever a pair of equal elements is found, the value is inserted into a `HashSet`.  
After both loops finish, the set contains every distinct number that appears in both arrays.  
Finally, the set is copied into a new integer array, which is returned.

This straightforward double‑loop guarantees that all possible pairs are examined, and the set ensures uniqueness without extra checks.

## Complexity
- **Time:** O(n × m) – each element of `nums1` is compared with every element of `nums2`.  
- **Space:** O(min(n, m)) – the set stores at most the smaller array’s distinct elements, and the result array has the same size.

## Solution (Java)

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int k = 0;

        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        int[] arr = new int[set.size()];
        for (int num : set) {
            arr[k] = num;
            k++;
        }
        return arr;
    }
}
```

---

**Runtime** 7 ms (beats 14.0%) · **Memory** 44.1 MB (beats 97.6%)

<sub>Synced by AILeetHub on 2026-10-31.</sub>
