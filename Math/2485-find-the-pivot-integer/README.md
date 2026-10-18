# 2485. Find the Pivot Integer

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-the-pivot-integer/)

`Math` · `Prefix Sum`

## Intuition
If an integer x splits the sequence 1…n into two parts with equal sums, then the sum of the first part 1…x must equal the sum of the second part x…n.  
Let S be the total sum of 1…n.  
The sum of the first part is x(x+1)/2.  
The sum of the second part is S – x(x–1)/2.  
Setting them equal gives  
x(x+1)/2 = S – x(x–1)/2 → 2·x(x+1) = 2S – x(x–1) → x² = S.  
Thus the total sum must be a perfect square, and the pivot is exactly its square root.

## Approach
1. Compute the total sum S = n(n+1)/2.  
2. Take the integer square root x = ⌊√S⌋.  
3. If x² equals S, x is the pivot; otherwise no such integer exists.  
The algorithm relies on the derived property that a pivot exists iff the total sum is a perfect square.

## Complexity
- **Time:** O(1) – only a few arithmetic operations are performed.  
- **Space:** O(1) – constant auxiliary space is used.

## Solution (Java)

```java
class Solution {
    public int pivotInteger(int n) {
        int total = n*(n+1) / 2;
        int x = (int) Math.sqrt(total);

        if(x*x == total){
            return x;
        }else{
            return -1;
        }
    }
}
```

---

**Runtime** 1 ms (beats 72.7%) · **Memory** 42.2 MB (beats 83.7%)

<sub>Synced by AILeetHub on 2026-10-18.</sub>
