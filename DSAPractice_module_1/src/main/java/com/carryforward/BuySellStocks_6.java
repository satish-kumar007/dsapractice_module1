package com.carryforward;

public class BuySellStocks_6 {
    public static void main(String[] args) {
        int []A = {1, 4, 5, 2, 4};
        maxProfit(A);
    }
    public static int maxProfit(final int[] A) {
        //calculate max profit and day of max profit
        int n = A.length;
        int bestSellingPrice = A[n-1];
        int max=0;
        int day=0;
        for(int i=n-2;i>=0;i--){
            int profit = bestSellingPrice - A[i];
            if(A[i] > bestSellingPrice){
                bestSellingPrice = A[i];
            }
            if(profit > max){
                day = i;
                max = profit;
            }
        }
        System.out.println(day+" ========= "+max);
        return max;
    }
}
