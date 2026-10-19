# 1491. Average Salary Excluding the Minimum and Maximum Salary

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)

`Array` · `Sorting`

## Intuition  
The average of all salaries except the smallest and largest can be obtained by removing only two values from the total sum. Since every salary is unique, the minimum and maximum are well‑defined. By keeping track of the running sum, the current minimum, and the current maximum while iterating once over the array, we can compute the desired average in constant extra space.

## Approach  
1. Initialize `total` to 0, `min` to a very large value, and `max` to a very small value.  
2. Iterate through each salary `sal` in the input array:  
   * Add `sal` to `total`.  
   * Update `min` if `sal` is smaller.  
   * Update `max` if `sal` is larger.  
3. After the loop, subtract `min` and `max` from `total`.  
4. Divide the resulting sum by `(n - 2)` where `n` is the number of salaries.  
5. Return the division as a `double` to preserve fractional precision.

This single pass yields the sum of all salaries excluding the extremes, and the division gives the required average.

## Complexity  
- **Time:** O(n) – one traversal of the salary array.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public double average(int[] salary) {
        int total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = salary.length;

        for(int sal : salary){
            total += sal;
            max = Math.max(max, sal);
            min = Math.min(min, sal);
        }

        return (double)(total - max - min) / (n - 2);
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 45.7 MB (beats 53.6%)

<sub>Synced by AILeetHub on 2026-10-19.</sub>
