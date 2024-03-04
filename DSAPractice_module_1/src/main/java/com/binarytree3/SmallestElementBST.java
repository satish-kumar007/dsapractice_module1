package com.binarytree3;

public class SmallestElementBST {
    int count;
    int ans;
    public static void main(String[] args) {

    }
    public int kthsmallest(TreeNode A, int B) {
        count=0;
        ans=0;
        travel(A,B);
        return ans;
    }

    public void travel(TreeNode root, int k){
        if(root == null)
            return;
        travel(root.left,k);
        //work
        count++;
        if(count == k){
            ans = root.val;
            return;
        }
        travel(root.right,k);
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
      left=null;
       right=null;
     }
 }
