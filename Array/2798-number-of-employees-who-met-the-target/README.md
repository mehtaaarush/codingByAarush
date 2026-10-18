# 2798. Number of Employees Who Met the Target

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/number-of-employees-who-met-the-target/)

`Array`

## Intuition
The task reduces to a simple counting problem: for each employee we only need to know whether their logged hours meet or exceed the required target. No sorting or complex data structures are necessary; a single pass through the array suffices.

## Approach
1. Initialize a counter `worked` to zero.  
2. Iterate over the `hours` array using an index `i`.  
3. For each element, check if `hours[i] >= target`.  
   - If true, increment `worked`.  
4. After the loop, return `worked` as the number of employees who satisfied the target.

The algorithm directly implements the straightforward definition of the problem: count elements that satisfy a simple comparison.

## Complexity
- **Time:** O(n) – each of the `n` elements is examined once.  
- **Space:** O(1) – only a single integer counter is used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int worked = 0;
        for(int i = 0 ; i < hours.length ; i++){
            if(hours[i] >= target){
                worked += 1;
            }
        }
        return worked;
    }
}
```

---

**Runtime** 1 ms (beats 23.7%) · **Memory** 43.5 MB (beats 97.4%)

<sub>Synced by AILeetHub on 2026-10-18.</sub>
