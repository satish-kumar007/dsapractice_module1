package com.linkedlist_1;

public class InsertNodeLinkedList_2 {
    public ListNode solve(ListNode A, int B, int C) {
        ListNode node = new ListNode(B);
        if(C == 0){
            node.next = A;
            A = node;
        }else{
            ListNode temp = A;
            for(int i=1;i<C;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        return node;
    }
}
