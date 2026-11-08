# 1. Two Sum

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/two-sum/)

`Array` · `Hash Table`

## Intuition  
We need two numbers that add to the target. If we could instantly know whether the required complement of the current number has already appeared, we could finish in one pass.

## Approach  
Traverse the array once. For each element `nums[i]` compute its complement `target - nums[i]`.  
* If the complement exists in a hash map, its stored index is the first element of the answer; return `[map.get(complement), i]`.  
* If not, insert the current number and its index into the map.  
The map holds value → index, allowing O(1) average‑time lookups. Because the problem guarantees a unique solution, the first match found is the answer.

## Complexity  
- **Time:** O(n) – one linear scan with constant‑time hash operations.  
- **Space:** O(n) – the hash map may store up to all array elements in the worst case.

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

**Runtime** 2 ms (beats 99.4%) · **Memory** 46.9 MB (beats 62.6%)

<sub>Synced by AILeetHub on 2026-11-08.</sub>
