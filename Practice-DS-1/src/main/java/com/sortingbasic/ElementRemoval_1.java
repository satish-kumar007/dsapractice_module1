package com.sortingbasic;

import java.util.Arrays;

public class ElementRemoval_1 {
    public static void main(String[] args) {
        int[] A = {5};
        int x = getMinRemovalCost(A);
        System.out.println(x);
    }
    public static int getMinRemovalCost(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int []rev = reverse(arr);
        int mincost = 0;
        for(int i=0;i<n;i++){
            mincost = mincost + (i+1)*rev[i];
        }
        return mincost;
    }

    public static int[] reverse(int[] arr){
        int n=arr.length;
        int[] ans = new int[n];
        int s=0;int e=n-1;
        while(s<n){
            int temp = arr[s];
            ans[s] = arr[e];
            ans[e] = temp;
            e--;
            s++;
        }
        return ans;
    }
}
