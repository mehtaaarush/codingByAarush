# 485. Max Consecutive Ones

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/max-consecutive-ones/)

`Array`

## Intuition  
The longest run of 1 s can be found by scanning the array once and keeping a running tally of the current streak. Whenever a 0 is encountered the streak ends and must be reset. The maximum streak seen so far is updated during the scan.

## Approach  
1. Initialize two counters: `count` for the current consecutive 1 s and `maxCount` for the best streak found.  
2. Iterate through each element of `nums`.  
   * If the element is 1, increment `count` and update `maxCount` with the larger of the two values.  
   * If the element is 0, reset `count` to 0 because any future streak must start after this point.  
3. After the loop, return `maxCount`, which holds the longest run of 1 s.

This linear traversal ensures that every element is examined exactly once, and the counters are updated in constant time.

## Complexity  
- **Time:** O(n) – a single pass over the array of length *n*.  
- **Space:** O(1) – only two integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(count , maxCount);
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
}
```

---

**Runtime** 3 ms (beats 58.0%) · **Memory** 51.9 MB (beats 94.9%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
