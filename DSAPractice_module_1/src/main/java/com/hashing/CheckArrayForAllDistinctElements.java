package com.hashing;

import java.util.HashSet;

public class CheckArrayForAllDistinctElements {
    //here the logic will be based on length
    public static boolean isAllDistinct(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        }
        System.out.println(set.size()+" == "+n);
        if(set.size() == n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAllDistinct("LoveLy"));
        System.out.println(isAllDistinct("Rajo"));
        System.out.println(isAllDistinct("Vishu"));

    }
}
