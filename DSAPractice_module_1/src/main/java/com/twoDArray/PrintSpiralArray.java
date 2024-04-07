package com.twoDArray;

public class PrintSpiralArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3,4,5,6,90,11},
                {7,8,9,10,12,14},
                {11,12,13,14,34,45},
                {10,20,30,40,56,67},
                {21,222,333,41,55,60},
                {40,20,30,50,76,17}
        };
        printSpiral(arr);
    }
    public static void printSpiral(int[][] arr){
        int n = arr.length;
        int i=0;
        int j=0;
        int k=0;
        while(n > 1){
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
            System.out.println();
            i++;
            j++;
            n = n-2;
        }
        if(n==1){
            System.out.print(arr[i][j]+" ");
        }
    }
}
