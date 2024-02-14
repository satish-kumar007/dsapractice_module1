package com.oneDArray;

public class FindRightMax_3 {
    public static void main(String[] args) {
        int[] x = {4,2,5,7,4,3,2,6,8,2,3};
        int n = x.length;
        int rmax = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(x[i] > rmax){
                rmax = x[i];
            }
            x[i] = rmax;
        }

        System.out.println();
        for(Integer i : x){
            System.out.print(i+" ");
        }
    }
}
