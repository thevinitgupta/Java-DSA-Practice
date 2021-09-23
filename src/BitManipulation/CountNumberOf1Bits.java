package BitManipulation;

public class CountNumberOf1Bits {
    static int setBits(int n) {
        // code
        // 10110001
        // 11111111
        // 01001110
        int c = 0;
        while(n>0){
            c += n & 1;
            n = n >> 1;
        }
        return c;
    }

    public static void main(String[] args) {
        int bits1 = setBits(8);
        System.out.println(bits1);
    }
}
