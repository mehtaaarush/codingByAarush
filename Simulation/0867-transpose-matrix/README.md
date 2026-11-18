# 867. Transpose Matrix

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/transpose-matrix/)

`Array` · `Matrix` · `Simulation`

## Intuition
Transposing a matrix swaps its rows and columns: the element at position (i, j) in the original becomes (j, i) in the result.  
Because the output dimensions are the reverse of the input, we must allocate a new array with `m` rows and `n` columns (where `n` is the number of rows and `m` the number of columns of the input).

## Approach
1. Determine `n = matrix.length` and `m = matrix[0].length`.  
2. Create a new 2‑D array `result` of size `[m][n]`.  
3. Iterate over each cell of the original matrix using two nested loops:  
   * outer loop over rows (`row` from 0 to `n-1`),  
   * inner loop over columns (`col` from 0 to `m-1`).  
4. For each element `matrix[row][col]`, assign it to `result[col][row]`.  
5. Return `result`.

This direct mapping ensures every element is moved exactly once, producing the transpose.

## Complexity
- **Time:** O(m × n) – each of the `m × n` elements is visited and copied once.  
- **Space:** O(m × n) – a new matrix of the same total size is allocated to hold the transposed values.

## Solution (Java)

```java
class Solution {
    public int[][] transpose(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];

        for(int row = 0 ; row < n ; row++){
            for(int col = 0 ; col < m ; col++){
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 46.3 MB (beats 78.3%)

<sub>Synced by AILeetHub on 2026-11-18.</sub>
