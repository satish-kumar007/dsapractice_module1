package com.binarytree2;
import java.util.LinkedList;
import java.util.Queue;

// Class to represent Tree node
class Node {
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}
public class LevelTraversal {
    Node root;

    // Given a binary tree. Print
    // its nodes in level order
    // using array for implementing queue
    int[][] printLevelOrder(){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            // poll() removes the present head.
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
        System.out.println();
        return null;
    }

    public static void main(String[] args) {
        LevelTraversal tree_level = new LevelTraversal();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}

