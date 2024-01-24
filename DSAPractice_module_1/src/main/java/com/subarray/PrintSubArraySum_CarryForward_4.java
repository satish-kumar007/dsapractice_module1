package com.subarray;

public class PrintSubArraySum_CarryForward_4 {
    public static void main(String[] args) {
        int[] arr = {2,8,-1,4};
        printSumCarryForward(arr);
    }
    public static void printSumCarryForward(int[] arr){
        int n = arr.length;
        int s=0,e=0;
        for(s=0;s<n;s++){
            int sum =0;
            for(e=s;e<n;e++){
                sum = sum+arr[e];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
