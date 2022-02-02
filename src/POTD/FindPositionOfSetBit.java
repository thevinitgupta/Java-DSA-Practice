package POTD;

public class FindPositionOfSetBit {
    static boolean isPowerOfTwo(int n)
    {
        return (n > 0 && ((n & (n - 1)) == 0)) ? true : false;
    }
    static int findPosition(int n) {
        // code here
        if (!isPowerOfTwo(n))
            return -1;
        int i = 1, pos = 1;
        while ((i & n) == 0) {
            i = i << 1;
            ++pos;
        }
        return pos;
    }
}
