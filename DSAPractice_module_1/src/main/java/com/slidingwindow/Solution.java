package com.slidingwindow;

public class Solution {
    public static void main(String[] args) {
        int[] A = {1,5,20,33,3,42,8,12,13,46,26,22,30,20,26,18,40,45,21,33,32,34,3,45,25,41,35,42,0};
        int B = 3;
        int C = 11;
        int x = solve(A,B,C);
        System.out.println(x);
    }
    public static int solve(int[] A, int B, int C) {
        int n = A.length;
        int ans=0;
        double sum=0;
        double average = 0;
        for(int i=0;i<B;i++){
            sum = sum+A[i];
        }
        int s=1;
        int e=B;
        while(e<n){
            sum = sum - A[s-1]+A[e];
            average = sum/B;
            int av = (int)Math.floor(average);
            System.out.println(sum+" ======== "+average+" ======= "+(int)Math.floor(average));
            if(av <= C){
                ans=1;
                break;
            }else{
                ans=0;
            }
            s++;
            e++;
        }
        return ans;
    }
}