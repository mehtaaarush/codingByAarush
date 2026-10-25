# 26. Remove Duplicates from Sorted Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

`Array` · `Two Pointers`

## Intuition  
The array is already sorted, so duplicate values appear consecutively.  
If we walk through the array once, we can keep a “write” index that points to the next position where a new unique value should be stored. Whenever we encounter a value different from the previous one, we copy it to the write index and advance that index. This guarantees that the first `k` positions contain all distinct elements in order.

## Approach  
1. Assume at least one element exists; set `k = 1` (the first element is always unique).  
2. Iterate `i` from `1` to `nums.length - 1`.  
3. If `nums[i]` differs from `nums[i‑1]`, write `nums[i]` into `nums[k]` and increment `k`.  
4. After the loop, `k` equals the number of unique elements, and the first `k` positions of `nums` hold the deduplicated sequence.  
5. Return `k`.

This in‑place method uses only two integer variables and modifies the original array as required.

## Complexity  
- **Time:** O(n) – a single pass over the array.  
- **Space:** O(1) – only a couple of integer variables are used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;

        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }
}
```

---

**Runtime** 1 ms (beats 79.9%) · **Memory** 46.2 MB (beats 92.1%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
