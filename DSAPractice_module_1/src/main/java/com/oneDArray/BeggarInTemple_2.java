package com.oneDArray;

public class BeggarInTemple_2 {

    public static void main(String[] args) {
        int []x = new int[7];
        int [][]y = {{1,3,2},{2,5,3},{2,4,1},{3,6,2}};
        int[] z = moneyInThePot(x,y); //Before prefix sum: ans: 0 2 4 2 -2 -1 -3
                                      //After prefix sum :  0 2 6 8 6 5 2
        for(Integer i:z){
            System.out.print(i+" ");
        }
    }
    public static int[] moneyInThePot(int[] arr, int[][] money){
        int n = arr.length;
        int[] amount = new int[arr.length];
        for(int i=0;i<money.length;i++){
            int s = money[i][0];
            int e = money[i][1];
            int v = money[i][2];
            amount[s] = amount[s] + v;
            if(e+1 < n){
                amount[e+1] = amount[e+1] - v;
            }
        }
        int[] psum = prefixSum(amount);

        return psum;
    }
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}
