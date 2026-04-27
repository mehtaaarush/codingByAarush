# 3. Longest Substring Without Repeating Characters

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

`Hash Table` · `String` · `Sliding Window`

## Approach

Accepted medium solution in java.
Relevant topics: Hash Table, String, Sliding Window.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set = new HashSet<>();
        // int max = 0;
        // int left = 0;
        // for(int right = 0; right <s.length(); right++){
        //     char ch = s.charAt(right);
        //     while(set.contains(ch)){
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(ch);
        //     int len = right - left + 1;
        //     max = Math.max(max,len);
        // }
        // return max;



        Set<Character> set = new HashSet<>();
        int left = 0 ; 
        int maxLen = 0;
        
        for(int right = 0 ; right < s.length() ; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;

    }
}
```

---

**Runtime** 6 ms · **Memory** 46.5 MB

<sub>Synced by AILeetHub on 2026-04-27.</sub>
