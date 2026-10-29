# 136. Single Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/single-number/)

`Array` · `Bit Manipulation`

## Intuition
The XOR operation has two key properties that make it ideal for this problem:  
1. **Self‑cancellation** – `x ^ x = 0`.  
2. **Identity** – `x ^ 0 = x`.  

Because every number in the array appears exactly twice except one, XORing all elements together will cancel out the paired numbers, leaving only the unpaired number as the result.

## Approach
1. Initialize an integer `ans` to `0`.  
2. Iterate through each element `num` in `nums`.  
3. Update `ans` with `ans = ans ^ num`.  
4. After the loop, `ans` holds the single number that appears once, and return it.

The algorithm relies solely on the XOR operation, which is a constant‑time bitwise operation, and processes the array in a single pass.

## Complexity
- **Time:** O(n) – one linear scan over the array.  
- **Space:** O(1) – only a single integer variable is used, regardless of input size.

## Solution (Java)

```java
class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int i = 0 ; i < nums.length ; i++){
        //     map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        // }
        // for(int key : map.keySet()){
        //     if(map.get(key) == 1){
        //         return key;
        //     }
        // }
        // return -1;

        int ans = 0;

        for(int num : nums){
            ans = ans ^ num;
        }
        return ans;
    }
}
```

---

**Runtime** 1 ms (beats 99.9%) · **Memory** 46.4 MB (beats 94.0%)

<sub>Synced by AILeetHub on 2026-10-29.</sub>
