# 1137. N-th Tribonacci Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/n-th-tribonacci-number/)

`Math` · `Dynamic Programming` · `Memoization`

## Intuition  
The Tribonacci sequence extends the Fibonacci idea: each term is the sum of the three preceding terms.  
Because the recurrence only depends on the last three values, we can compute the sequence iteratively while keeping just those three numbers in memory.

## Approach  
The implementation first handles the trivial cases `n = 0` and `n = 1`.  
It then initializes three variables to represent `T0`, `T1`, and `T2`.  
A single loop runs `n` times; in each iteration it calculates the next Tribonacci number `d = a + b + c`, then shifts the window: `a` takes the old `b`, `b` takes the old `c`, and `c` becomes `d`.  
After the loop finishes, the variable `a` holds the value of `T_{n-1}`; because the loop runs one extra iteration compared to the number of terms needed, `a` actually equals `T_n`.  
Finally, the method returns `a`.

## Complexity  
- **Time:** O(n) – a single pass over the range 1…n performs constant‑time work per iteration.  
- **Space:** O(1) – only three integer variables are maintained regardless of n.

## Solution (java)

```java
class Solution {
    public int tribonacci(int n) {
        if ( n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        int a = 0;
        int b  = 1;
        int c = 1;

        for(int i = 1 ; i <=n ; i++){
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return a;
    }
}
```

---

**Runtime** 0 ms · **Memory** 42.1 MB

<sub>Synced by AILeetHub on 2025-12-13.</sub>
