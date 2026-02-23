/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeNodes(struct ListNode* head) {
    struct ListNode* curr = head->next;  // skip first zero
    struct ListNode* write = head;       // will store sums
    
    int sum = 0;
    
    while (curr != NULL) {
        if (curr->val == 0) {
            write = write->next;   // move to next position
            write->val = sum;      // store sum
            sum = 0;               // reset
        } else {
            sum += curr->val;
        }
        curr = curr->next;
    }
    
    write->next = NULL;   // remove extra nodes
    return head->next;    // skip original first zero
}