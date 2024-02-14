package com.linkedList_2;

public class MiddleOfLinkedList_1 {
    public int solve(ListNode A) {
        if(A == null) return A.val;
        ListNode slow = A;
        ListNode fast = A;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}

class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
