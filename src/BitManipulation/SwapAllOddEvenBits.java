package BitManipulation;

public class SwapAllOddEvenBits {
    public static int swapBits(int n)
    {
        //the first step is to use masking to change or remove all even placed bits by 0
        //this is done using Hexa decimal value A, whose Binary value is 1010 and 5 whose decimal is

        //
        int ls = 0x55555555 & n;
        ls = ls << 1;
        int rs = 0xAAAAAAAA & n;
        rs = rs >> 1;
        return ls|rs;
    }

    public static void main(String[] args) {
        int swapped = swapBits(1);
        System.out.println(swapped);
    }
}
