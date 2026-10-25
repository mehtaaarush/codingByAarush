# 283. Move Zeroes

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/move-zeroes/)

`Array` · `Two Pointers`

## Intuition  
The goal is to keep the order of all non‑zero values while pushing every zero to the end.  
If we scan the array once and overwrite each non‑zero element at the next free position, the relative order is preserved automatically.  
After all non‑zeros are placed, the remaining slots must be filled with zeros.

## Approach  
1. Maintain a write pointer `k` starting at 0.  
2. Iterate through the array with index `i`.  
   * When `nums[i]` is non‑zero, assign it to `nums[k]` and increment `k`.  
   * Zeros are ignored during this pass, so they are effectively skipped.  
3. Once the scan finishes, `k` points to the first position that should contain a zero.  
4. Fill the rest of the array from `k` to the end with zeros.  

This two‑phase process guarantees that all non‑zeros stay in their original order and all zeros are moved to the tail, all done in place.

## Complexity  
- **Time:** O(n) – a single pass to copy non‑zeros and a second pass to write zeros.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
        }
        while(k < nums.length){
            nums[k] = 0;
            k++;
        }
    } 
}
```

---

**Runtime** 2 ms (beats 92.3%) · **Memory** 47.3 MB (beats 90.0%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
