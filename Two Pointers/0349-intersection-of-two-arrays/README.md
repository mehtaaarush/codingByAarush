# 349. Intersection of Two Arrays

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)

`Array` · `Hash Table` · `Two Pointers` · `Binary Search` · `Sorting`

## Intuition  
The intersection of two arrays consists of the values that appear in both.  
Because duplicates are ignored in the result, a set is a natural data structure: it automatically removes duplicates and offers constant‑time membership checks.

## Approach  
1. **Build a set from the first array** – iterate `nums1` and insert each element into `set1`.  
2. **Collect common elements** – iterate `nums2`; for each element, if it exists in `set1`, add it to `resultSet`.  
   `resultSet` guarantees uniqueness of the intersection.  
3. **Convert the set to an array** – allocate an `int[]` of size `resultSet.size()` and copy each element from the set into the array.  
4. Return the resulting array.

This two‑pass strategy uses a hash table for O(1) look‑ups, ensuring that each element of both arrays is examined only once.

## Complexity  
- **Time:** O(n + m) – one pass over `nums1` and one over `nums2`.  
- **Space:** O(n + k) – `set1` holds up to `n` unique values, and `resultSet` holds at most `k` intersection elements (`k ≤ min(n, m)`).

## Solution (java)

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set1= new HashSet<>();
       HashSet<Integer> resultSet = new HashSet<>();

       for(int num : nums1){
        set1.add(num);
       }
       for(int num : nums2){
        if(set1.contains(num)){
            resultSet.add(num);
        }
       }
       int[] result = new int[resultSet.size()];
       int i = 0;
       for(int num : resultSet){
        result[i++] = num;
       }
    return result;

    }}
```

---

**Runtime** 2 ms · **Memory** 45.1 MB

<sub>Synced by AILeetHub on 2026-01-30.</sub>
