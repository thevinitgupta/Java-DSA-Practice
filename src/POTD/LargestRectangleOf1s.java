package POTD;

import java.util.Arrays;
import java.util.Comparator;

public class LargestRectangleOf1s {
    int maxArea(boolean[][] mat, int r, int c) {
        // code here
        int[][] cols = new int[c][r];
        for (int col = 0; col < c; col++) {
            for (int row = 0; row < r; row++) {
                if (mat[row][col]) {
                    cols[col][row] = row == 0 ? 1 : cols[col][row - 1] + 1;
                }
                else {
                    cols[col][row] = 0;
                }
            }
        }
        int ans = 0;
        for (int row = 0; row < r; row++) {
            final int theRow = row;
            Comparator<int[]> compare =
                    (int[] c1, int[] c2) -> c2[theRow] - c1[theRow];
            Arrays.sort(cols, compare);
            for (int col = 0; col < c; col++) {
                ans = Math.max(ans, cols[col][row] * (col + 1));
            }
        }
        return ans;
    }
}
