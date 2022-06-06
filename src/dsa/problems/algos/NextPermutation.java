package dsa.problems.algos;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) {

        // Find the turning point from right
        // It's the point where a[i] > a[i-1]
        int i = permutation.size() - 1;
        for (; i > 0; i--) {
            if (permutation.get(i) > permutation.get(i-1)) break;
        }
        // If i==0, this is the last permutation
        if (i == 0) {
            Collections.reverse(permutation);
            return new ArrayList<>(permutation);
        }

        // Find the number greater than a[i-1] from the end
        // and swap turning point with that number
        for (int j = permutation.size() - 1; j >= i; j--) {
            if (permutation.get(j) > permutation.get(i-1)) {
                swap(permutation, j, i-1);
                break;
            }
        }
        // Reverse the permutation from i to end
        reverse(permutation, i, permutation.size()-1);

        return permutation;
    }

    static void reverse(ArrayList<Integer> permutation, int start, int end) {
        while (start < end) {
            swap(permutation, start, end);
            start++;
            end--;
        }
    }

    static void swap(ArrayList<Integer> permutation, int i, int j) {
        int temp = permutation.get(i);
        permutation.set(i, permutation.get(j));
        permutation.set(j, temp);
    }

}
