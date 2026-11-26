# 204. Count Primes

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/count-primes/)

`Array` · `Math` · `Enumeration` · `Number Theory` · `Primality Test` · `Sieve Theory` · `Prime Number Sieve`

## Intuition  
To count primes below `n` we can test each candidate number for divisibility by smaller primes.  
Since 2 is the only even prime, we handle it separately and then only examine odd numbers, halving the work.

## Approach  
1. If `n` ≤ 2, return 0 because no primes exist below 2.  
2. Initialize `count` to 1 to account for the prime 2.  
3. Iterate over odd integers `i` from 3 up to `n‑1`.  
   * Assume `i` is prime (`dj = true`).  
   * Check divisibility by odd numbers `j` starting at 3, incrementing by 2, while `j * j ≤ i`.  
   * If any `j` divides `i`, set `dj` to false and break.  
   * If `dj` remains true, increment `count`.  
4. Return `count`.

This brute‑force method checks each odd candidate against all smaller odd divisors up to its square root, ensuring correctness.

## Complexity  
- **Time:** O(n √n) – for each of the ~n/2 odd candidates we perform up to √i divisibility checks.  
- **Space:** O(1) – only a few integer variables are used, independent of input size.

## Solution (Java)

```java
class Solution {
    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }
        
        int count = 1;
        for(int i = 3 ; i < n ; i += 2){
            boolean dj = true;

            for(int j = 3 ; j * j <= i ; j += 2){
                if(i % j == 0){
                    dj = false;
                    break;
                }
            }
            if(dj){
                count++;
            }
        }
        return count;
    }
}
```

---

**Runtime** 2039 ms (beats 5.0%) · **Memory** 42 MB (beats 96.9%)

<sub>Synced by AILeetHub on 2026-11-26.</sub>
