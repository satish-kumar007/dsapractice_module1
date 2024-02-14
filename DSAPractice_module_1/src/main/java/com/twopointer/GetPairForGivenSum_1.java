package com.twopointer;

public class GetPairForGivenSum_1 {
    public static void main(String[] args) {
        int [] arr = {-5,-2,1,8,10,12,15};
        int k = 11;
        getPair(arr,k);
    }
    public static void getPair(int[] arr, int k){
        int n=arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            if(arr[i]+arr[j] > k){
                j--;
            }else if(arr[i]+arr[j] < k){
                i++;
            }else if(arr[i] + arr[j] == k){
                System.out.println("("+i+","+j+")");
                break;
            }else{
                System.out.println("not found");
            }
            //i++;

        }
    }
}
