package com.binarysearch_1;
/*
You are given a sorted array A of size N and a target value B.
Your task is to find the index (0-based indexing) of the target value in the array.

If the target value is present, return its index.
If the target value is not found, return the index of least element greater than equal to B.
If the target value is not found and least number greater than equal to target is also not present, return the length of array (i.e. the position where target can be placed)
Your solution should have a time complexity of O(log(N)).
 */
public class AssignmentFindIndexProblem {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,5,6};
        int B=2;
        int val = searchInsert(arr, B);
        System.out.println(val);
    }
    public static int searchInsert(int[] A, int B) {
        int n = A.length;
        int ans = n;
        int leftSide = 0;
        int rightSide = n-1;
        while(leftSide <= rightSide){
            int mid = leftSide+(rightSide-leftSide)/2;
            if(A[mid] == B){
                return mid;
            }else if(A[mid] < B){
                leftSide = mid+1;
            }else if(A[mid] > B){
                ans = mid;
                rightSide = mid-1;
            }
        }
        return ans;
    }
}
