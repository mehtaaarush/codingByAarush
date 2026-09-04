# 877. Stone Game

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/stone-game/)

`Array` · `Math` · `Dynamic Programming` · `Minimax` · `Game Theory` · `Zero-Sum Game`

## Intuition  
The problem asks whether Alice can win when both players play optimally.  
For an even‑length array of piles with an odd total number of stones, a mathematical proof shows that the first player can always force a win.  
The accepted solution leverages this fact by returning `true` for every input, bypassing any explicit game simulation.

## Approach  
The implementation is a single‑line method that ignores the `piles` array and simply returns `true`.  
No preprocessing, recursion, or dynamic programming is performed.  
The method relies on the theoretical guarantee that Alice can always win under the given constraints, so the answer is constant for all valid inputs.

## Complexity  
- **Time:** O(1) – the function performs a single return statement.  
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
