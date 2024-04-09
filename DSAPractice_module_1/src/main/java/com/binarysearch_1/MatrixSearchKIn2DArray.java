package com.binarysearch_1;
/*
Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integer B in matrix A.

This matrix A has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than or equal to the last integer of the previous row.
Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom, and columns are from left to right.
 */
public class MatrixSearchKIn2DArray {
    public static void main(String[] args) {
        int[][] A = {{1,   3,  5,  7},{10, 11, 16, 20},{23, 30, 34, 50}};
        int B = 31;
        System.out.println(findK(A,B));
    }
    public static int findK(int[][] A, int B){
        int n = A.length;
        int m = A[0].length;
        int left = 0;
        int right = (n*m) - 1;
        while(left <= right){
            int mid = (left+right)/2;
            int i = mid/m;
            int j = mid%m;
            if(A[i][j] == B){
                return 1;
            }else if(A[i][j] < B){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return 0;
    }
}
