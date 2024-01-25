package com.interviewquestion;

import java.util.Arrays;
import java.util.List;

public class MajorityElement_3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 1, 2); //2 is majority
        int maj = majorityElement(list);
        System.out.println(maj);
    }
    public static int majorityElement(final List<Integer> A) {
        if (A == null)
            return -1;
        int maj = A.get(0);
        int count = 1;
        int n = A.size();
        for (int i = 1; i < n; i++) {
            if (A.get(i) == maj) {
                count++;
            } else if (count == 1) {
                maj = A.get(i);
            } else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (A.get(i) == maj)
                count++;
        }
        if (count > n / 2)
            return maj;
        return -1;
    }
}
