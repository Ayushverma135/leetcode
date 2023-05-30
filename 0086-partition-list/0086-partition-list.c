/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* partition(struct ListNode* head, int x){
    struct ListNode* arr1=(struct ListNode*)malloc(sizeof(struct ListNode));
    struct ListNode* arr2=(struct ListNode*)malloc(sizeof(struct ListNode));
    arr1->val=0;
    arr1->next=NULL;
    arr2->val=0;
    arr2->next=NULL;
    struct ListNode *ptr1=arr1;
    struct ListNode *ptr2=arr2;
    while(head!=NULL){
        if(head->val<x){
            ptr1->next=head;
            ptr1=ptr1->next;
        }
        else{
            ptr2->next=head;
            ptr2=ptr2->next;
        }
        head=head->next;
    }
    ptr1->next=arr2->next;
    ptr2->next=NULL;
    return arr1->next;
}