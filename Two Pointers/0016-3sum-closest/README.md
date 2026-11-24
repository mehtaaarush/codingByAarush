# 16. 3Sum Closest

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/3sum-closest/)

`Array` · `Two Pointers` · `Sorting`

## Intuition  
The goal is to find the triple of numbers whose sum is numerically closest to a given target.  
Because the input size is modest (≤ 500), a straightforward exhaustive search is feasible:  
evaluate every possible combination of three distinct indices, compute its sum, and keep the one with the smallest distance to the target.

## Approach  
1. Initialize `min` to the largest possible integer and `closestSum` to 0.  
2. Iterate over all index triples `(k, i, j)` with `k < i < j` using three nested loops.  
3. For each triple, compute `sum = nums[k] + nums[i] + nums[j]`.  
4. If `|sum - target|` is smaller than the current `min`, update `min` and set `closestSum` to this `sum`.  
5. After all iterations, return `closestSum`.  
The algorithm examines every distinct triple exactly once, ensuring the returned sum is the unique closest one.

## Complexity  
- **Time:** O(n³) – three nested loops each run up to `n` times, leading to cubic time.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
        
        int closestSum = 0;
        for(int k = 0 ; k < nums.length - 2; k++){
            for(int i = k + 1 ; i < nums.length - 1; i++){
                for(int j = i + 1 ; j < nums.length ; j++){
                    int sum = nums[k] + nums[i] + nums[j];
                    
                    if(Math.abs(sum - target) < min){
                        min = Math.abs(sum - target);
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }
}
```

---

**Runtime** 700 ms (beats 5.0%) · **Memory** 44.4 MB (beats 97.9%)

<sub>Synced by AILeetHub on 2026-11-24.</sub>
