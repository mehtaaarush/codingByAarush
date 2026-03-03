# 344. Reverse String

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/reverse-string/)

`Two Pointers` · `String`

## Intuition
Reversing a string in place is equivalent to swapping characters from the two ends of the array until the middle is reached. By moving a left pointer forward and a right pointer backward, each pair of characters can be exchanged with a single temporary variable, ensuring no additional storage beyond that temporary variable.

## Approach
1. Initialize two indices: `left` at the start (0) and `right` at the end (`s.length - 1`).
2. While `left` is less than `right`:
   - Store `s[left]` in a temporary variable.
   - Assign `s[right]` to `s[left]`.
   - Assign the temporary value to `s[right]`.
   - Increment `left` and decrement `right`.
3. When the loop terminates, the array `s` is reversed in place.

This two‑pointer technique guarantees that each element is moved exactly once, and the process stops when the pointers cross, covering all necessary swaps.

## Complexity
- **Time:** O(n) – each of the n characters is visited a constant number of times.
- **Space:** O(1) – only a single temporary variable is used regardless of input size.

## Solution (java)

```java
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left<right){
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

**Runtime** 0 ms · **Memory** 48.3 MB

<sub>Synced by AILeetHub on 2026-03-03.</sub>
