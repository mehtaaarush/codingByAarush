# 49. Group Anagrams

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/group-anagrams/)

`Array` · `Hash Table` · `String` · `Sorting`

## Approach

Accepted medium solution in java.
Relevant topics: Array, Hash Table, String, Sorting.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
             if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
        }
    

```

---

**Runtime** 6 ms · **Memory** 49.9 MB

<sub>Synced by AILeetHub on 2026-01-31.</sub>
