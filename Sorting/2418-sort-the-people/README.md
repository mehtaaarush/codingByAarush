# 2418. Sort the People

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/sort-the-people/)

`Array` · `Hash Table` · `String` · `Sorting`

## Intuition
The task is to reorder the names array so that it follows the descending order of the corresponding heights. Because the heights are distinct, a simple comparison of adjacent heights suffices to determine the correct ordering. By swapping both the height and the name when a smaller height precedes a larger one, the names array is kept in sync with the sorted heights.

## Approach
The solution implements a classic bubble sort on the `heights` array.  
1. Iterate `j` from 0 to `n-2`.  
2. For each `j`, iterate `i` from 0 to `n-2-j`.  
3. If `heights[i] < heights[i+1]`, swap the two heights and simultaneously swap the corresponding names at indices `i` and `i+1`.  
4. After all passes, the `heights` array is sorted in descending order, and the `names` array reflects the same order.  
5. Return the reordered `names` array.

This in‑place algorithm ensures that the names stay aligned with their heights throughout the sorting process.

## Complexity
- **Time:** O(n²) – the double loop of bubble sort performs roughly n²/2 comparisons and swaps.  
- **Space:** O(1) – only a few temporary variables are used; the sorting is done in place without additional data structures.

## Solution (Java)

```java
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
    for(int j = 0 ; j < heights.length - 1 ; j++){
        for(int i = 0 ; i < heights.length - 1 - j ; i++){
            if(heights[i] < heights[i+1]){
                int temp = heights[i];
                heights[i] = heights[i+1];
                heights[i+1] = temp;

                String tempo = names[i];
                names[i] = names[i+1];
                names[i+1] = tempo;
            }
        }
    }
        return names;
    }
}
```

---

**Runtime** 26 ms (beats 10.5%) · **Memory** 46.6 MB (beats 89.6%)

<sub>Synced by AILeetHub on 2026-11-21.</sub>
