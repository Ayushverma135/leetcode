/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *reverse(struct ListNode *head){
    struct ListNode *cur=head,*prev=NULL;
    while(cur!=NULL){
        struct ListNode *temp=cur->next;
        cur->next=prev;
        prev=cur;
        cur=temp;
    }
    return prev;
}
int length(struct ListNode *head){
    int l=0;
    while(head){
        l++;
        head=head->next;
    }
    return l;
}
bool isPalindrome(struct ListNode* head){
    int n=length(head)/2;
    if(n==0){
        return true;
    }
    struct ListNode *ptr=head;
    while(--n){
        ptr=ptr->next;
    }
    struct ListNode *temp=reverse(ptr->next);
    ptr=head;
    while(temp){
        if(ptr->val!=temp->val){
            return false;
        }
        ptr=ptr->next;
        temp=temp->next;
    }
    return true;
}