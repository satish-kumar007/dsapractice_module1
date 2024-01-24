package com.subarray;

public class PrintMaximumSubArraySum_5 {
    public static void main(String[] args) {
        int[] arr = {2,8,-1,4};
        printMaxSubArraySum(arr);
    }
    public static void printMaxSubArraySum(int[] arr){
        int n=arr.length;
        int s=0,e=0;
        int maxSum = Integer.MIN_VALUE;
        for(s=0;s<n;s++){
            int sum = 0;
            for(e=s;e<n;e++){
                sum = sum + arr[e];
                maxSum = Math.max(maxSum,sum);
            }
        }
        System.out.println(maxSum);
    }
}
