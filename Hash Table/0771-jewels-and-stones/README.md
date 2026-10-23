# 771. Jewels and Stones

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/jewels-and-stones/)

`Hash Table` · `String`

## Intuition
The problem asks for the number of stones that are also jewels. Since the input sizes are small (≤ 50), a straightforward comparison of each stone against every jewel is sufficient. The key idea is to iterate through each stone and check if it matches any jewel character.

## Approach
The solution uses two nested loops. The outer loop iterates over every character in `stones`. For each stone, the inner loop scans all characters in `jewels`. If a match is found (`jewels.charAt(j) == stones.charAt(i)`), the counter `count` is incremented. After both loops finish, `count` holds the total number of jewels present in the stone string. No additional data structures are used; the algorithm relies solely on direct character comparisons.

## Complexity
- **Time:** O(n × m) – each of the n stones is compared to each of the m jewels, resulting in n × m character comparisons.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i = 0 ; i < stones.length() ; i++){
            for(int j = 0 ; j < jewels.length() ; j++){
                if(jewels.charAt(j) == stones.charAt(i)){
                    count += 1;
            }

            }
        }
        return count;
    }
}
```

---

**Runtime** 1 ms (beats 58.7%) · **Memory** 42.5 MB (beats 97.0%)

<sub>Synced by AILeetHub on 2026-10-23.</sub>
