# 4. Median of Two Sorted Arrays

![Hard](https://img.shields.io/badge/Difficulty-Hard-ff375f?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)

`Array` · `Binary Search` · `Divide and Conquer`

## Intuition
The median of two sorted arrays can be found by first creating a single sorted array that contains all elements from both inputs. Once the combined array is sorted, the median is simply the middle element (or the average of the two middle elements when the length is even). This approach leverages the fact that merging two sorted sequences is straightforward and guarantees a correctly ordered result.

## Approach
1. **Merge**: Use two pointers, one for each input array, to walk through them simultaneously. At each step, compare the current elements and append the smaller one to a new array. If one array is exhausted, append the remaining elements from the other array. This produces a fully sorted array `ans`.
2. **Find Median**:  
   - If `ans` has an odd length, the median is the element at index `ans.length/2`.  
   - If it has an even length, the median is the average of the two central elements: `ans[ans.length/2]` and `ans[ans.length/2 - 1]`.

The algorithm directly implements the merge step of the classic merge sort, ensuring that the combined array remains sorted without additional sorting passes.

## Complexity
- **Time:** O(m + n) – each element from both arrays is examined exactly once during the merge.  
- **Space:** O(m + n) – the merged array stores all elements from the two inputs.

## Solution (java)

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1 , nums2);
        if(ans.length%2==0){
            double ans2 =(double) (ans[ans.length/2] + ans[(ans.length/2) - 1])/2; 
            return ans2;
        }
        else{
            double ans2 = (double) (ans[ans.length/2]);
            return ans2;
        }
    }
    public int[] merge(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
        while(p1<arr1.length || p2<arr2.length){
            int val1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if(val1<val2){
                ans[p3] = val1;
                p1++;
            }else{
                ans[p3] = val2;
                p2++;
            }
            p3++;
        }
        return ans;

    }
}
```

---

**Runtime** 2 ms · **Memory** 49.1 MB

<sub>Synced by AILeetHub on 2025-12-14.</sub>
