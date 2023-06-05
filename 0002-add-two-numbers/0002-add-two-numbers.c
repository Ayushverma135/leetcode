/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode *head = NULL, *tail = NULL;
    int carry = 0;
    while (l1 != NULL || l2 != NULL || carry != 0){
        int sum=0;
        if(l1!=NULL){
            sum+=l1->val;
        }
        if(l2!=NULL){
            sum+=l2->val;
        }
        sum+=carry;
        carry = sum / 10;
        sum %= 10;
        struct ListNode *node = malloc(sizeof(struct ListNode));
        node->val = sum;
        node->next = NULL;
        if (head == NULL) {
            head = node;
            tail = node;
        } 
        else {
            tail->next = node;
            tail = node;
        }
        l1 = l1 ? l1->next : l1;
        l2 = l2 ? l2->next : l2;
    }
    return head;
}