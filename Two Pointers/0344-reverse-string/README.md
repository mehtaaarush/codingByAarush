# 344. Reverse String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/reverse-string/)

`Two Pointers` · `String`

## Intuition
Reversing a sequence can be done by exchanging elements that are symmetric around the center. By swapping the first and last characters, then the second and second‑last, and so on, the array is transformed in place without needing extra storage.

## Approach
The implementation uses two indices, `left` and `right`. `left` starts at 0 and `right` starts at `s.length - 1`. While `left` is strictly less than `right`, the characters at these positions are swapped using a temporary variable. After each swap, `left` is incremented and `right` decremented, moving the pointers toward the middle. The loop stops when the pointers meet or cross, guaranteeing that every pair of characters has been exchanged exactly once. No additional data structures are created; the only extra space is the temporary variable for the swap.

## Complexity
- **Time:** O(n) – the loop runs n/2 iterations, each performing a constant‑time swap, where n is the array length.
- **Space:** O(1) – only a few integer indices and a single temporary character are used, independent of n.

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

**Runtime** 1 ms (beats 27.7%) · **Memory** 47.7 MB (beats 97.4%)

<sub>Synced by AILeetHub on 2026-10-23.</sub>
