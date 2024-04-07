package com.hashing2;

import java.util.HashMap;

public class CountPairsDifferenceK {
    public static void main(String[] args) {
        //int[] A = {3, 5, 1, 2,1,1,5,1,6,2};
        int[] A = {1,2,1,2};
        int B = 1;
        System.out.println(countDifferenceK(A,B));
    }
    public static int countDifferenceK(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<n;i++){
            int x = arr[i];
            int y = k+x;
            if(map.containsKey(y)){
                count = count + map.get(y);
            }
            map.put(x, map.getOrDefault(x,0)+1);
        }
        return count;
    }
}
