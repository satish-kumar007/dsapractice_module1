package com.subarray;

public class ReturnMaxSubArraySumKadaneAlgo_6 {
    public static void main(String[] args) {
        int[] arr = {2,8,-1,4};
        getMaxSubArrayKadane(arr);
    }
    public static int getMaxSubArrayKadane(int[] arr){
        int n = arr.length;
        int maxsum = arr[0];//max sum will be first element in the beginning
        int sum=arr[0];//sum will be first element in the beginning
        for(int i=1;i<n;i++){
            if(sum < 0){
                sum = 0;
            }
            sum = sum + arr[i];
            maxsum = Math.max(maxsum,sum);
            System.out.println(maxsum+" == ");
        }
        System.out.println(maxsum);
        return maxsum;
    }
}
