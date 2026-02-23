# 2181. Merge Nodes in Between Zeros

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/merge-nodes-in-between-zeros/)

`Linked List` · `Simulation`

## Approach

Accepted medium solution in c.
Relevant topics: Linked List, Simulation.

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
struct ListNode* mergeNodes(struct ListNode* head) {
    struct ListNode* curr = head->next;  // skip first zero
    struct ListNode* write = head;       // will store sums
    
    int sum = 0;
    
    while (curr != NULL) {
        if (curr->val == 0) {
            write = write->next;   // move to next position
            write->val = sum;      // store sum
            sum = 0;               // reset
        } else {
            sum += curr->val;
        }
        curr = curr->next;
    }
    
    write->next = NULL;   // remove extra nodes
    return head->next;    // skip original first zero
}
```

---

**Runtime** 4 ms · **Memory** 88.6 MB

<sub>Synced by AILeetHub on 2026-02-23.</sub>
