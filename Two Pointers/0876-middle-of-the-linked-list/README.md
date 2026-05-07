# 876. Middle of the Linked List

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/middle-of-the-linked-list/)

`Linked List` · `Two Pointers`

## Intuition
In a singly linked list the middle node can be found by moving two pointers at different speeds.  
If one pointer (`fast`) moves two nodes for every one node that the other pointer (`slow`) moves, then when `fast` reaches the end, `slow` will be positioned at the middle.  
When the list has an even number of nodes, the algorithm naturally stops at the second middle node because `fast` will become `NULL` after stepping over the last pair of nodes.

## Approach
1. Handle trivial cases: if the list is empty or has only one node, return `head`.  
2. Initialize two pointers, `slow` and `fast`, both pointing to `head`.  
3. Iterate while `fast` and `fast->next` are not `NULL`:
   * Advance `slow` by one node (`slow = slow->next`).  
   * Advance `fast` by two nodes (`fast = fast->next->next`).  
4. When the loop exits, `slow` points to the desired middle node; return it.

This two‑pointer technique requires only a single pass through the list and no extra storage.

## Complexity
- **Time:** O(n) – each node is visited at most once.  
- **Space:** O(1) – only two pointer variables are used, regardless of list size.

## Solution (c)

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    // struct ListNode* temp = head;
    // int length = 0;
    // if(head == NULL || head->next == NULL)
    // return head;

    // while(temp!= NULL){
    //     length++;
    //     temp = temp ->next;
    // }
    // int mid = length/2;

    // temp = head;
    // for(int i = 0;i<mid;i++){
    //     temp = temp->next;
    // }
    // return temp;

    if(head == NULL || head->next == NULL){
        return head;
    }

    struct ListNode* slow = head;
    struct ListNode* fast = head;

    while(fast!=NULL && fast->next!=NULL){
        slow = slow->next;
        fast = fast->next->next;
    }

    return slow;

    
}
```

---

**Runtime** 0 ms · **Memory** 9.1 MB

<sub>Synced by AILeetHub on 2026-05-07.</sub>
