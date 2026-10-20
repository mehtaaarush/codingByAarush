# 2469. Convert the Temperature

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/convert-the-temperature/)

`Math`

## Intuition  
The task is a direct unit conversion: from a single Celsius value to Kelvin and Fahrenheit. Since the formulas are fixed and involve only arithmetic operations, the solution can be achieved in constant time without any iteration or recursion.

## Approach  
1. Create a double array of length two to hold the results.  
2. Compute Kelvin by adding 273.15 to the Celsius input.  
3. Compute Fahrenheit by multiplying the Celsius input by 1.80 and then adding 32.00.  
4. Store the two computed values in the array in the order `[kelvin, fahrenheit]`.  
5. Return the array.  
The implementation uses only primitive arithmetic and a fixed‑size array, ensuring minimal overhead.

## Complexity  
- **Time:** O(1) – a constant number of arithmetic operations regardless of input size.  
- **Space:** O(1) – a fixed-size array of two doubles is allocated, independent of the input value.

## Solution (Java)

```java
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];

        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;
        
        return ans;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 45.9 MB (beats 81.8%)

<sub>Synced by AILeetHub on 2026-10-20.</sub>
