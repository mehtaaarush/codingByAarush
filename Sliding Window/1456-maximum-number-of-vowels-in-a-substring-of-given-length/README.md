# 1456. Maximum Number of Vowels in a Substring of Given Length

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)

`String` · `Sliding Window`

## Intuition  
The number of vowels in a substring of fixed length can be updated efficiently as the window slides one character at a time. Instead of recomputing the count from scratch for every position, we keep a running total and adjust it by removing the contribution of the character that leaves the window and adding the contribution of the new character that enters.

## Approach  
1. **Initial window** – Count vowels in the first `k` characters and store this as both the current count and the maximum found so far.  
2. **Slide the window** – For each subsequent position `i` (from `k` to `s.length()-1`):  
   - If the character leaving the window (`s[i-k]`) is a vowel, decrement the current count.  
   - If the new character entering the window (`s[i]`) is a vowel, increment the current count.  
   - Update the maximum if the current count exceeds it.  
3. Return the maximum count after the loop.  
The vowel check is performed with a simple series of equality comparisons for the five lowercase vowels.

## Complexity  
- **Time:** O(n) – each character is examined a constant number of times while sliding the window.  
- **Space:** O(1) – only a few integer variables are used regardless of input size.

## Solution (Java)

```java
class Solution {
    public int maxVowels(String s, int k) {
        int vowel = 0;

        for(int i = 0 ; i < k ; i++){
            
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
            s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
            s.charAt(i) == 'u'){
                vowel += 1;
            }
        }
        int maxVowel = vowel;

        for(int i = k ; i < s.length() ; i++){
            if(s.charAt(i-k) == 'a' || s.charAt(i-k) == 'e' ||
            s.charAt(i-k) == 'i' || s.charAt(i-k) == 'o' ||
            s.charAt(i-k) == 'u'){
                vowel--;
            }
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||
            s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
            s.charAt(i) == 'u'){
                vowel++;
            }
            maxVowel = Math.max(vowel, maxVowel);
        }
        return maxVowel;
    }
}
```

---

**Runtime** 26 ms (beats 8.6%) · **Memory** 46.6 MB (beats 19.5%)

<sub>Synced by AILeetHub on 2026-11-04.</sub>
