package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class ReturnSecondNonRepeating {
    //Instead of break the loop with first iteration we will continue to end.
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
        ArrayList<Character> characters = new ArrayList<>();//Create new Arraylist to hold unique elements
        System.out.println(freq);
        for(int i=0;i<n;i++){
            if(freq.get(ch[i]) == 1){
                characters.add(ch[i]);//store them into arrayList
                //break;//here is the change, we don't require break here.
            }
        }
        for(int i=0;i<characters.size();i++){//iterate over arrayList
            System.out.println(characters.get(i));//get the elements based on i
        }
    }

    public static void main(String[] args) {
        ReturnSecondNonRepeating word = new ReturnSecondNonRepeating();
        word.firstNonRepeating("geeksforgeeks");
    }
}
