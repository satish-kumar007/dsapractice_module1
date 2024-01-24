package com.carryforward;

public class LeaderFromLeftToRight_3 {
    public static void main(String[] args) {
        int []ar = {3,2,4,5,2,7,-1,15};
        int []ans = getLeaders(ar);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }

    public static int[] getLeaders(int[] arr){
        //Leader is an element which is max from all the elements of its left.
        //int countLeader=1; // first element will always a leader
        int max = arr[0];
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0]; //first element will always a leader, including this in result array
        for(int i=1;i<n;i++){
            if(arr[i] > max){
                max=arr[i];
            }
            ans[i] = max;
        }
        return ans;
    }
}
