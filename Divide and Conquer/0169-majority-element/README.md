# 169. Majority Element

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/majority-element/)

`Array` · `Hash Table` · `Divide and Conquer` · `Sorting` · `Counting` · `Boyer–Moore Majority Vote Algorithm`

## Intuition  
The majority element appears more than half the time, so once we have seen it more than `n/2` times we can stop scanning. By keeping a running count for each distinct value, we can detect this moment immediately.

## Approach  
Traverse the array once, maintaining a hash map that maps each number to its current frequency. For each element `x`:
1. Increment its count in the map (initialize to 1 if it’s the first occurrence).
2. After updating, check if the count of `x` exceeds `n/2`.  
   - If so, `x` is the majority element and is returned immediately.  
If the loop finishes without returning (theoretically impossible given the problem guarantees), return `-1` as a fallback.

This method guarantees that we find the majority element as soon as its count surpasses the required threshold, avoiding a second pass to verify the candidate.

## Complexity  
- **Time:** O(n) – each element is processed once.  
- **Space:** O(n) – the hash map may store up to n distinct keys in the worst case.

## Solution (java)

```java
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i <nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}
```

---

**Runtime** 20 ms · **Memory** 52.9 MB

<sub>Synced by AILeetHub on 2026-01-15.</sub>
