package com.binarysearch_1;

public class PracticeSearchForK {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,9,28}; // it need to be sorted - very very important - I forgot to sort
        System.out.println(searchForK(arr,5));
        System.out.println(searchForK(arr,30));
        System.out.println(searchForK(arr,1));
        System.out.println(searchForK(arr,0));
    }
    public static boolean searchForK(int[] arr, int k){
        int n = arr.length;
        int leftSide=0;
        int rightSide = n-1;
        while(leftSide <= rightSide){
            int mid = (leftSide+rightSide)/2;
            if(arr[mid] == k)
                return true;
            else if(arr[mid] < k)
                leftSide = mid+1;
            else
                rightSide = mid-1;
        }
        return false;
    }
}
