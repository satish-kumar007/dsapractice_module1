package com.slidingwindow;

public class SumOfAllSubarraySumContributionTechnique_2 {
    //Formula : (i+1)*(n-i) --> To check the occurnce
    public static void main(String[] args) {
        int[] A = {3,4,2};
        long sum = getSUmOfAllSubArraySum(A);
        System.out.println(sum);
    }
    public static long getSUmOfAllSubArraySum(int[] arr){
        int n = arr.length;
        long sum = 0;
        for(int i=0;i<n;i++){
            int occur = (i+1)*(n-i);
            int contribution = arr[i]*occur;
            sum = sum+contribution;
        }
        return sum;
    }
}
