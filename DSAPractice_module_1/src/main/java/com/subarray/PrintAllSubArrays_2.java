package com.subarray;

public class PrintAllSubArrays_2 {
    public static void main(String[] args) {
        int[] arr = {2,8,-1,4};
        printAll(arr);
    }
    public static void printAll(int[] arr){
        int n = arr.length;
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                for(int k=s;k<=e;k++){//important: here k should be less than equal to e
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
