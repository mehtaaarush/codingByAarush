# 1299. Replace Elements with Greatest Element on Right Side

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/)

`Array`

## Intuition
When we need the greatest element to the right of each position, the value we care about only changes when we encounter a larger element while moving from right to left. Thus, if we keep a running maximum of all elements seen so far, that maximum is exactly the value that should replace the current element.

## Approach
Start with `maxValue = -1` because the last element should become -1. Iterate the array from the last index down to the first. For each index `i`:
1. Store the original value of `arr[i]` in a temporary variable `current`.
2. Replace `arr[i]` with the current `maxValue`. This is the greatest element that has appeared to the right of `i`.
3. Update `maxValue` to be the larger of `current` and the previous `maxValue`. This ensures that `maxValue` always holds the maximum of all elements to the right of the next index to process.

After the loop finishes, the array has been transformed in place and can be returned.

## Complexity
- **Time:** O(n) – a single pass over the array.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public int[] replaceElements(int[] arr) {
        int maxValue = -1;
        //arr[arr.length - 1] = -1;

        for(int i = arr.length - 1 ; i >= 0 ; i--){
            int current = arr[i];

            arr[i] = maxValue;

            maxValue = Math.max(current , maxValue);
             
        }
        
        return arr;
    }
}
```

---

**Runtime** 3 ms (beats 66.6%) · **Memory** 48.1 MB (beats 99.2%)

<sub>Synced by AILeetHub on 2026-11-06.</sub>
