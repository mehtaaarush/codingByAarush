# 2894. Divisible and Non-divisible Sums Difference

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/)

`Math`

## Intuition
The task is to split the numbers 1 through n into two groups: those divisible by m and those that are not. The answer is simply the sum of the first group subtracted from the sum of the second. Because n and m are small (≤ 1000), a straightforward linear scan is efficient enough.

## Approach
1. Build an array `arr` containing the integers 1 to n.  
2. Initialize two accumulators, `num1` for non‑divisible numbers and `num2` for divisible numbers.  
3. Iterate over `arr`. For each element `x`, check `x % m`.  
   * If the remainder is non‑zero, add `x` to `num1`.  
   * Otherwise, add `x` to `num2`.  
4. After the loop, return `num1 - num2`.

The algorithm directly follows the problem’s definition: it counts and sums each category in a single pass.

## Complexity
- **Time:** O(n) – one pass over the array of size n.  
- **Space:** O(n) – the auxiliary array holds n integers.

## Solution (Java)

```java
class Solution {
    public int differenceOfSums(int n, int m) {
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = i+1;
        }
        int num1 = 0;
        int num2 = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % m != 0){
                num1 += arr[i];
            }else{
                num2 += arr[i];
            }
        }
        return num1 - num2;
    }
}
```

---

**Runtime** 1 ms (beats 92.5%) · **Memory** 42.9 MB (beats 10.9%)

<sub>Synced by AILeetHub on 2026-10-05.</sub>
