# 128. Longest Consecutive Sequence

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/longest-consecutive-sequence/)

`Array` · `Hash Table` · `Union-Find`

## Intuition  
The longest consecutive sequence can be found by treating the array as a set of unique numbers.  
If a number `x` is the start of a sequence, then `x‑1` is not present.  
From such a start we can walk forward, counting how many consecutive integers exist, and record the longest run.

## Approach  
1. Insert every element of `nums` into a `HashSet<Integer>` – this removes duplicates and gives O(1) membership checks.  
2. Iterate over each element `num` in the set.  
   * If `num‑1` is absent, `num` is the beginning of a new sequence.  
   * Initialize a counter `count = 1`.  
   * While `num + count` exists in the set, increment `count`.  
   * Update `max` with the larger of its current value and `count`.  
3. Return `max`, which holds the length of the longest consecutive run.

This method guarantees that each number is examined at most twice: once during the outer loop and once during the inner while loop, ensuring linear overall work.

## Complexity  
- **Time:** O(n) – each element is inserted once and each consecutive chain is traversed only once.  
- **Space:** O(n) – the hash set stores all unique numbers from the input.

## Solution (Java)

```java
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int max = 0;

        for(int num : set){
            if(!set.contains(num - 1)){
                int count = 1;

                while(set.contains(num + count)){
                    count++;
                }
                max = Math.max(max , count);
            }
        }
        return max;
    }
}
```

---

**Runtime** 31 ms (beats 65.7%) · **Memory** 95.1 MB (beats 66.5%)

<sub>Synced by AILeetHub on 2026-11-11.</sub>
