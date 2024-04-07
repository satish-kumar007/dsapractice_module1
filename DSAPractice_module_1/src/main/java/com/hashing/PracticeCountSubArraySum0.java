package com.hashing;

import java.util.HashMap;

public class PracticeCountSubArraySum0 {
    public static void main(String[] args) {
        int[] arr = {1,-1,-2,2};
        System.out.println(countSubArraySum0(arr,0));
        int[] A = {-1, 2, -1};
        System.out.println(countSubArraySum0(A,0));
    }

    public static int countSubArraySum0(int[] arr, int k){
        int n = arr.length;
        int[] psum = getPrefixSum(arr);
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);//0 key, 1 value
        for(int i=0;i<n;i++){
            int remove = psum[i] - k;

            // Add the number of subarrays to be removed:
            //Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
            count = count + (int)map.getOrDefault(remove, 0);

            // Update the count of prefix sum in the map.
            map.put(psum[i], (int)(map.getOrDefault(psum[i], 0) + 1));
        }
        return count;
    }
    public static int[] getPrefixSum(int[] arr){
        int n = arr.length;
        int[] psum = new int[n];
        psum[0] = arr[0];
        for(int i=1;i<n;i++){
            psum[i] = psum[i-1] + arr[i];
        }
        return psum;
    }
}
