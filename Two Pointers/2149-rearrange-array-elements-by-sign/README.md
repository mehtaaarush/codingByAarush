# 2149. Rearrange Array Elements by Sign

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/rearrange-array-elements-by-sign/)

`Array` · `Two Pointers` · `Simulation`

## Intuition
The array contains the same number of positive and negative values, so we can place all positives in the even positions (0, 2, 4, …) and all negatives in the odd positions (1, 3, 5, …).  
Because we iterate through the original array in order, the relative order of positives and of negatives is automatically preserved.  
Starting the result with a positive number is satisfied by filling index 0 first.

## Approach
Create a new array `ans` of the same length as `nums`.  
Maintain two indices: `positive` initialized to 0 and `negative` to 1.  
Scan `nums` once.  
* If the current element is positive, store it at `ans[positive]` and advance `positive` by 2.  
* If it is negative, store it at `ans[negative]` and advance `negative` by 2.  

Because the counts of positives and negatives are equal, the two indices will never collide, and every position in `ans` will be filled exactly once.  
Finally return `ans`.

## Complexity
- **Time:** O(n) – a single linear scan over the input array.  
- **Space:** O(n) – an auxiliary array of the same size to hold the reordered elements.

## Solution (Java)

```java
class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];

        int positive = 0; 
        int negative = 1;  

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > 0){
                ans[positive] = nums[i];
                positive += 2;
            }else{
                ans[negative] = nums[i];
                negative += 2;
            }
        }

        return ans;
    }
}
```

---

**Runtime** 4 ms (beats 52.1%) · **Memory** 175 MB (beats 66.8%)

<sub>Synced by AILeetHub on 2026-11-14.</sub>
