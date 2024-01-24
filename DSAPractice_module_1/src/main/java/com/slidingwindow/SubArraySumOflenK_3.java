package com.slidingwindow;
public class SubArraySumOflenK_3 {
    public static void main(String[] args) {
        int[] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
        sumOfLenK(arr,5);
    }
    public static void sumOfLenK(int[] arr, int len){
        int n = arr.length;
        int s=0;
        int e = len-1;
        while(e < n){
            int sum = 0;
            for(int i=s;i<=e;i++){
                sum = sum + arr[i];
            }
            System.out.println(sum);
            s++;e++;
        }
    }
}
