# 206. Reverse Linked List

![Easy](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) [Open on LeetCode](https://leetcode.com/problems/reverse-linked-list/)

`Linked List` · `Recursion`

## Approach

Accepted easy solution in c.
Relevant topics: Linked List, Recursion.

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
// struct ListNode* reverseList(struct ListNode* head) {
//     if(head == NULL || head ->next == NULL)
//     return head;

//     struct ListNode* prevP = NULL;
//     struct ListNode* currentP = head;
//     struct ListNode* nextP = head ->next;

//     while(currentP != NULL){
//         currentP->next = prevP;

//         prevP = currentP;
//         currentP = nextP;
//         if(nextP != NULL)
//         nextP = nextP->next;
//     }
//     return prevP;
// }

struct ListNode* reverseList(struct ListNode* head) {

    struct ListNode* prev = NULL;
    struct ListNode* curr = head;

    while(curr != NULL) {

        struct ListNode* next = curr->next;

        curr->next = prev;

        prev = curr;
        curr = next;
    }

    return prev;
}
```

---

**Runtime** 0 ms · **Memory** 11.4 MB

<sub>Synced by AILeetHub on 2026-05-07.</sub>
