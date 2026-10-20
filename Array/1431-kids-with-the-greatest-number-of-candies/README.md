# 1431. Kids With the Greatest Number of Candies

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

`Array`

## Approach

Accepted easy solution in Java.
Relevant topics: Array.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (Java)

```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = Integer.MIN_VALUE;
        int n = candies.length;

        for(int i = 0 ; i < n ; i++){
            if(candies[i] > greatest){
                greatest = candies[i];
            }    
        }
        List<Boolean> result = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(candies[i] + extraCandies >= greatest){
                result.add(true);
            }else{
                result.add(false);

            }
        }
        return result;
        
    }
}
```

---

**Runtime** 1 ms (beats 95.2%) · **Memory** 43.3 MB (beats 97.4%)

<sub>Synced by AILeetHub on 2026-10-20.</sub>
