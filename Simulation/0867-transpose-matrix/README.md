# 867. Transpose Matrix

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/transpose-matrix/)

`Array` · `Matrix` · `Simulation`

## Intuition
Transposing swaps rows and columns, so the element at row *i*, column *j* in the original becomes row *j*, column *i* in the result. The main diagonal stays in place while off‑diagonal entries are mirrored. The most straightforward method is to allocate a new matrix with swapped dimensions and copy each element to its transposed position.

## Approach
1. Determine the number of rows `rows` and columns `cols` of the input.
2. Create a new 2‑D array `transpose` of size `cols × rows`.
3. Iterate over every cell `(i, j)` of the original matrix.
4. Assign `transpose[j][i] = matrix[i][j]`. This places the element in the mirrored position.
5. Return the populated `transpose` array.

This approach avoids in‑place swapping complexities and guarantees that each element is written exactly once.

## Complexity
- **Time:** O(m × n) – each of the `m × n` entries is processed once in the double loop.
- **Space:** O(m × n) – a new matrix of the same total size is allocated to hold the transposed values.

## Solution (java)

```java
class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < columns ; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
```

---

**Runtime** 0 ms · **Memory** 46.4 MB

<sub>Synced by AILeetHub on 2026-05-07.</sub>
