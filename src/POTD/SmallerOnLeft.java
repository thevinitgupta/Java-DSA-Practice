package POTD;

import java.util.Arrays;
import java.util.TreeSet;

public class SmallerOnLeft {
    public static int[] Smallestonleft (int arr[], int n) {
        if (n == 1) {
            return new int []{-1};
        }
        int [] result = new int [n];
        Arrays.fill(result, -1);
        TreeSet<Integer> sortedSetValues = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            Integer smallerValue = sortedSetValues.lower(arr[i]);
            if (smallerValue != null) {
                result[i] = smallerValue;
            }
            sortedSetValues.add(arr[i]);
        }
        return result;
    }
}
