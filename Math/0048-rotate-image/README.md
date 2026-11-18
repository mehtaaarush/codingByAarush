# 48. Rotate Image

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/rotate-image/)

`Array` · `Math` · `Matrix`

## Intuition
Rotating a square matrix 90° clockwise can be achieved by two simple in‑place operations.  
First, swapping elements across the main diagonal turns rows into columns – this is a transpose.  
Second, reversing each row turns the transposed matrix into the desired rotated form.  
Both steps only touch each element once and use constant extra space.

## Approach
1. **Transpose** – Iterate over the upper triangle of the matrix (`i < j`).  
   For each pair `(i, j)` swap `matrix[i][j]` with `matrix[j][i]`.  
   After this loop, rows become columns.
2. **Reverse rows** – For every row, use two pointers (`left`, `right`) to swap elements symmetrically until they meet.  
   This mirrors each row, completing the 90° clockwise rotation.

The algorithm modifies the input matrix directly, satisfying the in‑place requirement.

## Complexity
- **Time:** O(n²) – each element is visited a constant number of times during transpose and row reversal.  
- **Space:** O(1) – only a few integer variables are used; no additional data structures are allocated.

## Solution (Java)

```java
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < n ; i++){
            int left = 0;
            int right = n - 1;

            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }

    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 43.4 MB (beats 69.2%)

<sub>Synced by AILeetHub on 2026-11-18.</sub>
