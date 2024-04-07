package com.carryforward;

public class PracticeBestSellingPrice {
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,4,3,8,5};
        System.out.println(maxProfit(arr));

        int[] arr_1 = {4,6,9,1,7,2};
        System.out.println(maxProfit(arr_1));
    }

    public static int maxProfit(int[] arr){
        int n = arr.length;
        int bsp = arr[n-1];
        //int profit = 0;
        int ans = 0;
        for(int i = n-2;i>=0;i--){
            int profit = bsp - arr[i];
            if(arr[i] > bsp){
                bsp = arr[i];
            }
            if(profit > ans){
                ans = profit;
            }
        }
        return ans;
    }
}
