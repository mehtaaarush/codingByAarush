# 905. Sort Array By Parity

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/sort-array-by-parity/)

`Array` · `Two Pointers` · `Sorting`

## Intuition
The goal is to partition the array into two contiguous segments: evens first, odds second.  
Instead of sorting or using extra lists, we can build the result in a single pass by placing each element directly into its final region.  

## Approach
Create a new array `arr` of the same length as `nums`.  
Maintain two indices: `left` starting at 0 and `right` starting at the last position.  
Iterate through `nums`.  
- If the current element is even, assign it to `arr[left]` and increment `left`.  
- If it is odd, assign it to `arr[right]` and decrement `right`.  

Because `left` only moves forward and `right` only moves backward, every element is written exactly once, and the resulting array has all evens on the left and all odds on the right.  

## Complexity
- **Time:** O(n) – one linear scan of the input array.  
- **Space:** O(n) – an auxiliary array of the same size to hold the reordered elements.

## Solution (Java)

```java
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                arr[left] = nums[i];
                left++;
            }else{
                arr[right] = nums[i];
                right--;
            }
        }
        return arr;
    }
}
```

---

**Runtime** 1 ms (beats 54.2%) · **Memory** 46.3 MB (beats 92.4%)

<sub>Synced by AILeetHub on 2026-11-02.</sub>
