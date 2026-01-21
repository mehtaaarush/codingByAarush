/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* ReverseLL(struct ListNode* head){
    struct ListNode* prevP = NULL;
    struct ListNode* currP = head;
    struct ListNode* nextP = NULL;

    while(currP!=NULL){
        nextP = currP->next;
        currP->next = prevP;
        prevP = currP;
        currP = nextP;
    }
    return prevP;
}



bool isPalindrome(struct ListNode* head) {
    if(head==NULL || head->next==NULL)
    return true;

    struct ListNode* slow = head;
    struct ListNode* fast = head;

    while(fast!=NULL && fast->next!=NULL){
        slow = slow->next;
        fast = fast->next->next;

    }

    struct ListNode* SecondHalf = ReverseLL(slow);

    struct ListNode* FirstHalf = head;
    struct ListNode* temp = SecondHalf;

    while(temp!=NULL){
        if(FirstHalf->val!=temp->val){
            return false;
        }else{
            FirstHalf = FirstHalf ->next;
            temp = temp->next;
        }
        
    }
    return true;



}