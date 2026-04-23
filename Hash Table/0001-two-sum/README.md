# 1. Two Sum

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/two-sum/)

`Array` · `Hash Table`

## Approach

Accepted easy solution in java.
Relevant topics: Array, Hash Table.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i = 0 ; i<nums.length ; i++){
        //     for(int j = i + 1 ; j<nums.length ; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }else{
                map.put(nums[i],i);
            }
            
        }return new int[]{};
    }
}
```

---

**Runtime** 3 ms · **Memory** 47.4 MB

<sub>Synced by AILeetHub on 2026-04-23.</sub>
