# 2235. Add Two Integers

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/add-two-integers/)

`Math`

## Intuition
Adding two integers is a fundamental arithmetic operation that can be performed in constant time. The problem asks for the sum of two given numbers, so the most direct approach is to compute the result using the built‑in addition operator.

## Approach
The solution defines a method `sum` that accepts two integer parameters, `num1` and `num2`. Inside the method, a local variable `add` is declared to hold the result of the addition `num1 + num2`. The method then returns this value. This straightforward implementation leverages Java’s native integer addition, which handles both positive and negative operands correctly within the specified range.

## Complexity
- **Time:** O(1) – the addition operation is performed once, regardless of input size.  
- **Space:** O(1) – only a single integer variable is used for the result, with no additional data structures.

## Solution (Java)

```java
class Solution {
    public int sum(int num1, int num2) {
        int add;
        add = num1 + num2;
        return add;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.4 MB (beats 36.4%)

<sub>Synced by AILeetHub on 2026-09-17.</sub>
