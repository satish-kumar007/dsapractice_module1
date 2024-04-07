package com.twoDArray;

public class PrintArrayInClockwiseDirection {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{7,8,9,10},{11,12,13,14},{10,20,30,40}};
        printClockWise(arr);
    }

    public static void printClockWise(int[][] arr){
        int n = arr.length;
        int i=0;int j=0;
        int k = 1;
        for(k=1;k<n;k++){
            System.out.print(arr[i][j]+" ");
            j++;
        }
        System.out.println();
        for(k=1;k<n;k++){
            System.out.print(arr[i][j]+" ");
            i++;
        }
        System.out.println();
        for(k=1;k<n;k++){
            System.out.print(arr[i][j]+" ");
            j--;
        }
        System.out.println();
        for(k=1;k<n;k++){
            System.out.print(arr[i][j]+" ");
            i--;
        }
        if(n == 1){
            System.out.println(arr[0][0]);
        }
    }
}
