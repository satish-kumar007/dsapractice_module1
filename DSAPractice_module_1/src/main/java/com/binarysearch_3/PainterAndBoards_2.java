package com.binarysearch_3;

public class PainterAndBoards_2 {
    public static void main(String[] args) {
        int A = 1;
        int B = 1000000;
        int[] C = {1000000,1000000};
        int x = paint(A,B,C);
        System.out.println(x);
    }
    public static int paint(int A, int B, int[] C) {
        int n = C.length;
        long maxElement = getMaxElement(C);
        long sumOfAll = getSumOfAll(C);
        System.out.println(maxElement+ " ======= "+sumOfAll);

        long l = maxElement * B;
        long h = sumOfAll * B;

        long ans = -1;
        while(l <= h){
            long mid = (l+h)/2;
            int painters = PinterAndBoards_1.getPainters(C,B,mid);

            if(painters <= A){
                ans = mid;
                h = mid-1;
            }else if(painters > A){
                l = mid+1;
            }
            System.out.println((ans % 10000003)+" ======= "+painters+" ==== "+mid );
        }
        return (int)(ans % 10000003);
    }

    private static int getMaxElement(int[] c) {
        int n = c.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(c[i] > max){
                max=c[i];
            }
        }
        return max;
    }

    private static int getSumOfAll(int[] c) {
        int n = c.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum+c[i];
        }
        return sum;
    }
}
