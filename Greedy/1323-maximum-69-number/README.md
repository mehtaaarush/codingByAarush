# 1323. Maximum 69 Number

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-69-number/)

`Math` · `Greedy`

## Intuition  
The number is composed only of digits 6 and 9.  
Changing a 6 to 9 always increases the value, while changing a 9 to 6 decreases it.  
Therefore, to maximize the number we should flip the **leftmost** 6 (most significant digit) to 9; any later change would affect a less significant position and cannot yield a larger result.

## Approach  
1. Convert the integer to its string representation.  
2. Transform the string into a mutable character array.  
3. Scan the array from left to right.  
   * When the first `'6'` is encountered, replace it with `'9'` and stop the loop.  
4. Convert the modified character array back to an integer and return it.  
If the number contains no `'6'`, the loop never triggers and the original number is returned unchanged.

## Complexity  
- **Time:** O(d) – a single pass over the d digits.  
- **Space:** O(d) – storage for the character array used to modify the digits.

## Solution (Java)

```java
class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char[] arr = s.toCharArray();

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == '6'){
                arr[i] = '9';
            break;
        }
        }
        return Integer.parseInt(new String(arr));
    }
}
```

---

**Runtime** 1 ms (beats 77.7%) · **Memory** 42.5 MB (beats 13.6%)

<sub>Synced by AILeetHub on 2026-10-05.</sub>
