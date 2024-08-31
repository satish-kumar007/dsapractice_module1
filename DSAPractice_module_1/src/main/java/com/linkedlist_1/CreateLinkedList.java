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

        traverseLinkedList(temp);
        linkedListSize(temp);
        System.out.println();
        int x = midOfLLBruteForce(temp);
        System.out.println(x);
        LinkedList midNode = midOfLLOptimal(temp);
        System.out.println("MID :: "+midNode.data);
        LinkedList list = insertAt0(head,0);
        traverseLinkedList(list);
        LinkedList linkedList = insertAtKth(head,3);
        traverseLinkedList(linkedList);
        System.out.println();
        LinkedList delete = deleteAt0(head,0);
        traverseLinkedList(delete);
        System.out.println();
        LinkedList deleteK = deleteAtKth(head,5);
        traverseLinkedList(deleteK);
        System.out.println();
        LinkedList reverseLL = reverseLinkedList(head);
        traverseLinkedList(reverseLL);

    }

    public static void traverseLinkedList(LinkedList head){
        if(head == null) return;
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void linkedListSize(LinkedList linkedList){
        System.out.println();
        int count = 0;
        while(linkedList != null){
            count++;
            linkedList = linkedList.next;
        }
        System.out.println("Size of linked List :: "+count);
    }

    public static LinkedList insertAt0(LinkedList head, int pos){
        LinkedList node = new LinkedList(90);
        if(pos == 0){
            node.next = head;
        }
        head = node;
        return head;
    }

    public static LinkedList insertAtKth(LinkedList head, int pos){
        System.out.println();
        LinkedList node = new LinkedList(100);
        LinkedList temp = head;
        for(int i=1;i<pos;i++){
            temp = temp.next; // here we are traversing from 1st to pos-1 node and storing its address into temp
        }
        node.next = temp.next; // here temp.next contains the address of existing next node, we are taking that address and telling new node to point pos+1 node.
        temp.next = node; // finally we are modifying pos-1 node address, and storing ned node address into pos-1 node.
        return head;
    }

    public static LinkedList deleteAt0(LinkedList head, int pos){
        if(pos == 0){
            head = head.next;
        }
        return head;
    }

    public static LinkedList deleteAtKth(LinkedList head, int pos){
        if(pos == 0){
            head = head.next;
        }else{
            LinkedList temp = head;
            while(pos > 1){
                temp = temp.next; // here we are traversing from 1st to pos-1 node and storing its address into temp
                pos = pos-1;
            }
            temp.next = temp.next.next;// Link pos+2 node with the pos-1 node.
        }
        return head;
    }

    public static LinkedList reverseLinkedList(LinkedList head){
        if(head == null || head.next == null){
            return head;
        }else{
            LinkedList prev = null; // previous node marked as null
            LinkedList curr = head;// head node marked as current node
            while(curr != null){ // check for current node to not null
                LinkedList forward = curr.next;// marked current + 1 node as forward
                curr.next = prev; //
                prev = curr;
                curr = forward;
            }
            head = prev;
            return head;
        }
    }

    public static int midOfLLBruteForce(LinkedList head){
        int count=0;
        int mid=0;
        LinkedList temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        if((count & 1) == 0)
            mid = count/2;
        else
            mid = (count/2)+1;
        return mid;
    }

    public static LinkedList midOfLLOptimal(LinkedList head){
        if(head == null || head.next == null) return head;
        LinkedList slowNode = head;
        LinkedList fastNode = head;
        while(fastNode.next != null && fastNode.next.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }
}

