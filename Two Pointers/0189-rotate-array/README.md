# 189. Rotate Array

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/rotate-array/)

`Array` · `Math` · `Two Pointers`

## Intuition  
Rotating an array by *k* positions to the right is equivalent to moving the last *k* elements to the front while preserving their order, and shifting the remaining elements rightward. By treating the array as a circular buffer, we can achieve this by first extracting the tail segment, then the head segment, and finally writing the combined sequence back into the original array.

## Approach  
1. Reduce *k* modulo the array length to handle cases where *k* ≥ *n*.  
2. Allocate a temporary array `arr` of the same length as `nums`.  
3. Copy the last `k` elements of `nums` into the beginning of `arr`.  
4. Append the first `n‑k` elements of `nums` after the copied tail.  
5. Overwrite `nums` with the contents of `arr`.  
This method keeps the relative order of elements intact and performs the rotation in a single pass over the data.

## Complexity  
- **Time:** O(n) – each element is read and written a constant number of times.  
- **Space:** O(n) – a new array of size `n` is allocated to hold the rotated sequence.

## Solution (Java)

```java
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        
        int m = 0;
        int[] arr = new int[nums.length];

        for(int i = nums.length - k ; i < nums.length ; i++){
            arr[m] = nums[i];
            m++;
        }

        for(int i = 0 ; i < nums.length - k ; i++){
            arr[m] = nums[i];
            m++;
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[i];
        }

    }
}
```

---

**Runtime** 6 ms (beats 22.3%) · **Memory** 272.5 MB (beats 15.1%)

<sub>Synced by AILeetHub on 2026-11-06.</sub>
