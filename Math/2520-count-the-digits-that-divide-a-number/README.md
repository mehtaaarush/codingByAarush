# 2520. Count the Digits That Divide a Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/count-the-digits-that-divide-a-number/)

`Math`

## Intuition
The task is to count how many of a number’s decimal digits divide the number itself.  
Because the number is at most \(10^9\), it has at most nine digits, so a linear scan over its digits is trivial.

## Approach
1. Convert the integer `num` to its string representation.  
2. Build an integer array `arr` where each element is the numeric value of a digit (`s.charAt(i) - '0'`).  
3. Iterate over `arr`. For each digit `d`, test `num % d == 0`.  
4. If the test passes, increment a counter.  
5. Return the counter after the loop.

The algorithm directly mirrors the problem statement: each digit is examined once, and divisibility is checked with a single modulus operation per digit.

## Complexity
- **Time:** O(d) – one pass over the d digits, each requiring constant‑time arithmetic.  
- **Space:** O(d) – the array of digits stores d integers, proportional to the number of digits.

## Solution (Java)

```java
class Solution {
    public int countDigits(int num) {
        String s = Integer.toString(num);
        int[] arr = new int[s.length()];
        int count = 0;

        for(int i = 0 ; i < s.length() ; i++){
            arr[i] = s.charAt(i) - '0';
        }

        for(int i = 0 ; i < arr.length ; i++){
            if(num % arr[i]==0){
                count += 1;
            }
        }  
        return count;  
        }
               
    }
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.2 MB (beats 17.7%)

<sub>Synced by AILeetHub on 2026-10-06.</sub>
