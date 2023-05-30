/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k){
    if(head==NULL){
        return head;
    }
    int n=0;
    struct ListNode*temp=head;
    while(temp!=NULL){
        n++;
        temp=temp->next;
    }
    if(n==1 ||k%n==0){
        return head;
    }
    int j=0;
    temp=head;
    struct ListNode* ptr=NULL;
    while(temp!=NULL){
        j++;
        if(j==n-k%n){
            ptr=temp->next;
            temp->next=NULL;
        }
        temp=temp->next;
    }
    temp=ptr;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=head;
    return ptr;
}