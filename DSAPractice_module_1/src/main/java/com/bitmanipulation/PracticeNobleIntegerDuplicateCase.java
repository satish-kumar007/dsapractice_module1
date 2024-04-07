package com.bitmanipulation;

import java.util.Arrays;

public class PracticeNobleIntegerDuplicateCase {
    public static int countNoble(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int count=0;
        int less = 0;
        for(int i = 1;i<n;i++){
            if(arr[i] != arr[i-1]){
                less = i;
            }
            else if(arr[i] == arr[i-1]){
                //do nothing
            }
            if(less == arr[i]){
                count++;
            }
        }
        return count;
    }
}
