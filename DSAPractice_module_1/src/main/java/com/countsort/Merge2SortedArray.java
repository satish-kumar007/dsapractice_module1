package com.countsort;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] A = {3,5,8,9};
        int []B = {1,3,7,8,10,11};
        int ans[] = merge(A,B);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
    public static int[] merge(int[] ar1, int []ar2){
        int n = ar1.length;
        int m = ar2.length;
        int[] ans = new int[n+m];
        int p1=0; int p2=0;
        int k=0;
        while(p1<n && p2<m){
            if(ar1[p1] < ar2[p2]){
                ans[k] = ar1[p1];
                p1++;
                k++;
            }else{
                ans[k] = ar2[p2];
                p2++;
                k++;
            }
        }

        while(p1<n){
            ans[k] = ar1[p1];
            p1++;
            k++;
        }

        while(p2<m){
            ans[k] = ar2[p2];
            p2++;
            k++;
        }
        return ans;
    }
}
