# 24. Swap Nodes in Pairs

![Medium](https://img.shields.io/badge/Difficulty-Medium-ffc01e?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/swap-nodes-in-pairs/)

`Linked List` · `Recursion`

## Intuition
The function performs a depth‑first traversal of the list, swapping the values of each adjacent pair as it goes. By exchanging the `val` fields instead of re‑linking nodes, the algorithm keeps the list structure unchanged while achieving the desired pairwise order.

## Approach
1. **Base case** – If the list is empty or contains only one node, return the head unchanged.  
2. **Swap values** – Exchange the `val` of the current node (`head`) with that of its successor (`head->next`).  
3. **Recurse** – Call `swapPairs` on the node two positions ahead (`head->next->next`) to process the remaining list.  
4. **Return** – After the recursive call completes, return the original `head`, which now points to the swapped pair.

This recursive strategy visits each node once, performing a constant‑time swap at each step.

## Complexity
- **Time:** O(n) – each node is visited once and a constant amount of work is done per visit.  
- **Space:** O(n) – recursion depth equals the number of node pairs, leading to linear auxiliary stack usage.

## Solution (c)

```c
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if(head == NULL || head->next == NULL){
        return head;
    }
        int temp = head->val;
        head->val = head->next->val;
        head->next->val = temp;

        swapPairs(head->next->next);

        return head;
    
}
```

---

**Runtime** 0 ms · **Memory** 8.9 MB

<sub>Synced by AILeetHub on 2026-01-17.</sub>
