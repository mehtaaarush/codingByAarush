# 2078. Two Furthest Houses With Different Colors

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/two-furthest-houses-with-different-colors/)

`Array` · `Greedy`

## Approach

Accepted easy solution in java.
Relevant topics: Array, Greedy.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int distance = 0;
        for(int i = 0; i<n ; i++){
            for(int j = i+1;j<n;j++){
                if(colors[i]!=colors[j]){
                distance = Math.max(distance,Math.abs(i-j));
                }
            }
        }
        return distance;
    }
}
```

---

**Runtime** 2 ms · **Memory** 43.4 MB

<sub>Synced by AILeetHub on 2026-04-20.</sub>
