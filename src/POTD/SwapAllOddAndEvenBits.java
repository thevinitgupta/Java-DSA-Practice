package POTD;

public class SwapAllOddAndEvenBits {
    public static int swapBits(int n)
    {
        // Your code
        int even = n & 0x55555555;
        even = even <<1;
        int odd = n & 0xAAAAAAAA;
        odd = odd >> 1;
        return (even | odd);

    }
    public static void main(String[] args) {
        int swapped = swapBits(23);
        System.out.println(swapped);
    }
}
