package com.countsort;

public class MergeSortedSubArrayString {
    public static void main(String[] args) {
        String str= "cbaab";
        char[] arr = str.toCharArray();
        int s=0;
        int e=4;
        int m=2;
        int ans[] = mergeSortedSubArray(arr,s,m,e);
        char[] ch = new char[ans.length];
        for(int i = 0;i<ch.length;i++){
            ch[i] = (char)ans[i];
        }
        String sorted = String.valueOf(ch);
        System.out.println(sorted);

        if(sorted.contains("abc")){
            System.out.println(true);
        }
    }
    public static int[] mergeSortedSubArray(char[] arr, int s, int m, int e){
        int[] ans = new int[e-s+1];
        int p1=s; int p2 = m+1; int k=0;
        while(p1<=m && p2<=e){
            if(arr[p1] < arr[p2]){
                ans[k] = arr[p1];
                p1++;
                k++;
            }else{
                ans[k] = arr[p2];
                p2++;
                k++;
            }
        }
        while(p1<=m){
            ans[k] = arr[p1];
            p1++;
            k++;
        }
        while(p2<=e){
            ans[k] = arr[p2];
            p2++;
            k++;
        }
        return ans;
    }
}
