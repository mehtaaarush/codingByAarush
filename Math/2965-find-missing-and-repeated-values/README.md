# 2965. Find Missing and Repeated Values

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-missing-and-repeated-values/)

`Array` · `Hash Table` · `Math` · `Matrix`

## Intuition  
The grid contains every number from 1 to n² exactly once, except one number that appears twice and another that never appears. By scanning the grid we can immediately spot the duplicate: the first time a value is seen it is stored, the second time it is found again it is the repeating number. Once the duplicate is known, the missing number is the only value in the range 1…n² that is not present in the set of seen numbers.

## Approach  
1. Create an empty hash set.  
2. Iterate over every cell of the grid.  
   * If the current value is already in the set, record it as the repeating number `a`.  
   * Otherwise, insert the value into the set.  
3. After the scan, loop through integers from 1 to n².  
   * The first integer not contained in the set is the missing number `b`.  
4. Return `[a, b]`.

This two‑pass strategy uses the set both to detect the duplicate during the first pass and to locate the missing number during the second pass.

## Complexity  
- **Time:** O(n²) – one full traversal of the grid plus a linear scan of the 1…n² range.  
- **Space:** O(n²) – the hash set stores up to n² distinct values.

## Solution (java)

```java
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Set<Integer> set = new HashSet<>();
        int a = 0; 
        int b = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length;j++){
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }
            }
        }
        for(int i = 1 ; i<n*n+1;i++){
            if(!set.contains(i)){
                b = i;
                break;
            }
        }
        return new int[] {a,b};

    }
}
```

---

**Runtime** 7 ms · **Memory** 47.1 MB

<sub>Synced by AILeetHub on 2026-01-16.</sub>
