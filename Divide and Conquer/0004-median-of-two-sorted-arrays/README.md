# 4. Median of Two Sorted Arrays

![Hard](https://img.shields.io/badge/Difficulty-Hard-ff375f?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)

`Array` · `Binary Search` · `Divide and Conquer`

## Intuition  
The median of two sorted arrays can be found by treating the two lists as one combined sorted list.  
If we first merge the arrays into a single array and then sort that array, the elements are in order and the median is simply the middle element (or the average of the two middle elements when the total length is even).

## Approach  
1. Create a new array `arr` with length `m + n`.  
2. Copy all elements from `nums1` into the beginning of `arr`.  
3. Append all elements from `nums2` to the end of `arr`.  
4. Sort `arr` using the standard library sort.  
5. If the length of `arr` is odd, return the element at index `len/2`.  
6. If the length is even, return the average of the elements at indices `len/2 - 1` and `len/2`.

This straightforward method guarantees that the combined array is fully sorted before the median is extracted.

## Complexity  
- **Time:** O((m+n) log (m+n)) – the dominant cost is sorting the merged array.  
- **Space:** O(m+n) – an auxiliary array of size `m + n` is allocated to hold all elements.

## Solution (Java)

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int k = 0;

        int[] arr = new int[n + m];
        for(int i = 0 ; i < n ; i++){
            arr[k] = nums1[i];
            k++;
        }

        for(int i = 0 ; i < m ; i++){
            arr[k] = nums2[i];
            k++;
        }

        Arrays.sort(arr);

        int len = arr.length;

        if(len % 2 == 1){
            int middle = len/2;
            return arr[middle];
        }else{
            int middle1 = len / 2 - 1;
            int middle2 = len / 2;
            return (arr[middle1] + arr[middle2]) / 2.0;
        }
        

    }
}
```

---

**Runtime** 9 ms (beats 12.7%) · **Memory** 48.5 MB (beats 49.2%)

<sub>Synced by AILeetHub on 2026-11-23.</sub>
