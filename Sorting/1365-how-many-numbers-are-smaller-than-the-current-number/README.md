# 1365. How Many Numbers Are Smaller Than the Current Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

`Array` · `Hash Table` · `Sorting` · `Counting Sort`

## Intuition  
For each element we simply need to know how many other elements are strictly smaller.  
Because the array size is at most 500 and values are bounded by 100, a straightforward comparison of every pair is fast enough and easy to implement.

## Approach  
The algorithm iterates over each index `i` of `nums`.  
For each `i` it initializes a counter to zero and then scans the entire array again with index `j`.  
If `nums[j] < nums[i]`, the counter is incremented.  
After the inner scan finishes, the counter holds the number of elements smaller than `nums[i]` and is stored in `result[i]`.  
The process repeats for all indices, producing the final answer array.

## Complexity  
- **Time:** O(n²) – the outer loop runs `n` times and the inner loop also runs `n` times for each outer iteration, performing constant‑time comparisons.  
- **Space:** O(1) – aside from the output array, only a few integer variables are used; no additional data structures are allocated.

## Solution (java)

```java
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int SmallerThan = 0;
            for(int j = 0 ; j<nums.length;j++){
                if(nums[j]<nums[i]){
                    SmallerThan++;
                }
            }
            result[i] = SmallerThan;

        }
        return result;
    }
}
```

---

**Runtime** 7 ms · **Memory** 45.5 MB

<sub>Synced by AILeetHub on 2025-12-15.</sub>
