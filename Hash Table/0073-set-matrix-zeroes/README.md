# 73. Set Matrix Zeroes

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/set-matrix-zeroes/)

`Array` · `Hash Table` · `Matrix`

## Approach

Accepted medium solution in java.
Relevant topics: Array, Hash Table, Matrix.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int mark  = -100000001;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j]==0){
                    for(int k = 0 ; k < m ; k++){
                        if(matrix[i][k]!=0)
                        matrix[i][k] = mark;
                    }
                    for(int k = 0 ; k < n ; k++){
                        if(matrix[k][j]!=0)
                        matrix[k][j] = mark;
                    }
                    
                }
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix[i][j]==mark)
                matrix[i][j] = 0;
            }
        }
    }
}
```

---

**Runtime** 14 ms · **Memory** 47.5 MB

<sub>Synced by AILeetHub on 2026-06-03.</sub>
