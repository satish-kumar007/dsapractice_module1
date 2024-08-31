package com.countsort;

public class RearrangeDigitsAsMinimum {
    public static void main(String[] args) {
        //int[] arr = {6,7,8,2,1,5,6,7,8,5,6,7};//output: 1 2 5 5 6 6 6 7 7 7 8 8
        int[] arr = {0,1,1,1,1,2,1,0,2,0,0,1,1,0,1,1};
        minDigits(arr);
    }
    public static int[] minDigits(int[] arr){
        int n = arr.length;
        int[] frequency = new int[10];
        for(int i=0;i<n;i++){
            int val = arr[i];
            frequency[val]++;
        }
        for(Integer i :  frequency){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<10;i++){
            int count = frequency[i];
            for(int j=1;j<=count;j++){
                System.out.print(i+" ");
            }
        }
        return null;
    }
}
