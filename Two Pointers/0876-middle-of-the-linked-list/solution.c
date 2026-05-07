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