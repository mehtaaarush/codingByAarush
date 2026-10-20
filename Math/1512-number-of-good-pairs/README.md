# 1512. Number of Good Pairs

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/number-of-good-pairs/)

`Array` · `Hash Table` · `Math` · `Counting`

## Intuition
The task is to count how many unordered pairs of equal values exist in the array. A straightforward way is to examine every possible pair of indices and increment a counter when the values match and the first index is smaller than the second. This brute‑force method guarantees that every valid pair is considered exactly once.

## Approach
The implementation iterates over all indices `i` from `0` to `n‑1`. For each `i`, it loops over all indices `j` from `0` to `n‑1`. Inside the inner loop it checks two conditions: `nums[i] == nums[j]` and `i < j`. When both hold, the pair `(i, j)` is a good pair and the counter is incremented. Because the inner loop runs over the entire array for each `i`, every pair is evaluated, and the `i < j` guard ensures that each unordered pair is counted only once.

## Complexity
- **Time:** O(n²) – two nested loops each iterate up to `n` times, leading to quadratic work.
- **Space:** O(1) – only a constant‑size counter is used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(nums[i]==nums[j] && i < j){
                    count += 1;
                }
            }
        }
        return count;
    }
}
```

---

**Runtime** 2 ms (beats 5.6%) · **Memory** 42.3 MB (beats 97.1%)

<sub>Synced by AILeetHub on 2026-10-20.</sub>
