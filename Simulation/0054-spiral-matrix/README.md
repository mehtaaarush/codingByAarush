# 54. Spiral Matrix

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/spiral-matrix/)

`Array` · `Matrix` · `Simulation`

## Approach

Accepted medium solution in java.
Relevant topics: Array, Matrix, Simulation.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0; 
        int right = m-1;
        int bottom = n-1;
        int top = 0;

        List<Integer> result = new ArrayList<>();
        
        while(left<=right && top<=bottom){
        for(int i = left ; i <=right ; i++){
            result.add(matrix[top][i]);
        }
        top++;

        for(int i = top ; i <= bottom ; i++){
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
            for(int i = right ; i >=left ; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i = bottom ; i >=top ; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }}
      return result;
}

}
```

---

**Runtime** 0 ms · **Memory** 43.1 MB

<sub>Synced by AILeetHub on 2026-05-07.</sub>
