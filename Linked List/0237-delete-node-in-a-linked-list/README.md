# 237. Delete Node in a Linked List

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/delete-node-in-a-linked-list/)

`Linked List`

## Intuition
Since we never have access to the head of the list, we cannot traverse back to the node preceding the one to delete. The trick is to make the target node look like its successor and then drop that successor.

## Approach
1. Let `temp` point to `node->next`.  
2. Copy `temp->val` into `node->val`.  
3. Redirect `node->next` to `temp->next`.  
4. Free the memory of `temp`.  
The list now skips the original node, preserving order and reducing the node count by one.

## Complexity
- **Time:** O(1) – only a fixed number of pointer assignments and a single free call.  
- **Space:** O(1) – no auxiliary data structures are used; only a few local pointers.

## Solution (c)

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void deleteNode(struct ListNode* node) {
    
    struct ListNode* temp = node->next;

    node->val = temp->val;
    node->next = temp->next;


    free(temp);
}
```

---

**Runtime** 8 ms · **Memory** 10.8 MB

<sub>Synced by AILeetHub on 2026-02-19.</sub>
