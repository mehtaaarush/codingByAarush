# 485. Max Consecutive Ones

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/max-consecutive-ones/)

`Array`

## Intuition
The longest run of 1s can be found by scanning the array once and keeping track of how many 1s have been seen consecutively so far. Whenever a 0 appears the streak breaks, so the counter resets. The maximum value of this counter during the scan is the answer.

## Approach
Traverse the array from left to right.  
* If the current element is 1, increment a running counter.  
* Compare the counter to the best value seen so far; update the best if the counter is larger.  
* If the element is 0, reset the counter to 0 because any future streak must start after this point.  
After the loop, the best value holds the length of the longest consecutive sequence of 1s, which is returned.

## Complexity
- **Time:** O(n) – each element is examined once.  
- **Space:** O(1) – only two integer variables are used regardless of input size.

## Solution (java)

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == 1){
                count++;
                
                if(count > result){
                    result = count;
                }
            }
            else{
                count = 0;
            }
        }
        
        return result;
    }
}

```

---

**Runtime** 2 ms · **Memory** 52.7 MB

<sub>Synced by AILeetHub on 2026-02-15.</sub>
