# 349. Intersection of Two Arrays

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)

`Array` · `Hash Table` · `Two Pointers` · `Binary Search` · `Sorting`

## Intuition
The intersection of two arrays is the set of values that appear in both.  
Because duplicates are ignored in the result, a hash‑based set naturally removes them while we collect matches.

## Approach
1. Create an empty `HashSet<Integer>` to store unique intersection elements.  
2. Iterate over every element `x` in `nums1`.  
   * For each `x`, iterate over every element `y` in `nums2`.  
   * If `x == y`, add `x` to the set.  
3. After both loops finish, the set contains all distinct values present in both arrays.  
4. Convert the set into an `int[]` by iterating over the set and copying each element into a new array.  
5. Return the array.

The nested loops guarantee that every pair of elements is compared, so any common value is detected. The set ensures that each common value appears only once in the final result.

## Complexity
- **Time:** O(n × m) – each element of `nums1` is compared with every element of `nums2`.  
- **Space:** O(k) – the set holds at most `k = min(n, m)` distinct intersection elements, and the output array has the same size.

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
