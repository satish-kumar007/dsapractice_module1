package com.binarysearch_1;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {3,8,9,6};
        int[] arr1 = {10,4,3};
        int[] arr2 = {3,6,9};

        System.out.println(findPeek(arr));
        System.out.println(findPeek(arr1));
        System.out.println(findPeek(arr2));
    }
    public static int findPeek(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        if(arr[0] > arr[1]) return arr[0];
        if(arr[n-1] > arr[n-2]) return arr[n-1];
        int leftSide = 1;
        int rightSide = n-2;
        while(leftSide <= rightSide){
            int mid = (leftSide+rightSide)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return arr[mid];
            }else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                leftSide = mid+1;
            }else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]){
                rightSide = mid-1;
            }
        }
        return 0;
    }
}
