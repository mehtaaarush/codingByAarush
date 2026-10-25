# 2037. Minimum Number of Moves to Seat Everyone

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/)

`Array` · `Greedy` · `Sorting` · `Counting Sort`

## Approach

Accepted easy solution in Java.
Relevant topics: Array, Greedy, Sorting, Counting Sort.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (Java)

```java
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int count = 0;

        for(int i = 0 ; i < seats.length ; i++){
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
    }
}
```

---

**Runtime** 5 ms (beats 93.7%) · **Memory** 45.8 MB (beats 97.6%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
