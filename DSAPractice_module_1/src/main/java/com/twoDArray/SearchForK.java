package com.twoDArray;

public class SearchForK {
    public static void main(String[] args) {
        int[][] arr = {{3,4,5,6},{7,8,9,10},{11,13,14,15},{10,20,30,40}};
        int k=20;
        System.out.println(searchK(arr,k));
        System.out.println(searchK(arr,12));
        System.out.println(searchK(arr,28));
        System.out.println(searchK(arr,11));
    }
    public static boolean searchK(int[][] arr, int k){
        int n = arr.length;
        int m = arr[0].length;
        int i=0;
        int j = m-1;
        while(i<n && j>=0){
            if(arr[i][j] > k){
                j--;
            }else if(arr[i][j] < k){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
}
