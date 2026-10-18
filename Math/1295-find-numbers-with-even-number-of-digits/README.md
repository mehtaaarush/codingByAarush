# 1295. Find Numbers with Even Number of Digits

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

`Array` · `Math`

## Intuition  
The task reduces to determining whether each integer in the list has an even number of decimal digits.  
A straightforward way to count digits is to repeatedly remove the last digit of a number (using modulo 10 and integer division by 10) until the number becomes zero. The number of iterations equals the digit count. If that count is divisible by two, the integer satisfies the requirement.

## Approach  
Iterate through the input array once. For each element, initialize a counter to zero and repeatedly strip off its least‑significant digit, incrementing the counter each time. After the loop, if the counter is even, increment a global `even` counter. Finally, return the total count of numbers with an even digit count.  
The algorithm modifies the array elements during digit extraction, but this in‑place modification does not affect correctness because each number is processed only once.

## Complexity  
- **Time:** O(n · d) – each of the `n` numbers is processed digit by digit; the maximum number of digits `d` is bounded by 6 (since `nums[i] ≤ 10⁵`).  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            while(nums[i] > 0){
                int digit = nums[i] % 10;
                
                count += 1;
                nums[i] = nums[i] / 10;
            }
        
        if(count % 2 == 0){
            even += 1;
        }
    }
    return even;
} 
}
```

---

**Runtime** 3 ms (beats 3.2%) · **Memory** 44.3 MB (beats 93.2%)

<sub>Synced by AILeetHub on 2026-10-18.</sub>
