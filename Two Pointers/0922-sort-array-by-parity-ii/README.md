# 922. Sort Array By Parity II

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/sort-array-by-parity-ii/)

`Array` · `Two Pointers` · `Sorting`

## Intuition
We must place each even number at an even index and each odd number at an odd index. Because the array contains exactly half evens and half odds, a single pass can assign every element to its correct parity position.

## Approach
Create a new array `ans` of the same length as `nums`. Keep two pointers: `even` starts at 0 and jumps by 2, `odd` starts at 1 and also jumps by 2. Iterate over `nums`; if the current value is even, store it at `ans[even]` and advance `even` by 2; otherwise store it at `ans[odd]` and advance `odd` by 2. After processing all elements, `ans` satisfies the required parity condition and is returned.

## Complexity
- **Time:** O(n) – each element is inspected and placed once.
- **Space:** O(n) – an auxiliary array of length n is allocated; no in‑place modification is performed.

## Solution (Java)

```java
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int even = 0;
        int odd = 1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] % 2 == 0){
                ans[even] = nums[i];
                even = even +2; 
            }else{
                ans[odd] = nums[i];
                odd = odd + 2;
            }
        }
        return ans;
    }
}
```

---

**Runtime** 3 ms (beats 59.7%) · **Memory** 48.7 MB (beats 36.7%)

<sub>Synced by AILeetHub on 2026-10-15.</sub>
