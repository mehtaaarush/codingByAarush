# 3005. Count Elements With Maximum Frequency

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/count-elements-with-maximum-frequency/)

`Array` · `Hash Table` · `Counting`

## Intuition  
The answer depends only on how many times each distinct value appears.  
If we know the frequency of every element, we can identify the largest frequency and then count how many elements reach that value. The total number of array positions belonging to those most‑frequent values is simply the number of such values multiplied by that maximum frequency.

## Approach  
1. **Count frequencies** – Iterate through `nums`, storing each value’s count in a `HashMap<Integer,Integer>`.  
2. **Find the maximum frequency** – Scan the map’s values to determine `maxFreq`.  
3. **Sum positions of max‑frequency elements** – For every frequency equal to `maxFreq`, add `maxFreq` to the answer.  
4. Return the accumulated answer.

The algorithm uses a single pass to build the map, a second pass to find the maximum, and a third pass to sum the counts of the most frequent elements.

## Complexity  
- **Time:** O(n) – each of the three passes scans at most the array or the distinct values once.  
- **Space:** O(k) – the map stores one entry per distinct integer in `nums` (k ≤ n).

## Solution (Java)

```java
class Solution {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        int maxFreq = 0;
        for(int freq : map.values()){
            maxFreq = Math.max(freq , maxFreq);
        }

        int answer = 0;
        for(int freq : map.values()){
            if(freq==maxFreq){
                answer += maxFreq;
            }
        }
        return answer;
        
    }
}
```

---

**Runtime** 3 ms (beats 27.2%) · **Memory** 43.7 MB (beats 91.3%)

<sub>Synced by AILeetHub on 2026-10-14.</sub>
