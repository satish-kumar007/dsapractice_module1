package com.slidingwindow;

public class SubArrayMaxSumOfLenK_4 {
    public static void main(String[] args) {
        int[] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
        int x = maxSumLenK(arr,5);
        System.out.println(x);
    }
    public static int maxSumLenK(int[] arr, int k){
        int n = arr.length;
        int s=0;
        int e=k-1;
        int maxSum=0;
        while(e < n){
            int sum = 0;
            for(int i=s;i<=e;i++){
                sum = sum+arr[i];
                maxSum = Math.max(maxSum,sum);
            }
            s++;
            e++;
        }
        return maxSum;
    }
}
