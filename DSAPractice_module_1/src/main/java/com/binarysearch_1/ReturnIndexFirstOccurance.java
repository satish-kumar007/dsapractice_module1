package com.binarysearch_1;

import java.util.Arrays;

public class ReturnIndexFirstOccurance {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,9,0,9,8,7,5,4,56};
        Arrays.sort(arr);//It needs to be sort - very very important
        System.out.println(firstIndex(arr,8));
        System.out.println(firstIndex(arr,7));
        System.out.println(firstIndex(arr,56));
        System.out.println(firstIndex(arr,80));
    }
    public static int firstIndex(int[] arr, int k){
        int n = arr.length;
        int low=0,high=n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                ans = mid;
                high = mid-1;
            }else if(arr[mid] < k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}
