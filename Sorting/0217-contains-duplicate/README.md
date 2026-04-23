# 217. Contains Duplicate

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/contains-duplicate/)

`Array` · `Hash Table` · `Sorting`

## Intuition
To determine if any value appears twice, we need a fast way to check whether a number has already been seen. A hash‑based set offers constant‑time membership tests, making it ideal for this task.

## Approach
1. Create an empty `HashSet<Integer>` called `seenNumbers`.  
2. Iterate over each element `num` in the input array `nums`.  
3. For each `num`, check `seenNumbers.contains(num)`.  
   * If it returns `true`, a duplicate has been found; immediately return `true`.  
   * If it returns `false`, add `num` to the set and continue.  
4. If the loop completes without finding a duplicate, return `false`.

This linear scan ensures that as soon as a repeated value is encountered, the function exits early, avoiding unnecessary work.

## Complexity
- **Time:** O(n) – each of the n elements is examined once, and set operations are average O(1).  
- **Space:** O(n) – in the worst case all elements are distinct, so the set stores n integers.

## Solution (java)

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int num:nums){
            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}
```

---

**Runtime** 14 ms · **Memory** 93.4 MB

<sub>Synced by AILeetHub on 2026-04-23.</sub>
