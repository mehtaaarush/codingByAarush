# 167. Two Sum II - Input Array Is Sorted

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

`Array` · `Two Pointers` · `Binary Search`

## Approach

Accepted medium solution in java.
Relevant topics: Array, Two Pointers, Binary Search.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target) {
                return new int[]{left + 1, right + 1};
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }
}
```

---

**Runtime** 2 ms · **Memory** 48.2 MB

<sub>Synced by AILeetHub on 2026-03-01.</sub>
