package com.oneDArray;

public class WaterTrappedBuilding_5 {
    public static void main(String[] args) {
        int[] arr={4,2,5,7,4,3,2,6,8,2,3};
        int x = waterTrapped(arr);
        System.out.println(x);
    }
    public static int waterTrapped(int[] arr){
        int n=arr.length;
        int sum = 0;
        int[] rmax = getRmax(arr);
        int[] lmax = getLmax(arr);

        for(int i=0;i<n;i++){
            int l = lmax[i];
            int r = rmax[i];
            int current = arr[i];
            int level=Math.min(l,r);
            int amount=level - current;
            sum = sum+amount;
            System.out.println(l+" == "+r+" == "+current+ " == "+level+" == "+amount+" == "+sum);
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

    private static int[] getLmax(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int lmax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > lmax){
                lmax = arr[i];
            }
            ans[i] = lmax;
        }

        return ans;
    }
}
