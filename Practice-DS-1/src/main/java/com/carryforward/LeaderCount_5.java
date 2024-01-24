package com.carryforward;

public class LeaderCount_5 {
    public static void main(String[] args) {
        int []ar = {16, 17, 4, 3, 5, 2};
        int count1 = countLeaderLeftToRight(ar);
        int count2 = countLeaderRightToLeft(ar);
        System.out.println(count1+" ==================== "+count2);
    }
    public static int countLeaderLeftToRight(int[] arr){
        int n = arr.length;
        int countLeader = 1;
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
                countLeader++;
            }
        }
        return countLeader;
    }

    public static int countLeaderRightToLeft(int[] arr){
        int n = arr.length;
        int max = arr[n-1];
        int countLeader = 1;
        for(int i=n-2;i>=0;i--){
            if(arr[i] > max){
                max = arr[i];
                countLeader++;
            }
        }
        return countLeader;
    }
}
