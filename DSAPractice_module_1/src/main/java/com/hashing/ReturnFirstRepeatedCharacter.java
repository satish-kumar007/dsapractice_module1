package com.hashing;

import java.util.HashSet;

public class ReturnFirstRepeatedCharacter {
    public char firstRepeated(String str){
        char[] ch = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<ch.length;i++){
            char element = ch[i];
            if(set.contains(element))
                return element;
            else
                set.add(element);
        }
        return ' ';
    }

    public static void main(String[] args) {
        ReturnFirstRepeatedCharacter repeatedCharacter = new ReturnFirstRepeatedCharacter();
        char c = repeatedCharacter.firstRepeated("thisisjohn");
        System.out.println(c);
    }
    //but, What if I need 2nd, 3rd, .....kth repeated characters? KthRepeatedCharacters.java
}
