package com.binarysearch_1;
/*
Given an integer A representing the number of square blocks. The height of each square block is 1. The task is to create a staircase of max-height using these blocks.

The first stair would require only one block, and the second stair would require two blocks, and so on.

Find and return the maximum height of the staircase.
 */
public class AssignmentMaximumHeightStaircase {
    public static void main(String[] args) {
        System.out.println(numOfStairsBruteForce(10));
        System.out.println(numOfStairsOptimal(92761));
    }
    public static int numOfStairsBruteForce(int A){
        int ans=0;
        for(int i=1;i<A;i++){
            int height = i;
            if((height*(height+1)/2) <= A)
                ans = i;
        }
        return ans;
    }
    public static int numOfStairsOptimal(int A){
        int ans = 0;
        int left=0;
        int right=1000*1000*1000;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            if((long)mid*(mid+1)/2 > A){
                right = mid-1;
            }else{
                ans = mid;
                left = mid+1;
            }
        }
        return ans;
    }
}
