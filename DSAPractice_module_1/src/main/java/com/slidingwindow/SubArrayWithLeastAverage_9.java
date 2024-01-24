package com.slidingwindow;

public class SubArrayWithLeastAverage_9 {
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        int min = getLeastAverage(A,B);
        System.out.println(min);
    }
    public static int getLeastAverage(int[] arr, int k){
        //It is to note that, lease sum of sum array sum will have the least average
        int n=arr.length;
        int sum=0;
        int minSum=Integer.MAX_VALUE;

        for(int i=0;i<k;i++){
            sum = sum + arr[i];
        }
        int s=1;
        int e=k;
        while(e<n){
            sum = sum - arr[s-1]+arr[e];
            minSum = Math.min(minSum,sum);
            e++;
            s++;
        }
        return minSum;
    }
}
