/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getmid(struct ListNode *head){
    struct ListNode *slow=head;
    struct ListNode *fast=head->next;
    while(fast!=NULL && fast->next!=NULL){
        slow=slow->next;
        fast=fast->next->next;
    }
    struct ListNode *temp=slow->next;
    slow->next=NULL;
    return temp;
}
struct ListNode *mergeSort(struct ListNode *left,struct ListNode *right){
    struct ListNode *arr=(struct ListNode*)malloc(sizeof(struct ListNode));
    arr->val=0;
    arr->next=NULL;
    struct ListNode *ptr=arr;
    while(left!=NULL && right!=NULL){
        if(left->val<right->val){
            ptr->next=left;
            left=left->next;
        }
        else{
            ptr->next=right;
            right=right->next;
        }
        ptr=ptr->next;
    }
    if(left){
        ptr->next=left;
    }
    if(right){
        ptr->next=right;
    }
    return arr->next;
}
struct ListNode* sortList(struct ListNode* head){
    if(head==NULL || head->next==NULL){
        return head;
    }
    struct ListNode *mid=getmid(head);
    struct ListNode *left=sortList(head);
    struct ListNode *right=sortList(mid);
    return mergeSort(left,right);
}