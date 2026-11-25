# 507. Perfect Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/perfect-number/)

`Math`

## Intuition  
A perfect number equals the sum of all its proper divisors (divisors smaller than the number itself).  
Because any divisor larger than `num/2` would have to be the number itself, we only need to examine candidates up to `num/2`.  

## Approach  
1. **Edge case** – numbers ≤ 1 cannot be perfect, so return `false`.  
2. **Sum proper divisors** – iterate `i` from 1 to `num/2`.  
   * If `num % i == 0`, `i` is a divisor; add it to a running total.  
3. After the loop, compare the total with `num`.  
   * If equal, the number is perfect; otherwise it is not.  

The algorithm directly implements the definition by checking each possible divisor and accumulating their sum.  

## Complexity  
- **Time:** O(n) – the loop runs `num/2` times, proportional to the input value.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 1){
            return false;
        }

        int sum = 0;

       for(int i = 1 ; i <= num / 2 ; i++){
            if(num % i == 0){
                sum += i;
            }
       }
       return sum == num;
    }
}
```

---

**Runtime** 2131 ms (beats 14.7%) · **Memory** 41.6 MB (beats 66.8%)

<sub>Synced by AILeetHub on 2026-11-25.</sub>
