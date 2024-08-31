package com.linkedList_3;

import com.linkedList_3.DoublyLinkedListNode;

public class DeleteGivenNode {
    public static void main(String[] args) {
        //CreateDoublyLinkedList.traverseDoublyLinkedList();

    }
    public static DoublyLinkedListNode deleteNode(DoublyLinkedListNode temp){
        DoublyLinkedListNode t1 = temp.prevNode;
        DoublyLinkedListNode t2 = temp.nextNode;
        t1.nextNode = t2;
        t2.prevNode = t1;

        temp.prevNode = null;
        temp.nextNode = null;
        return t1;
    }
}
