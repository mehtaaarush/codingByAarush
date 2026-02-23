# 1669. Merge In Between Linked Lists

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/merge-in-between-linked-lists/)

`Linked List`

## Approach

Accepted medium solution in c.
Relevant topics: Linked List.

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


struct ListNode* mergeInBetween(struct ListNode* list1, int a, int b, struct ListNode* list2) {
    
    struct ListNode *prevA = list1;
    
    for(int i = 0; i < a-1; i++) {
        prevA = prevA->next;
    }
    
    struct ListNode *nodeB = prevA;
    for(int i = 0; i <= b-a+1; i++) {
        nodeB = nodeB->next;
    }
    
    prevA->next = list2;
    
    struct ListNode *tail2 = list2;
    while(tail2->next != NULL) {
        tail2 = tail2->next;
    }
    
    tail2->next = nodeB;
    
    return list1;
}
```

---

**Runtime** 131 ms · **Memory** 37.4 MB

<sub>Synced by AILeetHub on 2026-02-23.</sub>
