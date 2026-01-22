# 83. Remove Duplicates from Sorted List

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

`Linked List`

## Intuition
In a sorted list duplicates appear next to each other.  
If two adjacent nodes share the same value, the second one can be removed by simply
linking the first node to the node after the duplicate.  
Thus we only need a single pass through the list, adjusting pointers as we go.

## Approach
1. Keep a pointer `temp` initialized to `head`.  
2. While `temp` and `temp->next` are not `NULL`:  
   * If `temp->val` equals `temp->next->val`, set `temp->next` to `temp->next->next`, effectively dropping the duplicate.  
   * Otherwise, advance `temp` to `temp->next`.  
3. Return the original `head`, which now points to the de‑duplicated list.

The loop visits each node once, and the pointer adjustments are constant‑time operations.

## Complexity
- **Time:** O(n) – each node is examined at most once.  
- **Space:** O(1) – only a few pointers are used regardless of list size.

## Solution (c)

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    struct ListNode* temp = head;
    while(temp!=NULL && temp->next!=NULL){
        if(temp->val==temp->next->val){
        temp->next=temp->next->next;
        }else{
            temp = temp->next;
        }
    }
    return head;
}
```

---

**Runtime** 0 ms · **Memory** 11.2 MB

<sub>Synced by AILeetHub on 2026-01-22.</sub>
