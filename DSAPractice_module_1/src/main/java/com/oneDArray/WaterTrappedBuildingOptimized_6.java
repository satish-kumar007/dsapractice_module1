package com.oneDArray;
//Find the lmax on the go and create only rmax to reduce SC from 2N to N
public class WaterTrappedBuildingOptimized_6 {
    public static void main(String[] args) {
        int[] arr={4,2,5,7,4,3,2,6,8,2,3};
        int x = waterTrapped(arr);
        System.out.println(x);
    }
    public static int waterTrapped(int[] arr){
        int n=arr.length;
        int sum = 0;
        int[] rmax = getRmax(arr);
        int lmax=0;

        for(int i=0;i<n;i++){
            lmax = Math.max(lmax,arr[i]); // Only variable created instead of lmax array.
            int l = lmax; // assigned
            int r = rmax[i];
            int current = arr[i];
            int level=Math.min(l,r);
            int amount=level - current;
            sum = sum+amount;
            //System.out.println(l+" == "+r+" == "+current+ " == "+level+" == "+amount+" == "+sum);
        }
        return sum;
    }

    private static int[] getRmax(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int rmax = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i] > rmax){
                rmax = arr[i];
            }
            ans[i] = rmax;
        }
        return ans;
    }
}
