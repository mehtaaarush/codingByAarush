# 1281. Subtract the Product and Sum of Digits of an Integer

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)

`Math`

## Intuition
The result depends only on the individual digits of the number.  
By examining each digit once we can accumulate the product and the sum in a single pass, then subtract the two totals.

## Approach
1. Initialize `product = 1` and `sum = 0`.  
2. While the number `n` is greater than zero:
   - Extract the last digit with `digit = n % 10`.  
   - Multiply `product` by this digit.  
   - Add the digit to `sum`.  
   - Remove the last digit by integer division `n /= 10`.  
3. After the loop, return `product - sum`.

The loop processes every decimal digit exactly once, updating the two running totals. Because the operations are constant‑time per digit, the algorithm is straightforward and efficient.

## Complexity
- **Time:** O(d) – where *d* is the number of digits in `n`; each digit is processed once.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n > 0){
            int digits = n % 10;
            product *= digits;
            sum += digits;
            n = n/10;
        }
        return product-sum;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 41.9 MB (beats 90.5%)

<sub>Synced by AILeetHub on 2026-10-05.</sub>
