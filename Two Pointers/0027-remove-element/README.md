# 27. Remove Element

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/remove-element/)

`Array` · `Two Pointers`

## Intuition

We only need to keep the elements that are not equal to the target value. Because the order of the remaining elements does not matter, we can overwrite the array as we scan it, moving every valid element to the front. This in‑place strategy guarantees that no extra array is allocated efficiently.

## Approach

Use a single pass with two indices: the loop index `i` scans every element, and a write index `k` tracks the next position to place a non‑`val` element. Whenever `nums[i]` differs from `val`, assign it to `nums[k]` and increment `k`. Elements equal to `val` are simply skipped. After the loop, the first `k` positions contain all required values, and `k` is the new length. The algorithm modifies the array in place and returns `k`.

## Complexity

- **Time:** O(n) – each element is examined once.  
- **Space:** O(1) – only a few integer variables are used, regardless of input size.

## Solution (java)

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;

        int k = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;}
            
        }
        return k;


    }
}
```

---

**Runtime** 0 ms · **Memory** 43.6 MB

<sub>Synced by AILeetHub on 2026-03-25.</sub>
