# 448. Find All Numbers Disappeared in an Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)

`Array` · `Hash Table`

## Intuition
The array contains numbers from 1 to *n*, but some are missing.  
If we know which values appear, the missing ones are simply the numbers that never show up.

## Approach
1. **Count occurrences** – Iterate over `nums` and store each value in a `HashMap<Integer,Integer>`.  
   The key is the number, the value is its frequency (unused beyond existence).  
2. **Identify missing numbers** – Loop from 1 to `nums.length`.  
   For each `i`, if the map does **not** contain `i`, add `i` to the result list.  
3. Return the list of missing numbers.

The algorithm uses the map only to test presence; the frequency count is unnecessary but follows the given implementation.

## Complexity
- **Time:** O(n) – one pass to build the map and another pass to check each number from 1 to *n*.  
- **Space:** O(n) – the map stores up to *n* keys, plus the output list.

## Solution (Java)

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for(int i = 1 ; i <=nums.length ; i++){
            if(!map.containsKey(i)){
                arr.add(i);
            }
        }
        return arr;

    }
}
```

---

**Runtime** 29 ms (beats 5.1%) · **Memory** 74.8 MB (beats 6.6%)

<sub>Synced by AILeetHub on 2026-10-30.</sub>
