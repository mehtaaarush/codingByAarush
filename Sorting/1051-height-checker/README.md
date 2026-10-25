# 1051. Height Checker

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/height-checker/)

`Array` · `Sorting` · `Counting Sort` · `Bubble Sort`

## Intuition  
The goal is to know how many students are out of place compared to the line that would be sorted by height.  
If we could see the expected order, we could simply compare it to the current order and count mismatches.  

## Approach  
1. Create a copy of the original `heights` array so the input remains unchanged.  
2. Sort the copy; the sorted array represents the expected non‑decreasing order of heights.  
3. Iterate through the indices of the original array.  
   - For each index, compare the value in the original array with the value at the same index in the sorted copy.  
   - Increment a counter whenever the two values differ.  
4. Return the counter, which equals the number of indices where the current order deviates from the expected order.  

This straightforward method leverages the fact that sorting the heights yields the exact arrangement that the school expects. By comparing element‑by‑element we directly count the mismatches.  

## Complexity  
- **Time:** O(n log n) – sorting dominates the runtime.  
- **Space:** O(n) – the cloned array stores a full copy of the input.

## Solution (Java)

```java
class Solution {
    public int heightChecker(int[] heights) {
        // int[] expected = new int[heights.length];

        // for(int i = 0 ; i < heights.length ; i++){
        //     expected[i] = heights[i];
        // }
        // Arrays.sort(expected);

        int count = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);

        for(int i = 0 ; i < heights.length ; i++){
            if(heights[i] != expected[i]){
                count += 1;
            }
        }
        return count;
    }
}
```

---

**Runtime** 5 ms (beats 34.6%) · **Memory** 43.2 MB (beats 66.6%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
