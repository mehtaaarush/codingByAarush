# 203. Remove Linked List Elements

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/remove-linked-list-elements/)

`Linked List` · `Recursion`

## Intuition  
The list may start with one or more nodes that match the target value. Those nodes must be removed before any traversal that relies on a non‑matching head. After the head is stable, we can safely walk through the list once, deleting any subsequent node whose value equals the target.

## Approach  
1. **Trim the head** – While the current head exists and its value equals `val`, free that node and advance the head pointer.  
2. **Traverse the rest** – Keep a pointer `curr` to the current node. While `curr` and `curr->next` are valid, check `curr->next->val`.  
   * If it matches `val`, unlink the next node, free it, and keep `curr` unchanged to test the new next node.  
   * Otherwise, move `curr` forward.  
3. Return the (possibly new) head.  
The algorithm uses only pointer manipulation and constant auxiliary storage, freeing each removed node immediately.

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
struct ListNode* removeElements(struct ListNode* head, int val) {
    while(head!=NULL && head->val==val){
        struct ListNode* temp = head;
        head = head->next;
        free(temp);
        }
    struct ListNode* curr = head;
    
    while(curr!=NULL && curr->next!=NULL){
        if(curr->next->val==val){
            struct ListNode* temp = curr->next;
            curr->next = curr->next->next;
            free(temp);
        }else{
            curr = curr->next;
        }
    }
    return head;

   

}
```

---

**Runtime** 1 ms · **Memory** 12.7 MB

<sub>Synced by AILeetHub on 2026-02-01.</sub>
