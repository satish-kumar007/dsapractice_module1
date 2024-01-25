package com.dsaintro;

public class RotateArraysKthTime_3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 2;
        int[] arr = rotateArray(A,B);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
    public static int[] rotateArray(int[] A, int B) {
        int n = A.length;
        B = B % n;//important because after some time it start repeating
        ReverseArrayInRange_2.reverseArray(A,0, n-1);// rotate entire array
        ReverseArrayInRange_2.reverseArray(A,0, B-1);//rotate upto B-1
        ReverseArrayInRange_2.reverseArray(A,B, n-1);//rotate from B to n-1
        return A;
    }
}
