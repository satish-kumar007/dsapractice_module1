package com.slidingwindow;

public class SumOfAllSubarraySum_1 {
    public static void main(String[] args) {
        int[] A = {3,4,2};
        long sum = sumAllSubArray(A);
        System.out.println(sum);
    }
    public static long sumAllSubArray(int[] arr){
        int n = arr.length;
        int s=0;
        long allSum = 0;
        for(s=0;s<n;s++){
            long sum = 0;
            for(int e=s;e<n;e++){
                sum = sum+arr[e];
                allSum = allSum+sum;
                System.out.println(sum);
            }
        }
        return allSum;
    }
}
