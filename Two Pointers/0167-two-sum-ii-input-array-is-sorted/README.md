# 167. Two Sum II - Input Array Is Sorted

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

`Array` · `Two Pointers` · `Binary Search`

## Intuition  
Because the input array is sorted, any pair that sums to the target must consist of one element from the left side and one from the right side. Moving the left pointer rightwards increases the sum, while moving the right pointer leftwards decreases it. This monotonic behavior allows us to discard large portions of the search space in a single pass.

## Approach  
1. Initialize two indices: `left` at the first element and `right` at the last.  
2. While `left < right`:  
   * Compute `sum = numbers[left] + numbers[right]`.  
   * If `sum` equals the target, return `[left + 1, right + 1]` (indices are 1‑based).  
   * If `sum` is less than the target, increment `left` to increase the sum.  
   * If `sum` is greater than the target, decrement `right` to decrease the sum.  
3. The loop guarantees that the unique solution is found; otherwise an empty array is returned (though the problem guarantees a solution).

## Complexity  
- **Time:** O(n) – each iteration moves one pointer closer to the other, so at most `n` steps.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right){
            int sum = numbers[left] + numbers[right];

            if (sum == target){
                return new int[]{left + 1, right + 1};
            }else if (sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};
    }
}
```

---

**Runtime** 2 ms (beats 97.4%) · **Memory** 47.8 MB (beats 91.4%)

<sub>Synced by AILeetHub on 2026-11-02.</sub>
