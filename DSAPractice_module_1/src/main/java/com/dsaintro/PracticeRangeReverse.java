package com.dsaintro;

import java.util.Arrays;

public class PracticeRangeReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(rangeReverse(arr,2,7)).forEach(System.out::print);
    }
    public static int[] rangeReverse(int[] arr, int start, int end){
        int n = arr.length;
        int p1 = start;
        int p2 = end;
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }
}
