# 412. Fizz Buzz

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/fizz-buzz/)

`Math` · `String` · `Simulation`

## Intuition
The task is to produce a list where each position corresponds to an integer from 1 to n, replacing numbers divisible by 3, 5, or both with specific strings. Because the mapping depends only on the current number’s divisibility, a single pass over the range suffices.

## Approach
Create an empty list `answer`. Loop `i` from 1 to `n` inclusive.  
* If `i` is divisible by both 3 and 5 (`i % 3 == 0 && i % 5 == 0`), append `"FizzBuzz"`.  
* Else if `i` is divisible by 3, append `"Fizz"`.  
* Else if `i` is divisible by 5, append `"Buzz"`.  
* Otherwise, append the string representation of `i` (`String.valueOf(i)`).  
After the loop, return the populated list. The algorithm directly follows the problem’s rules without any auxiliary data structures beyond the result list.

## Complexity
- **Time:** O(n) – one constant‑time check per integer from 1 to n.  
- **Space:** O(n) – the list stores n string elements.

## Solution (Java)

```java
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
```

---

**Runtime** 1 ms (beats 99.8%) · **Memory** 46.8 MB (beats 45.8%)

<sub>Synced by AILeetHub on 2026-10-12.</sub>
