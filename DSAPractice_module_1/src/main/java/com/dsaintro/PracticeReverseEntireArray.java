package com.dsaintro;

import java.util.Arrays;

public class PracticeReverseEntireArray {
    public static void main(String[] args) {
        int[] arr = {4,9,0,7,5,6,7};
        Arrays.stream(reverseArray(arr)).forEach(System.out::print);//way 1 using java 8
    }

    public static int[] reverseArray(int[] arr){
        int n = arr.length;
        int p1 = 0;
        int p2 = n-1;
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
