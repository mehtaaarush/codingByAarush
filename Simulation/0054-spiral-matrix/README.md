# 54. Spiral Matrix

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/spiral-matrix/)

`Array` · `Matrix` · `Simulation`

## Intuition
The matrix can be viewed as concentric layers.  
By peeling off the outermost layer and moving inward, we can visit every element exactly once in spiral order.  
The key is to keep track of the current boundaries: top row, bottom row, left column, and right column.

## Approach
1. Initialize four pointers: `top = 0`, `bottom = m‑1`, `left = 0`, `right = n‑1`.  
2. While the left boundary does not cross the right and the top does not cross the bottom:
   * Traverse the top row from `left` to `right` and append each element. Increment `top`.  
   * Traverse the right column from `top` to `bottom` and append each element. Decrement `right`.  
   * If the new `top` ≤ `bottom`, traverse the bottom row from `right` to `left` and append each element. Decrement `bottom`.  
   * If the new `left` ≤ `right`, traverse the left column from `bottom` to `top` and append each element. Increment `left`.  
3. Continue until all layers are processed.  
The algorithm ensures that each element is visited once and the order follows the required spiral pattern.

## Complexity
- **Time:** O(m × n) – every cell is visited exactly once.  
- **Space:** O(1) – only a few integer pointers are used; the output list is required by the problem.

## Solution (Java)

```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(left <= right && top <= bottom){

            for(int i = left ; i <= right ; i++){
                result.add(matrix[top][i]);
            }
                top++;

            for(int i = top ; i <= bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                result.add(matrix[bottom][i]);
                
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }


        }
        return result;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.5 MB (beats 72.4%)

<sub>Synced by AILeetHub on 2026-11-19.</sub>
