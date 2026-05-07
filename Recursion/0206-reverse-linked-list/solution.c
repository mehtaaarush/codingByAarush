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