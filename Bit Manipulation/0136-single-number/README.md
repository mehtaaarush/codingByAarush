# 136. Single Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/single-number/)

`Array` · `Bit Manipulation`

## Intuition  
The task is to locate the single element that does not have a duplicate.  
A simple way to achieve this is to keep a tally of how many times each value appears while scanning the array.

## Approach  
1. Create an empty hash map (`Map<Integer,Integer>`).  
2. Iterate through the input array once, inserting each number into the map or incrementing its existing count.  
3. After the first pass, the map holds the frequency of every distinct number.  
4. Iterate over the map’s entries and return the key whose value (count) equals 1.  
5. If no such key is found (theoretically impossible given the problem constraints), return -1.

This two‑pass method guarantees that the unique element is identified by its frequency of one.

## Complexity  
- **Time:** O(n) – two linear scans over the array and the map.  
- **Space:** O(n) – the hash map may store up to n distinct keys in the worst case.

## Solution (Java)

```java
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
```

---

**Runtime** 14 ms (beats 14.3%) · **Memory** 46.4 MB (beats 94.0%)

<sub>Synced by AILeetHub on 2026-10-29.</sub>
