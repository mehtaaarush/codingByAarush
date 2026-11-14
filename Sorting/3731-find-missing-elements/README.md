# 3731. Find Missing Elements

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/find-missing-elements/)

`Array` · `Hash Table` · `Sorting`

## Intuition  
The array contains every integer of an original contiguous range, except for a few missing values.  
Because the smallest and largest numbers of that range are guaranteed to be present, the full range is simply all integers between `min(nums)` and `max(nums)` inclusive.  
Thus, the problem reduces to: find which numbers in that interval are not in the given array.

## Approach  
1. **Find bounds** – Scan the array once to determine the minimum and maximum values.  
2. **Build a set** – Insert every element of `nums` into a `HashSet` for O(1) membership checks.  
3. **Collect missing numbers** – Iterate from `min` to `max`. For each integer, if it is not in the set, add it to the result list.  
4. Return the list, which is naturally sorted because the loop proceeds in ascending order.

This straightforward method guarantees that all missing integers are identified and returned in sorted order.

## Complexity  
- **Time:** O(n + k) – one pass to find bounds, one pass to fill the set, and one pass over the range of size `k = max – min + 1`.  
- **Space:** O(n) – the hash set stores all `n` input elements.

## Solution (Java)

```java
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int i = min ; i <= max ; i++){
            if(!set.contains(i)){
                missing.add(i);
            }
        }
        return missing;
        
    }
}
```

---

**Runtime** 4 ms (beats 60.5%) · **Memory** 46.3 MB (beats 87.8%)

<sub>Synced by AILeetHub on 2026-11-14.</sub>
