# 1518. Water Bottles

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/water-bottles/)

`Math` · `Simulation`

## Intuition  
Each full bottle eventually becomes an empty one. Empty bottles can be traded for new full ones, so the process is a simple simulation of exchanging empties for more drinks. The key is to keep track of how many full bottles are available at each step and how many empties remain after the trade.

## Approach  
1. Start with `ans = numBottles` (the initial drinks).  
2. While the current number of full bottles (`numBottles`) is at least `numExchange`:  
   * Compute how many new bottles can be obtained: `newBottles = numBottles / numExchange`.  
   * Compute the leftover empties that cannot be exchanged: `remBottles = numBottles % numExchange`.  
   * Add the newly obtained bottles to the answer: `ans += newBottles`.  
   * The next round’s full bottles equal the newly obtained ones plus the leftovers: `numBottles = newBottles + remBottles`.  
3. When fewer than `numExchange` full bottles remain, no more exchanges are possible; return `ans`.

This loop naturally reduces the number of full bottles each iteration, eventually terminating when the exchange condition fails.

## Complexity  
- **Time:** O(log₍numExchange₎ numBottles) – each iteration roughly divides the number of full bottles by `numExchange`, so the loop runs logarithmically many times.  
- **Space:** O(1) – only a constant amount of extra variables are used.

## Solution (java)

```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans =  numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;
            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
      
    }
}
```

---

**Runtime** 0 ms · **Memory** 42.1 MB

<sub>Synced by AILeetHub on 2026-02-07.</sub>
