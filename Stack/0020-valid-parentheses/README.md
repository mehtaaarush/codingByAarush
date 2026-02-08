# 20. Valid Parentheses

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/valid-parentheses/)

`String` · `Stack` · `Bracket Sequences`

## Approach

Accepted easy solution in c.
Relevant topics: String, Stack, Bracket Sequences.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (c)

```c
bool isValid(char* s) {
    int n = strlen(s);
    char stack[n];
    int top = -1;

    for (int i = 0; i < n; i++) {
        char ch = s[i];

        if (ch == '(' || ch == '{' || ch == '[') {
            stack[++top] = ch;   
        } else {
            if (top == -1) return false; 

            char last = stack[top--];  

            if (ch == ')' && last != '(') return false;
            if (ch == '}' && last != '{') return false;
            if (ch == ']' && last != '[') return false;
        }
    }

    return top == -1;
}
```

---

**Runtime** 0 ms · **Memory** 7.9 MB

<sub>Synced by AILeetHub on 2026-02-08.</sub>
