package com.sortingbasic;

import java.util.ArrayList;
import java.util.Collections;

public class NobleInteger_4 {
    public static void main(String[] args) {
        ArrayList<Integer>  A = new ArrayList<>();
        A.add(3);A.add(2);A.add(1);A.add(3);
        int x = solve(A);
        System.out.println(x);
    }
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        int element = 0;
        for(int i = 0; i < n; i++){
            int s = i+1;
            int e = n-1;
            while(s<n && A.get(i)==A.get(i+1)){
                i++;
            }
            if(A.get(i) == e-i){
               element = A.get(i);
                System.out.println(element);
               return 1;
            }
        }
        return -1;
    }
}
