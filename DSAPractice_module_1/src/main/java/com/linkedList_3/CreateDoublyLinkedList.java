package com.linkedList_3;

public class CreateDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedListNode head = new DoublyLinkedListNode(100);
        DoublyLinkedListNode node1 = new DoublyLinkedListNode(10);
        head.nextNode = node1;
        head.prevNode = null;
        DoublyLinkedListNode node2 = new DoublyLinkedListNode(20);
        node1.nextNode = node2;
        node2.prevNode = node1;
        DoublyLinkedListNode node3 = new DoublyLinkedListNode(30);
        node2.nextNode = node3;
        node3.prevNode = node2;
        DoublyLinkedListNode node4 = new DoublyLinkedListNode(40);
        node3.nextNode = node4;
        node4.prevNode = node3;
        DoublyLinkedListNode node5 = new DoublyLinkedListNode(50);
        node4.nextNode = node5;
        node5.prevNode = node4;
        DoublyLinkedListNode node6 = new DoublyLinkedListNode(60);
        node5.nextNode = node6;
        node6.prevNode = node5;
        DoublyLinkedListNode node7 = new DoublyLinkedListNode(70);
        node7.prevNode = node6;
        node6.nextNode = node7;

        traverseDoublyLinkedList(head);
        System.out.println("==================================================================");
        System.out.println("Deleting a node that is not head/tail");
        DoublyLinkedListNode deleteNode = deleteNode(node3);
        traverseDoublyLinkedList(deleteNode);
    }

    public static void traverseDoublyLinkedList(DoublyLinkedListNode node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.nextNode;
        }
    }

    public static DoublyLinkedListNode deleteNode(DoublyLinkedListNode temp){
        DoublyLinkedListNode t1 = temp.prevNode;
        DoublyLinkedListNode t2 = temp.nextNode;
        t1.nextNode = t2;
        t2.prevNode = t1;

        temp.prevNode = null;
        temp.nextNode = null;
        return temp;
    }

    public static DoublyLinkedListNode insertAtBack(DoublyLinkedListNode newNode, DoublyLinkedListNode tail){
        DoublyLinkedListNode temp = tail.prevNode;
        newNode.nextNode = tail;
        newNode.prevNode = temp;
        temp.nextNode = newNode;
        tail.prevNode = newNode;
        return newNode;
    }

}
