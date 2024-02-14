package com.oneDArray;

public class FindLeftMax_4 {
    public static void main(String[] args) {
        int[] x = {4,2,5,7,4,3,2,6,8,2,3};
        int lMax = Integer.MIN_VALUE;
        for(int i=0;i<x.length;i++){
            if(x[i] > lMax){
                lMax = x[i];
            }
            x[i] = lMax;
        }
        for(Integer i : x){
            System.out.print(i+" ");
        }
    }
}
