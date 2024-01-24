package com.sortingbasic;

import java.util.Arrays;

public class CountNobleInteger_2 {
    public static void main(String[] args) {
        int []A = {-1,-5,3,5,-10,4};
        int x = countNobleInteger(A);
        System.out.println(x);
    }
    public static int countNobleInteger(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i] == i){
                count++;
            }
        }
        return count;
    }
}
