package com.sortingbasic;

import java.util.Arrays;

public class CountNobleIntegerDupes_3 {
    public static void main(String[] args) {
        int[] arr = {0,2,2,3,3,6};
        int x = countNobleDupes(arr);
        System.out.println(x);
    }
    public static int countNobleDupes(int[] arr){
        int n = arr.length;
        int less=0;
        int count=0;
        Arrays.sort(arr);
        if(arr[0] == 0) count++;
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]) less=i;
            else if(arr[i] == arr[i-1]){}
            if(less == arr[i]) count++;
        }
        return count;
    }
}
