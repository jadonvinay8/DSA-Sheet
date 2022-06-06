package dsa.problems.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PascalTriangle {

    public static ArrayList<ArrayList<Long>> printPascal(int n) {

        ArrayList<ArrayList<Long>> result = new ArrayList<>(n);
        result.add(new ArrayList<>(Collections.singletonList(1L)));

        if (n == 1) return result;
        result.add(new ArrayList<>(Arrays.asList(1L, 1L)));
        if (n == 2) return result;

        for (int i=3; i <= n; i++) {
            ArrayList<Long> thisRow = new ArrayList<>();
            thisRow.add(1L);
            ArrayList<Long> prevRow = result.get(i-2);
            for (int j=0; j < prevRow.size() - 1; j++) {
                thisRow.add(prevRow.get(j) + prevRow.get(j+1));
            }
            thisRow.add(1L);
            result.add(thisRow);
        }
        return result;
    }

}
