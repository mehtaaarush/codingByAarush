# 11. Container With Most Water

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/container-with-most-water/)

`Array` · `Two Pointers` · `Greedy`

## Intuition  
The area between two lines is limited by the shorter of the two heights and the distance between them.  
If we fix a pair of indices, moving the pointer at the taller line inward can never increase the area, because the height constraint would still be the shorter line.  
Thus, to explore potentially larger areas we should move the pointer at the shorter line, hoping to find a taller line that compensates for the reduced width.

## Approach  
1. Place two pointers at the leftmost and rightmost indices.  
2. While the pointers do not cross:  
   * Compute the current area as `min(height[left], height[right]) * (right - left)`.  
   * Update the maximum area seen so far.  
   * Advance the pointer that points to the shorter line (`left++` if `height[left] < height[right]`, otherwise `right--`).  
3. Return the maximum area after the loop.

This greedy strategy guarantees that every possible pair is considered in a single pass, because moving the taller pointer cannot yield a larger area than the current one.

## Complexity  
- **Time:** O(n) – each iteration moves one pointer, so at most `n-1` steps.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (java)

```java
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int currentArea = 0;
        int maxArea = 0;
        while(left<right){
            currentArea = (int) (Math.min(height[left],height[right]) * (right - left));
            maxArea = Math.max(currentArea,maxArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
            
        }
        return maxArea;
    }}

```

---

**Runtime** 5 ms · **Memory** 77.5 MB

<sub>Synced by AILeetHub on 2026-02-09.</sub>
