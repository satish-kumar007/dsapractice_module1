package com.dsaintro;

public class ReverseArrayInRange_2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int B = 2;
        int C = 3;
        int[] ar = reverseArray(A,B,C);
        for(Integer i: ar){
            System.out.print(i+" ");
        }
    }
    public static int[] reverseArray(int[] A, int B, int C) {
        //int n=A.length;
        int s=B;
        int e=C;
        while(s<e){
            int temp= A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        return A;
    }
}
