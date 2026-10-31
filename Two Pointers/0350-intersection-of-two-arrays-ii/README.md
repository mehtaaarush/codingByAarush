# 350. Intersection of Two Arrays II

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays-ii/)

`Array` · `Hash Table` · `Two Pointers` · `Binary Search` · `Sorting`

## Intuition  
To obtain the intersection with multiplicity, we only need to know how many times each value appears in one array.  
If we can quickly query “does this value exist and how many copies remain?”, we can walk through the second array and collect the common elements.

## Approach  
1. **Frequency map** – Iterate over `nums1` and store each element’s count in a `HashMap`.  
2. **Collect matches** – Scan `nums2`. For each element, check the map: if the key exists and its count is positive, add the element to a temporary `ArrayList` and decrement the stored count.  
3. **Result array** – Convert the `ArrayList` to a plain `int[]` to satisfy the method’s return type.  
The algorithm preserves the required multiplicity because each match consumes one occurrence from the map, ensuring that an element appears in the result no more times than it appears in both arrays. The order of the output is irrelevant, matching the problem’s specification.

## Complexity  
- **Time:** O(n + m) – one pass to build the map and one pass to traverse the second array, where n and m are the lengths of `nums1` and `nums2`.  
- **Space:** O(n) – the map holds at most one entry per distinct element of `nums1`, and the list stores the intersection elements.

## Solution (Java)

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < nums2.length ; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                list.add(nums2[i]);

                map.put(nums2[i] , map.get(nums2[i]) - 1);
            }
        }
        int[] arr = new int[list.size()];

        for(int i = 0 ; i < list.size() ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
```

---

**Runtime** 4 ms (beats 46.8%) · **Memory** 44.5 MB (beats 91.0%)

<sub>Synced by AILeetHub on 2026-10-31.</sub>
