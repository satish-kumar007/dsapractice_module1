package com.twoDArray;

public class MaxOneIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{0,0,1,1},{0,1,1,1},{0,0,0,1,},{1,1,1,1}};
        System.out.println(maxOnesMatrix(arr));
    }
    public static int maxOnesMatrix(int[][] arr){
        int n = arr.length;
        int i=0;
        int j = n-1;
        int ans = 0;
        while(i<n && j>=0){
            while(j >= 0 && arr[i][j] == 1){
                j--;
                ans = i;
            }
            i++;
        }

        return ans;
    }
}
