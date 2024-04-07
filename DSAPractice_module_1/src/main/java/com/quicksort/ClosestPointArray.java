package com.quicksort;

import java.util.Comparator;

public class ClosestPointArray {
    public static void main(String[] args) {

    }

    Comparator<int[]> comparator = new Comparator<int[]>() {
        @Override
        public int compare(int[] o1, int[] o2) {
            int x1 = o1[0];
            int x2 = o2[0];
            int y1 = o1[1];
            int y2 = o2[1];

            int d1 = (x1*x1) + (y1*y1);
            int d2 = (x2*x2) + (y2*y2);
            if(d1 < d2) return -1;
            else if (d1 > d2) return 1;
            else return 0;
        }
    };
}
