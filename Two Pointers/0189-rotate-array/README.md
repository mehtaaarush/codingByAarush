# 189. Rotate Array

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/rotate-array/)

`Array` · `Math` · `Two Pointers`

## Approach

Accepted medium solution in java.
Relevant topics: Array, Math, Two Pointers.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (java)

```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

        private void reverse(int[] nums,int left, int right){
            while(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }}}


//         for(int i = 1 ; i <= k ; i++){
//             nums[i] = nums[n-i-1];
//             nums[i+1] = nums[i];
//         }
//     }
// }
```

---

**Runtime** 0 ms · **Memory** 61 MB

<sub>Synced by AILeetHub on 2026-04-21.</sub>
