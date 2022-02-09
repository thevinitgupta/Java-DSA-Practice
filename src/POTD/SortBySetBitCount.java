package POTD;

import java.util.Arrays;

public class SortBySetBitCount {
    static void sortBySetBitCount(Integer arr[], int n)
    {
        Arrays.sort(arr, (a, b)->{
            return (Integer.bitCount(b)-Integer.bitCount(a));
        });
    }
}
