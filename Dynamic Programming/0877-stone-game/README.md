# 877. Stone Game

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/stone-game/)

`Array` · `Math` · `Dynamic Programming` · `Minimax` · `Game Theory` · `Zero-Sum Game`

## Intuition  
In this game the number of piles is even and the total number of stones is odd.  
Because the piles are arranged in a line, Alice can always force a win by
choosing a strategy that guarantees she ends up with more stones than Bob.
The classic proof shows that Alice can always pick a pile from the side that
leads to a larger cumulative sum for her, while Bob’s optimal reply cannot
overcome this advantage.  Consequently, under optimal play Alice will always
win regardless of the specific distribution of stones.

## Approach  
The implementation exploits this theorem directly: it simply returns `true`
for every input.  No computation of piles or dynamic programming is performed,
since the outcome is predetermined by the game’s properties.

## Complexity  
- **Time:** O(1) – the function performs a single constant‑time return.  
- **Space:** O(1) – no additional data structures are allocated.

## Solution (Java)

```java
class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 43 MB (beats 79.0%)

<sub>Synced by AILeetHub on 2026-09-04.</sub>
