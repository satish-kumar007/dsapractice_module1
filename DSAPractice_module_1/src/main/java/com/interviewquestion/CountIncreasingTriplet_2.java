package com.interviewquestion;
/*
You are given an array A of N elements. Find the number of triplets i,j and k such that i<j<k and A[i]<A[j]<A[k]
 */
public class CountIncreasingTriplet_2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3};
        int x = countTriplet(A);
        System.out.println(x);
    }
    public static int countTriplet(int[] A) {
        int n = A.length , ans = 0;
        for(int i = 0 ; i < n ; i++){
            int left = 0 , right = 0;
            for(int j = 0 ; j < i ; j++){
                if(A[j] < A[i]){
                    left++;
                }
            }
            for(int j = i + 1 ; j < n ; j++){
                if(A[i] < A[j]){
                   right++;
                }
            }
            ans += (left * right);
        }
        return ans;
    }
}
