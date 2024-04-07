package com.hashing;

import java.util.HashMap;

public class CountFrquencyOfElements {
    public void countFreq(int[] arr, int[] Q){
        int n = arr.length;
        int m = Q.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            int element = arr[i];
            if(freq.containsKey(element)){
                int x = freq.get(element);
                freq.put(element,x+1);
            }else{
                freq.put(element,1);
            }
        }
        for(int i=0;i<m;i++){
            int element = Q[i];
            if(freq.containsKey(element)){
                System.out.println(element+ " == "+freq.get(element));
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,1,7,6,5,4,3,2,17,8,9,11,12,2,1};
        int[] Q = {2,6,8,7,1};
        CountFrquencyOfElements count = new CountFrquencyOfElements();
        count.countFreq(arr,Q);
    }
}
