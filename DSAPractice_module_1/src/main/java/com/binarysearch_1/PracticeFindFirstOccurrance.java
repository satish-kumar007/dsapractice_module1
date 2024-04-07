package com.binarysearch_1;

public class PracticeFindFirstOccurrance {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,6,6,7,8,9,10,10,10,13,15,16,16,16};
        System.out.println(findFirst(arr,16));
        System.out.println(findFirst(arr,6));
        System.out.println(findFirst(arr,9));

    }
    public static int findFirst(int[] arr, int k){
        int n = arr.length;
        int leftSide = 0;
        int rightSide = n-1;
        int index = 0;
        while(leftSide <= rightSide){
            int mid = (leftSide+rightSide)/2;
            if(arr[mid] == k){
                index = mid; // it is possible that middle element can be K,
                rightSide = mid - 1;//and also possible that it is not the first ocurrance, so we will search in the left side and discard the right space;
            }else if(arr[mid] < k){
                leftSide = mid+1;
            }else if(arr[mid] > k){
                rightSide = mid-1;
            }
        }
        return index;
    }
}
