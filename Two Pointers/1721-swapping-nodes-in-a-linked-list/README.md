# 1721. Swapping Nodes in a Linked List

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/)

`Linked List` · `Two Pointers`

## Intuition
The task is to exchange the values of two nodes that are symmetrically positioned in a singly linked list: the k‑th node from the beginning and the k‑th node from the end. Since the list is singly linked, we cannot move backward, so we first need to know the total length to locate the counterpart from the end.

## Approach
1. **Count nodes** – Traverse the list once to determine its length `n`.  
2. **Locate the first node** – Starting from `head`, advance `k‑1` steps to reach the k‑th node from the start (`first`).  
3. **Locate the second node** – Starting again from `head`, advance `n‑k` steps to reach the k‑th node from the end (`second`).  
4. **Swap values** – Exchange the `val` fields of `first` and `second`.  
5. Return the unchanged `head` pointer.

The algorithm performs two linear passes: one for counting and one for locating the two nodes, then a constant‑time swap.

## Complexity
- **Time:** O(n) – one full traversal to count nodes and another to reach the target nodes.  
- **Space:** O(1) – only a few pointers and an integer counter are used, independent of list size.

## Solution (c)

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* swapNodes(struct ListNode* head, int k) {
    
    int n = 0;
    struct ListNode *temp = head;
    
    while (temp != NULL) {
        n++;
        temp = temp->next;
    }
    
    struct ListNode *first = head;
    for (int i = 1; i < k; i++) {
        first = first->next;
    }
    
    struct ListNode *second = head;
    for (int i = 1; i < n - k + 1; i++) {
        second = second->next;
    }
    
    int temp_val = first->val;
    first->val = second->val;
    second->val = temp_val;
    
    return head;
}
```

---

**Runtime** 0 ms · **Memory** 52.8 MB

<sub>Synced by AILeetHub on 2026-02-23.</sub>
