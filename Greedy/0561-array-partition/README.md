# 561. Array Partition

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/array-partition/)

`Array` · `Greedy` · `Sorting` · `Counting Sort`

## Intuition  
To maximize the sum of the smaller elements in each pair, we should pair numbers that are close in value.  
Sorting the array places equal or similar numbers next to each other.  
When the array is sorted, taking every second element (the first of each adjacent pair) guarantees that each chosen element is the smaller one of its pair, and no better pairing can increase the total.

## Approach  
1. Sort `nums` in ascending order.  
2. Iterate over the sorted array with a step of two, adding `nums[i]` to the running total.  
3. Return the accumulated sum.  
The loop effectively selects the first element of each consecutive pair `(nums[0], nums[1]), (nums[2], nums[3]), …`, which are the minimal values of those pairs.

## Complexity  
- **Time:** O(n log n) – sorting dominates the runtime.  
- **Space:** O(1) – the sort operates in place and the algorithm uses only a few integer variables.

## Solution (java)

```java
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for(int i = 0;i<nums.length;i = i + 2){
            sum = sum + nums[i];
        }
        return sum;
    }
}
```

---

**Runtime** 20 ms · **Memory** 50 MB

<sub>Synced by AILeetHub on 2026-02-25.</sub>
