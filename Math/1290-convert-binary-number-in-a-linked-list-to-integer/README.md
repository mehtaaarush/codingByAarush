# 1290. Convert Binary Number in a Linked List to Integer

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)

`Linked List` · `Math`

## Approach

Accepted easy solution in c.
Relevant topics: Linked List, Math.

## Complexity

- **Time:** _not analysed_
- **Space:** _not analysed_

## Solution (c)

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head) {
    int result = 0;

    while(head!=NULL){
        result = result *2 + head->val;
        head = head->next;
    }
    return result;
}
```

---

**Runtime** 0 ms · **Memory** 8.2 MB

<sub>Synced by AILeetHub on 2026-02-19.</sub>
