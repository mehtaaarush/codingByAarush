# 645. Set Mismatch

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/set-mismatch/)

`Array` · `Hash Table` · `Bit Manipulation` · `Sorting`

## Intuition  
The array should contain every integer from 1 to n exactly once. Because one value is duplicated, one other value is missing. By counting how many times each number appears we can directly spot the duplicate (frequency 2) and the missing number (absent from the map).

## Approach  
1. Traverse the input array and build a frequency map (`HashMap<Integer,Integer>`).  
2. Iterate through the range 1 … n (where n = `nums.length`).  
   * If a number is not present in the map, it is the missing value.  
   * If a number’s frequency equals 2, it is the duplicated value.  
3. Return an array `[duplicate, missing]`.

The map guarantees O(1) lookup for each number, so the second pass correctly identifies both anomalies.

## Complexity  
- **Time:** O(n) – one pass to build the map and another pass over 1 … n.  
- **Space:** O(n) – the map stores up to n entries for the input values.

## Solution (Java)

```java
class Solution {
    public int[] findErrorNums(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        int duplicate = 0;
        int missing = 0;

        for(int i = 1 ; i <= nums.length ; i++){
            if(!map.containsKey(i)){
                missing = i;
            }else if(map.get(i) == 2){
                duplicate = i;
            }
        }
        return new int[]{duplicate ,  missing};
    }
}
```

---

**Runtime** 20 ms (beats 16.1%) · **Memory** 47.5 MB (beats 53.8%)

<sub>Synced by AILeetHub on 2026-11-01.</sub>
