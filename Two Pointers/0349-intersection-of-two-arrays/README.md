# 349. Intersection of Two Arrays

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)

`Array` · `Hash Table` · `Two Pointers` · `Binary Search` · `Sorting`

## Intuition  
The intersection consists of values that appear in both arrays.  
Because the result must contain each value only once, a set is a natural data structure to collect matches while automatically removing duplicates.

## Approach  
The solution iterates over every element of `nums1` and, for each, scans all elements of `nums2`.  
Whenever a pair of equal values is found, that value is inserted into a `HashSet`.  
After the double loop, the set holds exactly the distinct elements present in both arrays.  
Finally, the set is copied into a new integer array, which is returned.

This straightforward method guarantees that every possible pair is examined, so no intersection element is missed. The use of a set ensures uniqueness without additional checks.

## Complexity  
- **Time:** O(n × m) – the nested loops compare each element of `nums1` with every element of `nums2`.  
- **Space:** O(min(n, m)) – the hash set stores at most the smaller array’s distinct elements, which bounds the additional memory usage.

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

**Runtime** 7 ms (beats 14.0%) · **Memory** 44.4 MB (beats 93.2%)

<sub>Synced by AILeetHub on 2026-10-31.</sub>
