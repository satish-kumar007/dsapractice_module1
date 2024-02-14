package com.bitmanipulation_2;

public class DistinctThriceElementNumber_2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,4,5,6,6,6,2,3,4,5,7};
        int n = arr.length;
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if((arr[j] & (1 << i)) > 0 ){
                    count++;
                }
            }
            if(count % 3 == 1){
                ans = ans | (1 << i);
            }
        }
        System.out.println(ans);
    }
}
