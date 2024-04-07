package com.binarysearch_2;

public class SqrtUsingBinarySearch {
    public static void main(String[] args) {
        System.out.println(sqrt(50));
    }
    public static int sqrt(int N){
        int left = 1;
        int right = N;
        int result = 0;
        while(left < right){
            int mid = (left+right)/2;
            if((mid*mid) == N){
                return N;
            }else if(mid*mid < N){
                left = mid + 1;//discard left space
                result = mid;
            }else{
                right = mid - 1;//discard right space
            }
        }
        return result;
    }
}
