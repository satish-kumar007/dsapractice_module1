package com.linkedlist_1;

public class PrintLinkedList_1 {
    public static void main(String[] args) {

    }
    public void solve(ListNode A) {
        ListNode temp =  A;
        while(temp!=null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
    }
}
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}
