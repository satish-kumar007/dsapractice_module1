package com.carryforward;

public class LeaderFromRightToLeft_4 {
    public static void main(String[] args) {
        int []ar = {16, 17, 4, 3, 5, 2};
        int []ans = getLeaders(ar);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
    public static int[] getLeaders(int[] arr){
        //Here we are getting leader from right to left direction
        int n = arr.length;
        int ans[] = new int[n];
        int max = arr[n-1]; // considering last element as leader
        ans[n-1] = arr[n-1];//put last element in the result array
        for(int i=n-2;i>=0;i--){
            if(arr[i] > max){
                max = arr[i];
            }
            ans[i] = max;
        }
        return ans;
    }
}
