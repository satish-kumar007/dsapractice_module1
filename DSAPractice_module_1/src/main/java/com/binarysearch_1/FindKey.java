package com.binarysearch_1;

import java.util.Collections;

public class FindKey {
    public static void main(String[] args) {
        key("cbaab");
    }
    public int solve(String A, String B) {
        key("cbaab");
        int ans=0;
//        if(A.contains(B)){
//            ans=1;
//        }
       return ans;

    }
    public static String key(String str){
        int n = str.length();
        int[] frequency = new int[26];
        char[] ch = str.toCharArray();
        for(int i=0;i<n;i++){
            int val = ch[i];
            frequency[val]++;
        }
        for(Integer i :  frequency){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<26;i++){
            int count = frequency[i];
            for(int j=1;j<=count;j++){
                System.out.print((char)i+" ");
            }
        }
        return null;
    }
}
