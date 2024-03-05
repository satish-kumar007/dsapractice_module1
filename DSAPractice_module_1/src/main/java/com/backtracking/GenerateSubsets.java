package com.backtracking;
import java.util.ArrayList;
/*
[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]
 */
public class GenerateSubsets {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(A, ans, temp, 0);
        return ans;
    }

    private void backtrack(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> temp, int index) {
        if (index == A.size()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        backtrack(A, ans, temp, index + 1);
        temp.add(A.get(index));
        backtrack(A, ans, temp, index + 1);
        temp.remove(temp.size() - 1);
    }
}
