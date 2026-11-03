# 11. Container With Most Water

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/container-with-most-water/)

`Array` · `Two Pointers` · `Greedy`

## Intuition  
The area formed by two lines is limited by the shorter of the two heights and the distance between them.  
If we fix the left line and move the right line leftwards, the width shrinks but the right height can only stay the same or increase.  
Thus, when the left height is smaller, moving the right pointer cannot produce a larger area with that left line, so we safely discard the left line.  
The same logic applies when the right height is smaller.  
This observation leads to a two‑pointer greedy strategy that guarantees the optimal pair is examined.

## Approach  
1. Place two indices at the ends of the array (`left = 0`, `right = n‑1`).  
2. While `left < right`:  
   * Compute `width = right - left` and `h = min(height[left], height[right])`.  
   * Update `maxArea` with `width * h`.  
   * Move the pointer that points to the shorter line inward (`left++` if `height[left] < height[right]`, otherwise `right--`).  
3. Return `maxArea` after the loop terminates.

The loop examines each pair only once, and the pointer that moves inward is always the one that cannot contribute to a larger area with the current pair, ensuring no optimal solution is missed.

## Complexity  
- **Time:** O(n) – each iteration moves one pointer, so at most `n-1` iterations.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while(left < right){
            int width = right - left;
            int h = Math.min(height[left] , height[right]);
            int area = width * h;

            maxArea = Math.max(area , maxArea);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
```

---

**Runtime** 6 ms (beats 7.3%) · **Memory** 76.6 MB (beats 97.3%)

<sub>Synced by AILeetHub on 2026-11-03.</sub>
