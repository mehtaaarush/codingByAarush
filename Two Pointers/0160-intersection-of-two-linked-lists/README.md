# 160. Intersection of Two Linked Lists

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/intersection-of-two-linked-lists/)

`Hash Table` · `Linked List` · `Two Pointers`

## Approach

Accepted easy solution in c.
Relevant topics: Hash Table, Linked List, Two Pointers.

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
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    if(headA==NULL || headB==NULL)
    return NULL;
    
    struct ListNode *ptrA = headA;
    struct ListNode *ptrB = headB;

    while(ptrA!=ptrB){
        if(ptrA == NULL){
            ptrA = headB;
        }else{
            ptrA =ptrA->next;
        }

        if(ptrB == NULL){
            ptrB = headA;
        }else{
            ptrB = ptrB->next;
        }

    }return ptrA;
}
```

---

**Runtime** 68 ms · **Memory** 22.7 MB

<sub>Synced by AILeetHub on 2026-02-18.</sub>
