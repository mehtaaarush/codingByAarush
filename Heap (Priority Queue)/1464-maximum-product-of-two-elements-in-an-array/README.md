# 1464. Maximum Product of Two Elements in an Array

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/)

`Array` · `Sorting` · `Heap (Priority Queue)`

## Intuition  
The expression to maximize is \((a-1)(b-1)\) where \(a\) and \(b\) are two distinct elements of the array.  
Since the product of two numbers increases when both numbers increase, the best choice is to pick the two largest values in the array.  
Subtracting 1 from each does not change the relative ordering, so the problem reduces to finding the two maximum elements.

## Approach  
The solution scans the array once, maintaining two variables:  
1. `largest` – the greatest value seen so far.  
2. `secondLargest` – the second greatest value seen so far.  

For each element `num`:
- If `num` exceeds `largest`, shift the current `largest` to `secondLargest` and set `largest` to `num`.  
- Otherwise, if `num` exceeds `secondLargest`, update `secondLargest`.  

After the loop, compute \((largest-1) \times (secondLargest-1)\) and return it.  
This avoids sorting, keeping the algorithm linear in time and constant in space.

## Complexity  
- **Time:** O(n) – one pass over the array.  
- **Space:** O(1) – only two integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        

        // return (nums[n-1]-1)* (nums[n-2] -1);
        int largest = 0;
        int secondLargest = 0;

        for(int num : nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num > secondLargest){
                secondLargest = num;
            }
        }
        return (largest-1) * (secondLargest - 1);

        
    }
}
```

---

**Runtime** 1 ms (beats 63.8%) · **Memory** 44.1 MB (beats 96.0%)

<sub>Synced by AILeetHub on 2026-10-19.</sub>
