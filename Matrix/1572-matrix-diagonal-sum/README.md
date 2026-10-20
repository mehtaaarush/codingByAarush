# 1572. Matrix Diagonal Sum

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/matrix-diagonal-sum/)

`Array` · `Matrix`

## Intuition
The sum of a square matrix’s diagonals can be obtained by visiting each row once and adding the two diagonal entries that belong to that row. The primary diagonal element is at position `(i, i)` and the secondary diagonal element is at `(i, n‑1‑i)`. When the matrix size is odd, the center element `(n/2, n/2)` belongs to both diagonals and would be counted twice, so it must be subtracted once.

## Approach
1. Determine `n`, the dimension of the matrix.  
2. Initialize `sum` to 0.  
3. For each row index `i` from 0 to `n-1`:  
   * Add `mat[i][i]` (primary diagonal).  
   * Add `mat[i][n-1-i]` (secondary diagonal).  
4. If `n` is odd, subtract the middle element `mat[n/2][n/2]` to correct the double count.  
5. Return `sum`.

This single pass visits each row exactly once, handling both diagonals in constant time per row.

## Complexity
- **Time:** O(n) – a single loop over `n` rows performs constant work per iteration.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 46.1 MB (beats 90.7%)

<sub>Synced by AILeetHub on 2026-10-20.</sub>
