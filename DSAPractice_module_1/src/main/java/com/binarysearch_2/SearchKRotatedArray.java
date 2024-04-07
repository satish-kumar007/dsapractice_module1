package com.binarysearch_2;

public class SearchKRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,11,12,13,14,15,1,2,3,4};//array rotated 4 times
        int k = 14;
        int minIndex = FindMinBinarySearch.returnMin(arr);
        System.out.println(minIndex);
        int ans = returnElementIndexBinarySearch(arr,0,minIndex-1,k);
        if(ans == -1){
            ans = returnElementIndexBinarySearch(arr,minIndex,arr.length-1, k);
        }
        System.out.println("Index position of :: "+k+" ::  is :: "+ans);
    }
    public static int returnElementIndexBinarySearch(int[] arr, int left, int right, int k){
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
