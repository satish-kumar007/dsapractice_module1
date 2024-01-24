package com.carryforward;

public class CountAGPairsArrayLeftToRight_2 {
    public static void main(String[] args) {
        String A = "ABCGAG";
        char[] ch = A.toCharArray();
        int x = countPairs(ch);
        System.out.println(x);
    }
    public static int countPairs(char[] ch){
        //This is from left tot right direction, and we will start calculating 'a'.
        int n = ch.length;
        int ca=0;
        int pair=0;
        for(int i=0;i<n;i++){
            if(ch[i] == 'A'){
                ca++;
            }else if(ch[i] == 'G'){
                pair = pair+ca;
            }
        }
        return pair;
    }
}
