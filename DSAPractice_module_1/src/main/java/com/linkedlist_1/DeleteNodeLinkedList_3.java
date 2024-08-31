package com.linkedlist_1;

public class DeleteNodeLinkedList_3 {
    public ListNode solve(ListNode head, int B) {
        if(head == null) return head;
        ListNode temp = head;
        if(head.val == B){
            head = head.next;
            return head;
        }
        while(temp != null){
            if(temp.next != null && temp.next.val == B){
                temp.next = temp.next.next;
                return head;
            }
            temp = temp.next;
        }
        return head;
    }
}
