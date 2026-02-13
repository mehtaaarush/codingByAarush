# 219. Contains Duplicate II

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/contains-duplicate-ii/)

`Array` · `Hash Table` · `Sliding Window`

## Intuition  
The condition `abs(i - j) ≤ k` means that only elements within a sliding window of size `k` can form a valid duplicate pair. If we keep track of the values that appear in the current window, we can instantly detect a repeat.

## Approach  
Traverse the array once, maintaining a `HashSet` that stores the values of the last `k` indices.  
For each index `i`:
1. If `nums[i]` is already in the set, a duplicate within distance `k` exists → return `true`.  
2. Add `nums[i]` to the set.  
3. If the set size exceeds `k`, remove the element that is now outside the window, namely `nums[i‑k]`.  

If the loop finishes without finding a duplicate, return `false`.  
The set always contains at most `k` elements, ensuring that only relevant candidates are considered.

## Complexity  
- **Time:** O(n) – each element is processed once and set operations are amortized O(1).  
- **Space:** O(k) – the set holds at most `k` elements, the window size.

## Solution (java)

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length ; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size()>k){
                set.remove(nums[i-k]);
            }

        }
        return false;

        
    }
}
```

---

**Runtime** 24 ms · **Memory** 76.2 MB

<sub>Synced by AILeetHub on 2026-02-13.</sub>
