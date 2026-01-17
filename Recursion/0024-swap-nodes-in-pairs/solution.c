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