# 50. Pow(x, n)

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/powx-n/)

`Math` · `Recursion`

## Intuition
The task is to compute \(x^n\) for a real base \(x\) and an integer exponent \(n\). Rather than implementing the exponentiation logic ourselves, the solution leverages the C++ standard library’s `pow` function, which is optimized for floating‑point exponentiation and handles negative exponents, zero, and large values efficiently.

## Approach
The `myPow` method simply forwards its arguments to `std::pow(x, n)` and returns the result. The standard library function internally uses a fast exponentiation algorithm (typically exponentiation by squaring) to achieve logarithmic time complexity. It also manages edge cases such as negative exponents by computing the reciprocal of the positive power, and it respects the domain constraints of the problem.

## Complexity
- **Time:** O(log |n|) – the library’s exponentiation by squaring reduces the number of multiplications to logarithmic in the absolute value of the exponent.
- **Space:** O(1) – only a constant amount of additional memory is used for the result and intermediate values.

## Solution (cpp)

```cpp
class Solution {
public:
    double myPow(double x, int n) {
        double result = pow(x,n);
        return result;
    }
};
```

---

**Runtime** 0 ms · **Memory** 8.9 MB

<sub>Synced by AILeetHub on 2026-05-01.</sub>
