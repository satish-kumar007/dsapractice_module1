package com.binarysearch_1;

public class SearchKSortedArray {
    //TC-> O(LogN)
    //SC-> O(1)
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,78};
        System.out.println(findK(arr,7));
        System.out.println(findK(arr,70));
        System.out.println(findK(arr,-7));
        System.out.println(findK(arr,9));
    }
    public static boolean findK(int[] arr, int k){
        int n = arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] == k){
                return true;
            }else if(arr[mid] < k){
                //search in the right;
                l = mid+1;
            }else{
                //search in the left
                h = mid-1;
            }
        }
        return false;
    }
}
