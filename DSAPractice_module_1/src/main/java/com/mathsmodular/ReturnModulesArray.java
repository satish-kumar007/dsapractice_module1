package com.mathsmodular;

public class ReturnModulesArray {
    public static int[] mod(int[] arr, int m){
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i] < 0)
                ans[i] = (arr[i]%m+m)%m;
            else
                ans[i] = arr[i]%m;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {34,6,1,-60,-40,-80};
        int[] x = mod(arr,7);
        for(Integer i : x){
            System.out.print(i+" ");
        }
    }
}
