# 989. Add to Array-Form of Integer

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/add-to-array-form-of-integer/)

`Array` · `Math`

## Intuition
Adding a small integer `k` to a large number represented as an array of its digits can be done digit‑by‑digit from the least significant side, just like manual addition.  
The key observation is that the carry produced by adding `k` to the last digit propagates only to the left, so we can process the array once from right to left while keeping the current carry in `k`.

## Approach
1. Start with `i` pointing to the last index of `num`.  
2. While either `i` is valid or `k` is non‑zero:  
   * If `i` is valid, add `num[i]` to `k` and decrement `i`.  
   * Append `k % 10` (the current least significant digit) to a result list.  
   * Update `k` to `k / 10` (integer division) to keep the remaining carry.  
3. After the loop, reverse the result list because digits were collected from least to most significant.  
4. Return the reversed list.

This mirrors elementary addition: each iteration handles one digit and propagates any overflow to the next higher place.

## Complexity
- **Time:** O(n + log₁₀k) – we traverse the array once and may process a few extra digits from `k`.  
- **Space:** O(n + log₁₀k) – the result list stores one entry per processed digit, matching the output size.

## Solution (java)

```java
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while(i >= 0 || k > 0){
        if(i >= 0){
            k = k + num[i];
            i--;
        }
        
        result.add(k%10);
        k = k/10;
    }
    Collections.reverse(result);
    return result;}}
    
```

---

**Runtime** 2 ms · **Memory** 47.6 MB

<sub>Synced by AILeetHub on 2025-12-13.</sub>
