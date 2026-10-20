# 2574. Left and Right Sum Differences

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/left-and-right-sum-differences/)

`Array` · `Prefix Sum`

## Intuition  
The value at each index depends only on the sum of elements before it and the sum of elements after it.  
If we know the total sum of the array, we can obtain the right‑hand sum for any position by subtracting the elements already processed.  
Thus we can compute all differences in a single left‑to‑right scan without recomputing partial sums repeatedly.

## Approach  
1. Compute `rightSum` as the sum of all elements in `nums`.  
2. Initialise `leftSum` to 0.  
3. Iterate over the array indices `i` from 0 to `n‑1`:  
   * Subtract `nums[i]` from `rightSum` – this removes the current element from the right side.  
   * Store `|leftSum - rightSum|` in `answer[i]`.  
   * Add `nums[i]` to `leftSum` – this includes the current element for the next iteration.  
4. Return the filled `answer` array.  
The algorithm maintains two running totals and updates the answer in constant time per element.

## Complexity  
- **Time:** O(n) – one pass to compute the total sum and a second pass that processes each element once.  
- **Space:** O(1) – only a few integer variables are used in addition to the output array.

## Solution (Java)

```java
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            rightSum += nums[i];
        }

        for (int i = 0; i < n; i++) {

            rightSum -= nums[i];

            answer[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return answer;
    }
}
```

---

**Runtime** 2 ms (beats 98.8%) · **Memory** 45.9 MB (beats 97.8%)

<sub>Synced by AILeetHub on 2026-10-20.</sub>
