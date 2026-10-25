# 169. Majority Element

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/majority-element/)

`Array` · `Hash Table` · `Divide and Conquer` · `Sorting` · `Counting` · `Boyer–Moore Majority Vote Algorithm`

## Intuition  
The majority element appears more than half the time, so if we know how many times each value occurs, the one with the highest count must be the majority. Counting frequencies directly gives us the answer without needing to compare elements pairwise.

## Approach  
Traverse the array once, storing each number’s frequency in a hash map (`HashMap<Integer,Integer>`). For each element, increment its count if it already exists; otherwise, insert it with a count of one. After the first pass, iterate over the map’s keys to find the entry with the largest frequency. The key associated with this maximum count is returned as the majority element. This two‑pass method guarantees that the element with the highest occurrence is identified.

## Complexity  
- **Time:** O(n) – one full scan to build the map and a second scan over at most n distinct keys.  
- **Space:** O(n) – the hash map may store up to n different values in the worst case.

## Solution (Java)

```java
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i] , count + 1);
            }else{
                map.put(nums[i] , 1);
            }
        }

        int maxFreq = 0;
        int maxElement = 0;

        for(int key : map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                maxElement = key;
            }
        }
        return maxElement;
    }
}
```

---

**Runtime** 20 ms (beats 12.0%) · **Memory** 54.5 MB (beats 90.0%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
