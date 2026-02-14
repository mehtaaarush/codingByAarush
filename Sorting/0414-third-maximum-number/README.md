# 414. Third Maximum Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/third-maximum-number/)

`Array` · `Sorting`

## Approach

Accepted easy solution in java.
Relevant topics: Array, Sorting.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int thirdMax(int[] nums) {
        
        Long first = null;
        Long second = null;
        Long third = null;
        
        for(int num : nums) {
            
            long n = num;
            
            if(first != null && n == first ||
               second != null && n == second ||
               third != null && n == third) {
                continue;
            }
            
            if(first == null || n > first) {
                third = second;
                second = first;
                first = n;
            }
            
            else if(second == null || n > second) {
                third = second;
                second = n;
            }
            
            else if(third == null || n > third) {
                third = n;
            }
        }
        
        return third == null ? first.intValue() : third.intValue();
    }
}

```

---

**Runtime** 3 ms · **Memory** 45.2 MB

<sub>Synced by AILeetHub on 2026-02-14.</sub>
