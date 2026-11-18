# 867. Transpose Matrix

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/transpose-matrix/)

`Array` · `Matrix` · `Simulation`

## Intuition  
Transposing a matrix means swapping its rows with columns. For each element at position `(i, j)` in the original matrix, the transposed matrix will have that element at position `(j, i)`. This simple index swap is all that is required; no other transformations are needed.

## Approach  
The algorithm first checks for an empty input and returns an empty matrix if necessary. It then determines the dimensions of the input: `n` rows and `m` columns. A new matrix `result` of size `m × n` is allocated to hold the transposed values. Two nested loops iterate over every element of the original matrix: the outer loop runs over rows (`row` from `0` to `n-1`) and the inner loop over columns (`col` from `0` to `m-1`). Inside the inner loop, the element `matrix[row][col]` is assigned to `result[col][row]`. After all elements are processed, `result` is returned.

## Complexity  
- **Time:** O(m × n) – each of the `m × n` elements is visited once and moved to its transposed position.  
- **Space:** O(m × n) – a new matrix of the same total size as the input is allocated to store the result.

## Solution (Java)

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new int[0][0];
        }

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

**Runtime** 1 ms (beats 36.8%) · **Memory** 46.7 MB (beats 28.7%)

<sub>Synced by AILeetHub on 2026-11-18.</sub>
