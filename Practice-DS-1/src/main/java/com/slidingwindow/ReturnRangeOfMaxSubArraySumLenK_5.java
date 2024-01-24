package com.slidingwindow;

public class ReturnRangeOfMaxSubArraySumLenK_5 {
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        int min = getRange(A,B);
        System.out.println(min);
    }
    public static int getRange(int[] arr, int k){
        int n=arr.length;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int startIndex=0;
        int endIndex = 0;

        for(int i=0;i<k;i++){
            sum = sum+arr[i];
        }
        int s=1;
        int e=k;
        while(e<n){
            sum = sum-arr[s-1]+arr[e];
            if(sum > maxSum){
                maxSum = sum;
                startIndex = (e-s);
                endIndex = startIndex+k-1;
            }
            e++;
            s++;
        }
        System.out.println(startIndex+"   ======    "+endIndex);
        return startIndex;
    }
}
