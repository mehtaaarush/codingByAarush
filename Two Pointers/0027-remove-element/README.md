# 27. Remove Element

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/remove-element/)

`Array` · `Two Pointers`

## Intuition
We only need to keep the elements that differ from the target value.  
By scanning the array once, we can overwrite unwanted values with the next valid one, effectively compacting the array in place.

## Approach
Maintain a write pointer `k` that marks the position where the next non‑`val` element should be placed.  
Iterate over the array with index `i`.  
- If `nums[i]` is not equal to `val`, copy it to `nums[k]` and increment `k`.  
- If it equals `val`, simply skip it.  
After the loop, the first `k` positions contain all elements that are not `val`, in any order. The function returns `k`, the new logical length of the array.

## Complexity
- **Time:** O(n) – one pass over the array of length `n`.  
- **Space:** O(1) – only two integer variables (`i` and `k`) are used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]!= val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 43 MB (beats 94.8%)

<sub>Synced by AILeetHub on 2026-10-25.</sub>
