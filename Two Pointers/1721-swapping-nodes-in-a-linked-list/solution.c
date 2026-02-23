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