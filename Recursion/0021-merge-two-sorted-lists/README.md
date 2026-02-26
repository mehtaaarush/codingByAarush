# 21. Merge Two Sorted Lists

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)

`Linked List` · `Recursion`

## Intuition  
Both input lists are already sorted. By walking through them simultaneously and always attaching the smaller current node to the result, we can build a new sorted list without extra sorting. Reusing the existing nodes keeps the algorithm simple and memory‑efficient.

## Approach  
Create a dummy head node and a `tail` pointer that tracks the last node of the merged list. While neither list is exhausted, compare the values of the current nodes. Attach the node with the smaller value to `tail->next`, advance that list, and move `tail` forward. Once one list runs out, link the remaining nodes of the other list directly to `tail->next`. Finally, return `Dummy.next`, which points to the head of the merged list. This method preserves the original nodes and requires only a few pointer variables.

## Complexity  
- **Time:** O(n + m) – each node from both lists is examined exactly once.  
- **Space:** O(1) – only a constant number of pointers are used; no additional data structures are allocated.

## Solution (c)

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode Dummy;
    struct ListNode* tail = &Dummy;
    Dummy.next = NULL;

    while(list1!=NULL && list2!=NULL){
        if(list1->val<=list2->val){
            tail->next = list1;
            list1 = list1->next;
        }else{
            tail->next = list2;
            list2 = list2->next;
        }
        tail = tail->next;
    }
    if(list1!=NULL){
        tail->next = list1;
    }else{
        tail->next = list2;
    }
    return Dummy.next;


}
```

---

**Runtime** 0 ms · **Memory** 10.6 MB

<sub>Synced by AILeetHub on 2026-02-26.</sub>
