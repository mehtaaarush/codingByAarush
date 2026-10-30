# 268. Missing Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/missing-number/)

`Array` · `Hash Table` · `Math` · `Binary Search` · `Bit Manipulation` · `Sorting`

## Intuition  
The missing number is the only value in the range \([0, n]\) that does not appear in the array.  
Because all elements are distinct, we can simply record which numbers we see and then look for the one absent.

## Approach  
1. Iterate through `nums` and insert each value into a `HashMap`.  
   The map’s keys represent the numbers present; the values are unused counts.  
2. After the first pass, loop from `0` to `n` (inclusive).  
   For each `i`, check whether the map contains the key `i`.  
   The first `i` that is missing from the map is the answer, so return it immediately.

This two‑pass method guarantees that every number in the range is examined exactly once.

## Complexity  
- **Time:** O(n) – one pass to build the map and one pass to find the missing number.  
- **Space:** O(n) – the map stores up to `n` entries, one for each distinct number in the array.

## Solution (Java)

```java
class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        for(int i = 0 ; i <=nums.length ; i++){
            if(!map.containsKey(i)){
                return i;
            }
        }
        return -1;
    }
}
```

---

**Runtime** 8 ms (beats 16.2%) · **Memory** 47.1 MB (beats 71.3%)

<sub>Synced by AILeetHub on 2026-10-30.</sub>
