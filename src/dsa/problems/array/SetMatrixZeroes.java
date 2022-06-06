package dsa.problems.array;

public class SetMatrixZeroes {

    public static void setZeros(int[][] matrix) {

        // Take 2 arrays, row[] amd col[] of size rows and cols
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        // if encounter 0 at i, j => make row[i] and col[j] = -1
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }

        // iterate again and set mat[i][j] = 0 if row[i] or col[j] = -1
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                if (row[i] == -1 || col[j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}