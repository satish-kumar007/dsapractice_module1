package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySum0 {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; // size of the given array.
        Map<Integer, Integer> map = new HashMap();
        int prefixSum = 0;
        int count = 0;
        map.put(0, 1); // Setting 0 in the map.

        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            prefixSum = prefixSum + arr[i];
            // Calculate x-k:
            int remove = prefixSum - k;
            System.out.print(remove+" ");

            //System.out.println(remove+" ======= "+(int)map.getOrDefault(remove, 0));

            // Add the number of subarrays to be removed:
            //Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
            count = count + (int)map.getOrDefault(remove, 0);

            // Update the count of prefix sum in the map.
            map.put(prefixSum, (int)(map.getOrDefault(prefixSum, 0) + 1));
        }
        System.out.println();
        System.out.println(map.getOrDefault(1, 0));
        System.out.println(map.getOrDefault(0, 0));
        System.out.println(map.getOrDefault(-2, 0));
        System.out.println(map.getOrDefault(0, 0));
        System.out.println();
        System.out.println(map);
        return count;
    }

    public static void main(String[] args) {
        int[] A = {1, -1, -2, 2};
        int k = 0;
        findAllSubarraysWithGivenSum(A,k);
    }
}
