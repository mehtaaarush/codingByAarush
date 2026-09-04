# 877. Stone Game

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/stone-game/)

`Array` · `Math` · `Dynamic Programming` · `Minimax` · `Game Theory` · `Zero-Sum Game`

## Intuition
In this game the number of piles is even and the total number of stones is odd.  
Because Alice moves first, she can always force the game into a state where she
takes the larger of the two remaining piles on each turn.  
If Alice always chooses a pile that keeps the parity of the remaining piles
favorable to her, Bob is left with an odd number of stones after Alice’s move,
while the total is odd.  Consequently Alice can always end up with more stones
than Bob.  This property is a consequence of the game being zero‑sum with an
odd total and an even number of piles, so the first player has a forced win.

## Approach
The solution exploits the proven fact that Alice can always win.  
No simulation, DP, or recursion is required.  
The implementation simply returns `true`, indicating that Alice wins for every
valid input.

## Complexity
- **Time:** O(1) – the function performs a single constant‑time operation.  
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

**Runtime** 0 ms (beats 100.0%) · **Memory** 43 MB (beats 66.7%)

<sub>Synced by AILeetHub on 2026-09-04.</sub>
