# 15. 3Sum

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/3sum/)

`Array` · `Two Pointers` · `Sorting`

## Intuition
The goal is to find all unique triplets that sum to zero. Sorting the array gives two advantages: it allows the use of a two‑pointer scan to find complementary pairs, and it makes it easy to skip duplicate values so that each triplet appears only once.

## Approach
1. **Sort** the input array.  
2. Iterate through the array with index `i` as the first element of a potential triplet.  
   * Skip `i` if it equals the previous element to avoid duplicate first numbers.  
3. For each `i`, set two pointers: `left = i + 1` and `right = n - 1`.  
4. While `left < right`:
   * Compute `sum = nums[i] + nums[left] + nums[right]`.  
   * If `sum == 0`, record the triplet, then move both pointers inward, skipping over any duplicate values at the new positions.  
   * If `sum < 0`, increment `left` to increase the sum.  
   * If `sum > 0`, decrement `right` to decrease the sum.  
5. Continue until all indices are processed. The collected list contains all distinct zero‑sum triplets.

## Complexity
- **Time:** O(n²) – the outer loop runs O(n) times and the inner two‑pointer scan also runs O(n) for each iteration.  
- **Space:** O(1) – aside from the output list, the algorithm uses only a few integer variables; sorting may use O(log n) stack space.

## Solution (Java)

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length - 2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
                else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}
```

---

**Runtime** 37 ms (beats 24.0%) · **Memory** 58.9 MB (beats 76.9%)

<sub>Synced by AILeetHub on 2026-11-04.</sub>
