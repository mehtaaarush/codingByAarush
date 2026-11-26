# 3360. Stone Removal Game

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/stone-removal-game/)

`Math` · `Simulation`

## Intuition
The game proceeds deterministically: Alice starts with a fixed 10‑stone removal, then each player removes one stone less than the opponent’s previous move. The only decision point is whether the current player can make the required removal; if not, that player loses. Thus the outcome can be decided by simulating the turns until the remaining stones are insufficient for the next removal.

## Approach
1. Initialize `remove = 10` and a flag `aliceTurn = true` to indicate whose turn it is.
2. While the remaining stones `n` are at least `remove`:
   - Subtract `remove` from `n`.
   - Decrease `remove` by 1 for the next turn.
   - Toggle `aliceTurn` to switch players.
3. When the loop exits, the current player (`aliceTurn`) cannot make a move, so the previous player wins. Return `!aliceTurn` to indicate whether Alice won.

This direct simulation follows the exact rules of the game without any additional data structures.

## Complexity
- **Time:** O(k) where *k* is the number of turns until the removal amount exceeds the remaining stones (at most 10 for the given constraints).  
- **Space:** O(1) – only a few integer variables are used.

## Solution (Java)

```java
class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean aliceTurn = true;

        while(n >= remove){
            n -= remove;
            remove--;
            aliceTurn = !aliceTurn;

        }
        return !aliceTurn;
        
        
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 41.2 MB (beats 95.8%)

<sub>Synced by AILeetHub on 2026-11-26.</sub>
