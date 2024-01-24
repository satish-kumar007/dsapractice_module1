package com.carryforward;

public class CountAGPairsArrayRightToLeft_1 {
    public static void main(String[] args) {
        String A = "ABCGAG";
        char[] ch = A.toCharArray();
        int x = countPairs(ch);
        System.out.println(x);
    }
    public static int countPairs(char []arr){
        int count = 0;
        int n = arr.length;
        System.out.println(n);
        int cg=0;
        int pair = 0;
        for(int i=n-1;i>=0;i--){
            if(arr[i] == 'G'){
                cg++;
            }else if(arr[i]=='A'){
                pair = pair+cg;
            }
            System.out.println(cg+" ====================== "+pair);
        }
        //count=pair;
        return pair;
    }
}
