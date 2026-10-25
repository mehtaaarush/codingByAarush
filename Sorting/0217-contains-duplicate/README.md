# 217. Contains Duplicate

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/contains-duplicate/)

`Array` · `Hash Table` · `Sorting`

## Intuition
A duplicate exists if a number appears more than once while scanning the array.  
Using a hash‑based set lets us remember every value seen so far and check in constant time whether the current element has already been encountered.

## Approach
1. Create an empty `HashSet<Integer>`.  
2. Iterate through each element of `nums`.  
   * If the set already contains the current value, a duplicate is found – return `true`.  
   * Otherwise, insert the value into the set and continue.  
3. If the loop finishes without finding a duplicate, return `false`.

The algorithm stops immediately upon detecting the first repeated number, ensuring minimal work.

## Complexity
- **Time:** O(n) – each of the n elements is processed once with O(1) set operations.  
- **Space:** O(n) – in the worst case all elements are distinct, requiring storage for n integers in the set.

## Solution (Java)

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
```

---

**Runtime** 19 ms (beats 47.8%) · **Memory** 107.5 MB (beats 70.8%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
