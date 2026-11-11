# 283. Move Zeroes

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/move-zeroes/)

`Array` · `Two Pointers`

## Intuition
We need to preserve the relative order of all non‑zero elements while moving every zero to the end. The simplest way is to overwrite the array as we scan it: keep a write pointer that always points to the next free slot for a non‑zero value.

## Approach
Traverse the array once with index `i`.  
- If `nums[i]` is non‑zero, copy it to `nums[k]` where `k` is the current write position, then increment `k`.  
- After the first pass, all non‑zeros occupy the first `k` positions in their original order.  
- Finally, iterate from `k` to the end of the array, setting each slot to `0`.  
This two‑phase process modifies the array in place and guarantees that zeros are moved to the back without disturbing the order of non‑zeros.

## Complexity
- **Time:** O(n) – one linear scan to copy non‑zeros and a second linear scan to fill zeros.  
- **Space:** O(1) – only a few integer variables are used; no additional data structures.

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
        for(int i = k ; i < nums.length ; i++){
            nums[k] = 0;
            k++;
        }
    } 
}
```

---

**Runtime** 2 ms (beats 93.7%) · **Memory** 47.2 MB (beats 84.8%)

<sub>Synced by AILeetHub on 2026-11-11.</sub>
