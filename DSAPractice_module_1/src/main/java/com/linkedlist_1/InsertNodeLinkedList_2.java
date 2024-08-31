package com.linkedlist_1;

public class InsertNodeLinkedList_2 {
    public ListNode solve(ListNode head, int B, int P) {
        ListNode node = new ListNode(B);
        if(P == 0){
            node.next = head;
            head = node;
        }else{
            ListNode temp = head;
            for(int i=1;i<P;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        return node;
    }
}
