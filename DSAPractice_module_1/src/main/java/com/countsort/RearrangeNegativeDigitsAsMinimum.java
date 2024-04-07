package com.countsort;

import java.util.Arrays;
import java.util.OptionalInt;

public class RearrangeNegativeDigitsAsMinimum {
    public static void main(String[] args) {
        int[] arr = {-2,-4,-1,0,-1,-2,-3,4,7,8,6,5,4};//n = 13
        rearrangeNumNegative(arr);
    }
    public static void rearrangeNumNegative(int[] arr){
        int n = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(max+"  ===  "+min);
        int minabs = Math.abs(min);
        int []freq = new int[max-min+1];
        for(int i=0;i<n;i++){
            int val = arr[i];
            freq[val + minabs]++;
        }

        for(int i=min;i<=max;i++){
            int count = freq[i + minabs];
            for(int j=1;j<=count;j++){
                System.out.print(i+" ");
            }
        }
    }
}
