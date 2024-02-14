package com.twopointer;

public class ContainerWithMaxWater_7 {
    public int maxArea(int[] A) {
        int n = A.length;
        int maxContainer=0;
        int left = 0;
        int right  = n-1;
        while(left < right){
            int container = (right - left) * Math.min(A[left], A[right]);
            if(maxContainer < container){
                maxContainer = container;
            }
            if(A[left] < A[right]) left++;
            else right--;
        }
        return maxContainer;
    }
}
