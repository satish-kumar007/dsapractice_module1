package com.backtracking;

import java.util.ArrayList;

/*
[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3]
  [2, 3, 1]
  [3, 1, 2]
  [3, 2, 1] ]
 */
public class Permutation {
    private boolean[] marked;
    private ArrayList < ArrayList < Integer >> res;
    private ArrayList < Integer > A;
    private int n;
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        n = A.size();
        marked = new boolean[n];
        res = new ArrayList < > ();
        this.A = A;
        rec(0, new ArrayList < > ());
        return res;
    }
    public void rec(int idx, ArrayList< Integer > temp) {
        if (idx == n) {
            res.add(new ArrayList < > (temp));
            return;
        }
        // try all possible elements for the current position
        for (int i = 0; i < n; i++) {
            if (!marked[i]) {
                marked[i] = true;
                temp.add(A.get(i));
                rec(idx + 1, temp);
                marked[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
