package POTD;

import java.util.Arrays;

public class SortBySetBitCount {
    static void sortBySetBitCount(Integer arr[], int n)
    {
        Arrays.sort(arr, (a, b)->{
            return (Integer.bitCount(b)-Integer.bitCount(a));
        });
    }
    static int setBits(Integer n)
    {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
