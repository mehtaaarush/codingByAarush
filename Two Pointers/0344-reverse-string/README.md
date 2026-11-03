# 344. Reverse String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/reverse-string/)

`Two Pointers` · `String`

## Intuition  
Reversing a string in place means swapping characters from the two ends and moving inward until the middle is reached. By exchanging the first and last characters, then the second and second‑last, and so on, the array is reversed without needing extra storage.

## Approach  
1. Initialize two pointers: `left` at the start (index 0) and `right` at the end (`s.length - 1`).  
2. While `left < right`, swap `s[left]` and `s[right]`.  
3. Increment `left` and decrement `right` to move toward the center.  
4. Continue until the pointers cross, at which point the array is fully reversed.  
The algorithm modifies the input array directly and terminates when all necessary swaps are performed.

## Complexity  
- **Time:** O(n) – each of the n characters is visited at most once during the swap loop.  
- **Space:** O(1) – only a constant number of variables (`left`, `right`, and a temporary `char`) are used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
            
        }
        
    }
}
```

---

**Runtime** 1 ms (beats 39.4%) · **Memory** 47.6 MB (beats 93.2%)

<sub>Synced by AILeetHub on 2026-11-03.</sub>
