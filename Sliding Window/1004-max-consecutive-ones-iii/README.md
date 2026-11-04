# 1004. Max Consecutive Ones III

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/max-consecutive-ones-iii/)

`Array` · `Binary Search` · `Sliding Window` · `Prefix Sum`

## Intuition  
We need the longest contiguous segment that contains at most **k** zeros, because each zero can be flipped to one.  
If we keep a window that always satisfies this condition, the window’s length is a candidate for the answer.  
When the window becomes invalid (more than **k** zeros), we shrink it from the left until it is valid again.  
Thus the right pointer explores every element once, and the left pointer moves only forward.

## Approach  
Use a sliding‑window technique with two indices, `left` and `right`.  
* `right` iterates over the array.  
* When `nums[right]` is 0, increment a counter `zeroCount`.  
* While `zeroCount` exceeds `k`, move `left` forward; if the element leaving the window is 0, decrement `zeroCount`.  
* After each adjustment, the window `[left, right]` contains at most `k` zeros.  
* Update `maxLength` with the current window size `right - left + 1`.  
Return `maxLength` after the loop.

## Complexity  
- **Time:** O(n) – each element is visited at most twice (once by `right`, once by `left`).  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[left] == 0){
                    zeroCount--;
                }
                    left++;
            }
                maxLength = Math.max(maxLength , right - left + 1);
            
        }
        return maxLength;
    }
}
```

---

**Runtime** 4 ms (beats 55.2%) · **Memory** 54.5 MB (beats 33.8%)

<sub>Synced by AILeetHub on 2026-11-04.</sub>
