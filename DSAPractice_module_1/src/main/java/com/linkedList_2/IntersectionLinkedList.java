package com.linkedList_2;

import java.util.List;

public class IntersectionLinkedList {
    public static void main(String[] args) {
        ListNode head1, head2;

        head1 = new ListNode(10);
        head2 = new ListNode(3);

        ListNode newNode = new ListNode(6);
        head2.next = newNode;

        newNode = new ListNode(9);
        head2.next.next = newNode;

        newNode = new ListNode(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new ListNode(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        ListNode intersection = getIntersectionNode(head1, head2);

        System.out.println(intersection.data);
    }
    public static ListNode getIntersectionNode(ListNode head1, ListNode head2){
        while (head2 != null) {
            ListNode temp = head1;
            while (temp != null) {
                // if both Nodes are same
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        // If intersection is not present between the lists,
        // return NULL.
        return null;
    }
}
