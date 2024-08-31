package com.linkedList_2;

public class CycleDetectionUsingTwoPointer {
    public static void main(String[] args) {
        boolean bool = detectCycle(list_1());
        System.out.println(bool);
    }
    public static boolean detectCycle(ListNode head){
        boolean isCycle = false;
        //ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle == true) return true;
        else return false;
    }

    public static ListNode list_1(){
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(7);
        node.next = node1;
        ListNode node2 = new ListNode(9);
        node1.next=node2;
        ListNode node3 = new ListNode(10);
        node2.next = node3;
        ListNode node4 = new ListNode(11);
        node3.next = node4;
        ListNode node5 = new ListNode(12);
        node4.next = node5;
        ListNode node6 = new ListNode(13);
        node5.next = node3;
        //node5 = node3;
        return node;
    }
}
