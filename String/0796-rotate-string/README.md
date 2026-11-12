# 796. Rotate String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/rotate-string/)

`String` · `String Matching`

## Intuition  
A rotation of a string is obtained by repeatedly moving its first character to the end.  
If `goal` is a rotation of `s`, then after some number of such moves the two strings will be identical.  
Thus we can simulate the process: repeatedly shift `s` left by one character and compare it to `goal`.  
If at any step the strings match, the answer is `true`; otherwise, after all possible shifts the answer is `false`.

## Approach  
1. Iterate `n` times, where `n` is the length of `s`.  
2. In each iteration, first check if the current `s` equals `goal`.  
3. If not, create a new string by concatenating the substring from index 1 to the end with the first character (`s = s.substring(1) + s.substring(0, 1)`).  
4. Continue until a match is found or all rotations have been examined.  
5. Return `false` if no match occurs.

This direct simulation uses the language’s `substring` operation to perform each left shift.

## Complexity  
- **Time:** O(n²) – each of the `n` rotations rebuilds a string of length `n`.  
- **Space:** O(n) – the temporary string created during each rotation holds up to `n` characters.

## Solution (Java)

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        int k = 1;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.equals(goal)){
                return true;
            }
            s = s.substring(k) + s.substring(0 , k);
        }
        return false;
    }
}
```

---

**Runtime** 2 ms (beats 72.5%) · **Memory** 42.8 MB (beats 95.4%)

<sub>Synced by AILeetHub on 2026-11-12.</sub>
