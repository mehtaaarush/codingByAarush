# 75. Sort Colors

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/sort-colors/)

`Array` · `Two Pointers` · `Sorting` · `Quicksort` · `Bubble Sort`

## Intuition  
The array contains only three distinct values (0, 1, 2).  
If we know how many of each value appear, we can rebuild the array in the correct order without any comparisons or swaps.

## Approach  
1. **Count phase** – Iterate once through `nums`, incrementing three counters (`count0`, `count1`, `count2`) for each value encountered.  
2. **Overwrite phase** – Write back the values in order: first `count0` zeros, then `count1` ones, and finally `count2` twos.  
   - The first loop fills indices `0 … count0‑1` with `0`.  
   - The second loop fills indices `count0 … count0+count1‑1` with `1`.  
   - The third loop fills the remaining indices with `2`.  
This two‑pass strategy keeps the algorithm simple and guarantees in‑place sorting.

## Complexity  
- **Time:** O(n) – each element is examined twice (once for counting, once for overwriting).  
- **Space:** O(1) – only three integer counters are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                count0 += 1;
            }if(nums[i] == 1){
                count1 += 1;
            }if(nums[i] == 2){
                count2 += 1;
            }
        }
        for(int i = 0 ; i < count0 ; i++){
            nums[i] = 0;
        }
        for(int i = count0 ; i < count1 + count0 ; i++){
            nums[i] = 1;
        }
        for(int i = count0 + count1 ; i < nums.length ; i++){
            nums[i] = 2;
        }
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 43.1 MB (beats 83.7%)

<sub>Synced by AILeetHub on 2026-11-03.</sub>
