# 392. Is Subsequence

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/is-subsequence/)

`Two Pointers` · `String` · `Dynamic Programming`

## Intuition
To determine if `s` is a subsequence of `t`, we only need to verify that every character of `s` appears in `t` in the same order. Since the relative order matters but gaps are allowed, a single pass through `t` suffices: we look for each character of `s` sequentially and skip any mismatching characters in `t`.

## Approach
The algorithm uses two indices, `p1` for `s` and `p2` for `t`. While both indices are within bounds, it compares `s.charAt(p1)` with `t.charAt(p2)`.  
- If they match, both pointers advance and a counter is incremented.  
- If they differ, only `p2` moves forward, effectively skipping the current character of `t`.  
The loop stops when either string is fully traversed. Finally, the method returns `true` if the counter equals `s.length()`, meaning every character of `s` was found in order; otherwise it returns `false`.

## Complexity
- **Time:** O(|s| + |t|) – each character of `t` is examined at most once, and each character of `s` is matched at most once.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int p1 = 0;
        
        int p2 = 0;
        
        int count = 0;

        while(p1 < s.length() && p2 < t.length()){
            if(s.charAt(p1) == t.charAt(p2)){
                p1++;
                p2++;
                count += 1;
            }else{
                p2++;
            }
            
        }
        if(count == s.length()){
            return true;
        }
        return false;
    }
}
```

---

**Runtime** 2 ms (beats 74.4%) · **Memory** 42.3 MB (beats 91.3%)

<sub>Synced by AILeetHub on 2026-11-02.</sub>
