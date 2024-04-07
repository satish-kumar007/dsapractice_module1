package com.linkedlist_1;

class LinkedList{
    int data;
    LinkedList next;
    public LinkedList(int data){
        this.data = data;
        next = null;
    }
}
public class CreateLinkedList {
    public static void main(String[] args) {
        LinkedList node = new LinkedList(-1);
        createLinkedList(node);
    }

    public static void createLinkedList(LinkedList head){
        LinkedList temp = head;

        LinkedList node2 = new LinkedList(10);
        temp.next = node2;
        LinkedList node3 = new LinkedList(20);
        node2.next = node3;
        LinkedList node4 = new LinkedList(30);
        node3.next = node4;
        LinkedList node5 = new LinkedList(40);
        node4.next = node5;
        LinkedList node6 = new LinkedList(50);
        node5.next = node6;
        LinkedList node7 = new LinkedList(60);
        node6.next = node7;
        LinkedList node8 = new LinkedList(70);
        node7.next = node8;

        if(temp == null) return;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        //System.out.println(node5.data);
    }
}

