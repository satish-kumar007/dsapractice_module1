package com.oneDArray;
//reduce SC from O(N) to O(1)
public class WaterTrappedBuildingOptimized_7 {
    public static void main(String[] args) {
        int[] arr={4,2,5,7,4,3,2,6,8,2,3};
        int x = waterTrapped(arr);
        System.out.println(x);
    }
    public static int waterTrapped(int[] arr){
        int n = arr.length;
        int ans=0;
        int l=0;
        int r = n-1;
        int lmax=0;
        int rmax=0;

        while(l<r){
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);
            if(lmax <rmax){
                ans = ans +(lmax - arr[l]);
                l++;
            }else{
                ans = ans +(rmax - arr[r]);
                r--;
            }
        }
        return ans;
    }
}
