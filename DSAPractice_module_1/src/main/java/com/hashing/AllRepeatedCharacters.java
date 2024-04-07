package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AllRepeatedCharacters {
    public void kthRepeat(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        //HashMap<Character, Integer> map = new HashMap<>();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            char element = ch[i];
            if(map.containsKey(element)){
                int freq = map.get(element);
                map.put(element,freq+1);
            }else{
                map.put(element,1);
            }
        }
        System.out.println(map);
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(map.get(ch[i]) > 1){
                list.add(ch[i]);
            }
        }
        List<Character> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        AllRepeatedCharacters characters = new AllRepeatedCharacters();
        characters.kthRepeat("geeksforgeeks");
    }
}
