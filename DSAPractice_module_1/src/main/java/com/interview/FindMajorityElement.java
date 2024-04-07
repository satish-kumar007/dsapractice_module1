package com.interview;

public class FindMajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,4,3,6,1,3,2,5,3};
        System.out.println(findMajority(arr));
    }

    public static int findMajority(int[] arr){
        int n = arr.length;
        int majority = arr[0];
        int count = 1;
        for(int i=1;i<n;i++){
            if(count == 0){
                majority = arr[i];
                count=1;
            }else if(arr[i] == majority){
                count++;
            }else{
                count--;
            }
        }

        int frequency = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == majority){
                frequency++;
            }
        }
        if(frequency > n/2){
            return majority;
        }
        return -1;
    }
}
