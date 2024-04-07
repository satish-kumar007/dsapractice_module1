package com.hashing;

import java.util.HashMap;

public class FirstNonRepeatingElement {
    public void firstNonRepeating(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0;i<n;i++){
            char element = ch[i];
            if(freq.containsKey(element)){
                int count = freq.get(element);
                freq.put(element,count+1);
            }else{
                freq.put(element,1);
            }
        }
        System.out.println(freq);
        for(int i=0;i<n;i++){
            if(freq.get(ch[i]) == 1){
                System.out.print(ch[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        FirstNonRepeatingElement element = new FirstNonRepeatingElement();
        element.firstNonRepeating("geeksforgeeks");

    }
}
