# 283. Move Zeroes

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/move-zeroes/)

`Array` · `Two Pointers`

## Intuition  
The goal is to keep all non‑zero values in their original order while pushing every zero to the end.  
If we scan the array from left to right, we can place each non‑zero element at the earliest free position that should contain a non‑zero value.  
A second pointer can remember that free position; when a non‑zero is found we swap it into place.  
Because the free position only moves forward, every element is examined once and the relative order of non‑zeros is preserved.

## Approach  
Use two indices:  
* **fast** – iterates over every element of the array.  
* **slow** – points to the next position where a non‑zero should be written.  

For each `fast` index, if `nums[fast]` is non‑zero, swap `nums[fast]` with `nums[slow]` and increment `slow`.  
When `fast` reaches the end, all non‑zeros occupy indices `0 … slow‑1` and the remaining positions contain zeros.  
The algorithm performs the swap even when `fast == slow`; this is harmless and keeps the code simple.

## Complexity  
- **Time:** O(n) – each element is visited once and a constant amount of work is done per visit.  
- **Space:** O(1) – only two integer variables are used regardless of input size.

## Solution (java)

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;

        for(int fast = 0 ; fast < nums.length; fast++){
            if(nums[fast]!=0) {
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
}
```

---

**Runtime** 2 ms · **Memory** 47.6 MB

<sub>Synced by AILeetHub on 2026-04-23.</sub>
