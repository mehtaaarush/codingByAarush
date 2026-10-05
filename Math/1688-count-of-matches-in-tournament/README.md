# 1688. Count of Matches in Tournament

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/count-of-matches-in-tournament/)

`Math` · `Simulation`

## Intuition
In a knockout tournament every match eliminates exactly one team.  
Starting with `n` teams, after the first round there are `n‑1` teams that have lost.  
The tournament ends when only one team remains, so the total number of eliminations—and thus matches—is always `n‑1`, regardless of how the rounds are paired.

## Approach
The algorithm exploits this invariant.  
Instead of simulating each round, it directly returns `n - 1`.  
This works for both even and odd numbers of teams because the rule that a single team may advance when the count is odd does not affect the total number of eliminations: the lone team simply bypasses a match but still leaves the tournament with one fewer team.

## Complexity
- **Time:** O(1) – a single arithmetic operation computes the answer.  
- **Space:** O(1) – no additional data structures are used.

## Solution (Java)

```java
class Solution {
    public int numberOfMatches(int n) {
        return n-1;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.3 MB (beats 16.0%)

<sub>Synced by AILeetHub on 2026-10-05.</sub>
