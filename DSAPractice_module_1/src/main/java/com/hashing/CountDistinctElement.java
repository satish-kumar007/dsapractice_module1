package com.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class CountDistinctElement {
    public static int countDistinct(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        int count=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(ch[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(countDistinct("35654"));//4
        System.out.println(countDistinct("333"));//1
        System.out.println(countDistinct("11122"));//2
    }
}
