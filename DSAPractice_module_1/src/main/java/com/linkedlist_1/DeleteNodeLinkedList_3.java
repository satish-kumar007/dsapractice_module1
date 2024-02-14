package com.linkedlist_1;

public class DeleteNodeLinkedList_3 {
    public ListNode solve(ListNode A, int B) {
        if(A == null) return A;
        ListNode temp = A;
        if(A.val == B){
            A = A.next;
            return A;
        }
        while(temp != null){
            if(temp.next != null && temp.next.val == B){
                temp.next = temp.next.next;
                return A;
            }
            temp = temp.next;
        }
        return A;
    }
}
