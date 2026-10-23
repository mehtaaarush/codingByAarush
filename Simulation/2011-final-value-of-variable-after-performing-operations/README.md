# 2011. Final Value of Variable After Performing Operations

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/)

`Array` · `String` · `Simulation`

## Intuition  
The variable `X` starts at zero and each operation changes its value by exactly one.  
Since the order of operations does not affect the final result beyond the cumulative count of increments and decrements, we can treat the problem as a simple tally: add one for every increment operation and subtract one for every decrement operation.

## Approach  
Iterate through the `operations` array once.  
For each string, compare it with the four possible forms: `"++X"`, `"X++"`, `"--X"`, `"X--"`.  
If the string is an increment form, add one to a counter; if it is a decrement form, subtract one.  
After processing all elements, the counter holds the final value of `X`, which is returned.

## Complexity  
- **Time:** O(n) – one pass over the `operations` array, where n is its length.  
- **Space:** O(1) – only a single integer counter is used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("++X") || operations[i].equals("X++")){
                count += 1;
            }if(operations[i].equals("--X") || operations[i].equals("X--")){
                count -= 1;
            }

        }
        return count;
    }
}
```

---

**Runtime** 1 ms (beats 79.0%) · **Memory** 43.8 MB (beats 96.4%)

<sub>Synced by AILeetHub on 2026-10-23.</sub>
