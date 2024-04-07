package com.binarysearch_2;

public class FindMinBinarySearch {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,1,2,3,4,5};
        System.out.println(returnMin(arr));
    }
    public static int returnMin(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            int mid = (left+right)/2;
            if(arr[mid] < arr[right]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        System.out.println(arr[left]);
        return left;
    }
}
