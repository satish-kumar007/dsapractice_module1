package com.binarysearch_3;

public class PinterAndBoards_1 {
    public static void main(String[] args) {
        int[] x = {185,186,938,558,655,461,441,234,902,681};
        int t=10;
        int time=30895;
        int painters = getPainters(x,t,time);
        System.out.println(painters);
    }
    public static int getPainters(int[] arr, long t, long x) {
        int n = arr.length;
        int painter=1;
        long timeLeft = x;
        for(int i=0;i<n;i++){
            if((arr[i]*t) > x) return -1;
            if((arr[i]*t) <= timeLeft){
                timeLeft = timeLeft - (arr[i]*t);
            }else{
                painter++;
                timeLeft = x - (arr[i]*t);
            }
        }
        return painter;
    }
}
