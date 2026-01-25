# 13. Roman to Integer

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/roman-to-integer/)

`Hash Table` · `Math` · `String`

## Approach

Accepted easy solution in java.
Relevant topics: Hash Table, Math, String.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char chars[] = s.toCharArray();
        int result = 0;
        int i;
        int j;
        for(i = 0, j = 1; j <chars.length; i++, j++){
            if(map.get(chars[i])>=map.get(chars[j])){
                result = result + map.get(chars[i]);
            }else{
                result = result - map.get(chars[i]);
            }

        }
        result = result + map.get(chars[i]);
        return result;
    }
}
```

---

**Runtime** 4 ms · **Memory** 46.7 MB

<sub>Synced by AILeetHub on 2026-01-25.</sub>
