package com.interview;

public class BinaryArrayMaxOnesReplacing {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1,1,0,0,1};
        System.out.println(maxOnes(arr));
    }
    public static int maxOnes(int[] arr){
        int n = arr.length;
        int count = 0;
        int maxOnes = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                count++;
            }
        }
        if(count == 0) return 1;
        if(count == n) return n;

        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                //count left side 1's
                int leftSideOnes = 0;
                for(int j = i-1;j>=0;j--){
                    if(arr[j] == 1){ // I fogot here, it will be arr[j] not arr[i]
                        leftSideOnes++;
                    }else{
                        break;
                    }
                }
                //count right side 1's
                int rightSideOnes = 0;
                for(int j=i+1;j<n;j++){
                    if(arr[j] == 1){// I fogot here, it will be arr[j] not arr[i]
                        rightSideOnes++;
                    }else{
                        break;
                    }
                }
                maxOnes = Math.max(maxOnes, (rightSideOnes+leftSideOnes+1));
            }
        }
        return maxOnes;
    }
}
