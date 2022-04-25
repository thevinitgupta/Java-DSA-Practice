package POTD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairsOfNonCoincidingPaths {
    static int numOfPairs(int[] x, int[] y, int n) {
        HashMap<Integer, Integer> xCount = new HashMap<>();
        HashMap<Integer, Integer> yCount = new HashMap<>();
        HashMap<ArrayList<Integer>, Integer> visited = new HashMap<>();
        int ans = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < n; ++i) {
            count1 += xCount.getOrDefault(x[i], 0);
            xCount.put(x[i], xCount.getOrDefault(x[i], 0) + 1);
        }

        for (int i = 0; i < n; ++i) {
            count2 += yCount.getOrDefault(y[i], 0);
            yCount.put(y[i], yCount.getOrDefault(y[i], 0) + 1);
        }

        for (int i = 0; i < n; ++i) {
            ArrayList<Integer> current = new ArrayList<>(Arrays.asList(x[i], y[i]));
            count3 += visited.getOrDefault(current, 0);
            visited.put(current, visited.getOrDefault(current, 0) + 1);
        }

        ans = count1 + count2 - 2 * count3;

        return ans;
    }
}
