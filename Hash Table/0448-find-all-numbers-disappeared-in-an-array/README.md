# 448. Find All Numbers Disappeared in an Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)

`Array` · `Hash Table`

## Intuition
The task is to identify which numbers from 1 to *n* are absent in the given array.  
If we can quickly check whether a particular number exists in the array, we can simply iterate through the range 1…*n* and collect the missing ones.

## Approach
1. **Build a set of all values** – Iterate over the input array once, inserting each element into a `HashSet`.  
2. **Find missing numbers** – Loop from 1 to `nums.length`. For each integer `i`, test `set.contains(i)`. If the test fails, `i` is missing and is appended to the result list.  
3. **Return the list** – The list now contains every integer in the range that did not appear in the original array.

This two‑pass strategy uses the hash set for O(1) membership checks, ensuring that the second pass runs in linear time.

## Complexity
- **Time:** O(n) – one pass to fill the set and another pass over 1…n.  
- **Space:** O(n) – the hash set stores up to *n* elements, proportional to the input size.

## Solution (java)

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int num:nums){
            set.add(num);
        }
        for(int i = 1; i<=nums.length; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
```

---

**Runtime** 20 ms · **Memory** 74.5 MB

<sub>Synced by AILeetHub on 2026-02-20.</sub>
