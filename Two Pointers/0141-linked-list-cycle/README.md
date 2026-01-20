# 141. Linked List Cycle

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/linked-list-cycle/)

`Hash Table` · `Linked List` · `Two Pointers` · `Floyd's Cycle Finding Algorithm`

## Intuition  
A cycle in a singly‑linked list means that starting from the head you can eventually revisit a node by following `next` pointers. If two pointers traverse the list at different speeds, a cycle forces them to meet at some node; without a cycle the fast pointer will reach the end of the list. This is the classic Floyd’s cycle‑finding idea.

## Approach  
1. Handle trivial cases: if the list is empty or has only one node, return `false`.  
2. Create two pointers, `slow` and `fast`, both starting at `head`.  
3. Iterate while `fast` and `fast->next` are non‑null:  
   * Move `slow` one step (`slow = slow->next`).  
   * Move `fast` two steps (`fast = fast->next->next`).  
   * If at any point `slow == fast`, a cycle exists; return `true`.  
4. If the loop terminates, `fast` has reached the end, so no cycle; return `false`.

The algorithm never allocates additional data structures; it only uses the two pointers.

## Complexity  
- **Time:** O(n) – each node is examined at most a constant number of times as the two pointers traverse the list.  
- **Space:** O(1) – only two pointer variables are maintained regardless of list size.

## Solution (c)

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
        if(head == NULL || head->next == NULL)
        return false;

        struct ListNode* fast = head;
        struct ListNode* slow = head;

        while(fast!= NULL && fast->next != NULL){
            slow = slow->next;
            fast = fast->next->next;
            if(slow==fast)
                return true;
    
        }
        
    return false;
}

```

---

**Runtime** 10 ms · **Memory** 11.2 MB

<sub>Synced by AILeetHub on 2026-01-20.</sub>
