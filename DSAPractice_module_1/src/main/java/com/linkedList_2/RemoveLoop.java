package com.linkedList_2;

public class RemoveLoop {
    public static void removeLoop(ListNode loop, ListNode head){
        ListNode ptr1 = loop;
        ListNode ptr2 = loop;

        // Count the number of nodes in loop
        int k = 1, i;
        ListNode prevNode = ptr1;
        while (ptr1.next != ptr2) {
            // keeping track beforeing moving next
            prevNode = ptr1;
            ptr1 = ptr1.next;
            k++;
        }
        prevNode.next = null;
    }
}
