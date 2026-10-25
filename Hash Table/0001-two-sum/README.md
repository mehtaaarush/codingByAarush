# 1. Two Sum

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/two-sum/)

`Array` · `Hash Table`

## Intuition
The goal is to find two numbers whose sum equals the target.  
Instead of checking every pair (which would be O(n²)), we can remember the numbers we have already seen and look up the required partner in constant time.

## Approach
Traverse the array once. For each element `nums[i]` compute its complement `target - nums[i]`.  
* If the complement is already in a hash map, the pair is found: return the stored index of the complement and the current index `i`.  
* If not, store the current number and its index in the map.  
Because the problem guarantees exactly one solution, the first match is the answer. The map grows at most to the size of the array, ensuring a single pass.

## Complexity
- **Time:** O(n) – each element is processed once and hash‑map lookups/insertions are O(1).  
- **Space:** O(n) – the map may store up to all elements in the worst case.

## Solution (Java)

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement) , i};
            }
            map.put(nums[i] , i);

        }
        return new int[]{};
    }
}
```

---

**Runtime** 2 ms (beats 99.4%) · **Memory** 46.7 MB (beats 83.1%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
