# 724. Find Pivot Index

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-pivot-index/)

`Array` · `Prefix Sum`

## Intuition  
The pivot index is the point where the sum of elements on its left equals the sum on its right.  
If we know the total sum of the array, we can determine the right‑hand sum at any position by subtracting the elements we have already passed.  
Thus, while scanning once from left to right we can maintain two running sums: one for the left side and one for the right side.

## Approach  
1. **Compute the total sum** of all elements (`rightSum`).  
2. **Iterate** over the array from index 0 to n‑1.  
   * Subtract the current element from `rightSum` – this now represents the sum strictly to the right of the current index.  
   * If `leftSum` equals `rightSum`, the current index is a pivot; return it immediately.  
   * Add the current element to `leftSum` to include it in the left side for the next iteration.  
3. If the loop finishes without finding a match, return `-1`.  
The algorithm guarantees the leftmost pivot is returned because we stop at the first match.

## Complexity  
- **Time:** O(n) – one pass to compute the total sum and another pass to find the pivot.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0 ; i < nums.length ; i++){
            rightSum += nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            rightSum -= nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
        
    }
}
```

---

**Runtime** 1 ms (beats 96.5%) · **Memory** 46.8 MB (beats 88.5%)

<sub>Synced by AILeetHub on 2026-11-05.</sub>
