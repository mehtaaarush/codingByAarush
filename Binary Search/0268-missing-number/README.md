# 268. Missing Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/missing-number/)

`Array` · `Hash Table` · `Math` · `Binary Search` · `Bit Manipulation` · `Sorting`

## Intuition  
The array contains every integer from 0 to *n* except one.  
If we could know the sum of all numbers that should appear, the missing value is simply the difference between that expected sum and the sum of the elements actually present.

## Approach  
1. Let *n* be the length of the array.  
2. Compute the expected sum of the first *n* integers (including 0) using the formula  
   \[
   \text{ExpectedSum} = \frac{n(n+1)}{2}.
   \]  
3. Iterate once over the array, accumulating the actual sum of its elements.  
4. Return `ExpectedSum - ActualSum`.  
The subtraction yields the single number that was omitted from the sequence.

## Complexity  
- **Time:** O(n) – one pass over the array to compute the actual sum.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (java)

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ExpectedSum = (n*(n+1))/2;

        int ActualSum = 0;
        for(int num:nums){
            ActualSum = ActualSum + num;
        } 
        return ExpectedSum - ActualSum;
    }
}
```

---

**Runtime** 0 ms · **Memory** 47.1 MB

<sub>Synced by AILeetHub on 2025-12-14.</sub>
