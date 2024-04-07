package com.binarysearch_1;

public class PracticeFindLastOccurance {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,6,6,7,8,9,10,10,10,13,15,16,16,16};
        System.out.println(findLast(arr,16));
        System.out.println(findLast(arr,6));
        System.out.println(findLast(arr,9));
    }
    public static int findLast(int[] arr, int k){
        int n = arr.length;
        int leftSide=0;
        int rightSide=n-1;
        int lastIndex=0;
        while(leftSide <= rightSide){
            int mid = (leftSide+rightSide)/2;
            if(arr[mid] == k){
                lastIndex = mid;
                leftSide = mid+1;
            }else if(arr[mid] < k){
                leftSide = mid+1;
            }else if(arr[mid] > k){
                rightSide = mid -1;
            }
        }
        return lastIndex;
    }
}
