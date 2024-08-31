package com.linkedList_2;
public class MergeLinkedList {
    public static void main(String[] args) {
        ListNode node = list_1();
        traverseLinkedList(node);
        System.out.println();
        ListNode node1 = list_2();
        traverseLinkedList(node1);
        System.out.println();
        ListNode merged = mergeNode(node, node1);
        traverseLinkedList(merged);
    }


    public static ListNode list_1(){
        ListNode node = new ListNode(3);
        ListNode node1 = new ListNode(7);
        node.next = node1;
        ListNode node2 = new ListNode(9);
        node1.next=node2;
        ListNode node3 = new ListNode(10);
        node2.next = node3;
        return node;
    }

    public static ListNode list_2(){
        ListNode node = new ListNode(4);
        ListNode node1 = new ListNode(6);
        node.next = node1;
        ListNode node2 = new ListNode(8);
        node1.next=node2;
        ListNode node3 = new ListNode(11);
        node2.next = node3;
        return node;
    }

    public static void traverseLinkedList(ListNode head){
        if(head == null) return;
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static ListNode mergeNode(ListNode h1, ListNode h2){
        ListNode head = null;
        ListNode temp = null;
        if(h1 == null) return h2;
        if(h2 == null) return h1;
        if(h1.data < h2.data){
            head = h1;
            temp = h1;
            h1 = h1.next;
        }else{
            head = h2;
            temp = h2;
            h2 = h2.next;
        }
        while(h1 != null && h2 != null){
            if(h1.data < h2.data){
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }
        if(h1 != null){
            temp.next = h1;
        }
        if(h2 != null){
            temp.next = h2;
        }
        return head;
    }
}
