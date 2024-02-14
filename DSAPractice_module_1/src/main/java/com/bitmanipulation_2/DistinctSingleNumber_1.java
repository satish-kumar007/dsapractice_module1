package com.bitmanipulation_2;

public class DistinctSingleNumber_1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,4,5,6};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
