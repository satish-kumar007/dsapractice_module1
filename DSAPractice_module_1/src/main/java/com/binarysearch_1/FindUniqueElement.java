package com.binarysearch_1;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8,9,9};
        System.out.println(returnUniqueElement(arr));
    }
    public static int returnUniqueElement(int[] arr){
        int n = arr.length;
        if(n==0) return 0;
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int leftSide = 1;// it will initial from 1 because we have already used 0 at line 10
        int rightSide = n-2;// it will initial from n-2 because we have already used n-1 at line 11

        while(leftSide <= rightSide){
            int mid = (leftSide+rightSide)/2;
            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }else if(arr[mid] == arr[mid]-1){
                mid = mid-1; // moving mid to the first occurrence of duplicate
            }
            if(mid % 2 == 0){
                leftSide = mid+2;
            }else{
                rightSide = mid-1;
            }
        }
        return -1;
    }
}
