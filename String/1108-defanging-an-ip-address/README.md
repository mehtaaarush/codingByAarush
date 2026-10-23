# 1108. Defanging an IP Address

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/defanging-an-ip-address/)

`String`

## Intuition  
The task is to transform every dot in a dotted‑decimal IP address into the literal string “[.]”. Since the input is guaranteed to be a valid IPv4 address, we only need to scan the string once and perform a simple replacement for each period.

## Approach  
Create a `StringBuilder` to accumulate the result. Iterate over each character of the input `address`.  
* If the character is a dot (`'.'`), append the three‑character sequence `"[.]"` to the builder.  
* Otherwise, append the character unchanged.  
After the loop, convert the builder to a string and return it.  
(An alternative one‑liner using `String.replace` is commented out in the code.)

## Complexity  
- **Time:** O(n) – each of the n characters is examined once.  
- **Space:** O(n) – the output string is stored in a new buffer of length proportional to the input.

## Solution (Java)

```java
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < address.length() ; i++){
            if(address.charAt(i) == '.'){
                result.append("[.]");
            }else{
                result.append(address.charAt(i));
            }
        }
        return result.toString();
        //return address.replace("." , "[.]");
    }
}
```

---

**Runtime** 0 ms (beats 100.0%) · **Memory** 42.5 MB (beats 82.4%)

<sub>Synced by AILeetHub on 2026-10-23.</sub>
