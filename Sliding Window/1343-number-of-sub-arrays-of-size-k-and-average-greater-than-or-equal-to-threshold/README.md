# 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/)

`Array` · `Sliding Window`

## Intuition
The average of a sub‑array of length `k` is at least `threshold` exactly when the sum of its elements is at least `k * threshold`.  
By working with sums we avoid floating‑point arithmetic and keep the comparison integer‑based, which is both faster and numerically stable.

## Approach
1. Compute `target = k * threshold`.  
2. Sum the first `k` elements to form the initial window.  
3. If this sum is `≥ target`, increment the answer counter.  
4. Slide the window one position at a time: for each new index `i` (starting at `k`), add `arr[i]` to the current sum and subtract `arr[i‑k]` (the element that leaves the window).  
5. After each slide, compare the updated sum to `target`; if it meets or exceeds the target, increment the counter.  
6. Continue until the window has traversed the entire array.  
The algorithm performs a single linear pass, maintaining the current window sum in constant time.

## Complexity
- **Time:** O(n) – one pass over the array, constant work per element.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (java)

```java
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0,count = 0;
        int target = k * threshold;

        for(int i = 0;i<k;i++){
            sum = sum + arr[i];
        }
        if(sum >= target){
            count++;
        }
        for(int i = k;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            // sum = sum - arr[i - k];

            if(sum>=target){
                count++;
            }
            
        }
        return count;
    }
}
```

---

**Runtime** 2 ms · **Memory** 72.1 MB

<sub>Synced by AILeetHub on 2026-05-07.</sub>
