package POTD;

public class CountTotalSetBits {

    //O(NlogN) solution -> Time Limit Exceeded
//    public static int countSetBits(int n){
//        // Your code here
//        int totCount = 0;
//        for(int i=1;i<=n;i++){
//            int dup = i,c=0;
//            while(dup>0){
//                c += dup & 1;
//                dup = dup >> 1;
//            }
//            totCount = totCount + c;
//        }
//        return totCount;
//    }

    public static int countSetBits(int n){
        //edge case for recursive termination
        if(n==0) return 0;
        int x = getMaxPowerOfTwo(n);
        int bitsTill2x = x * (1 << (x-1));
        int msb2toN = n - (1 << x) + 1;
        int rest = n - (1 << x);
        return bitsTill2x + msb2toN + countSetBits(rest);
    }
    public static int getMaxPowerOfTwo(int n){
        int x = 0;
        while((1 << x)<=n){
            x++;
        }
        return x-1;
    }

    public static void main(String[] args) {
        int countBits = countSetBits(17);
        System.out.println(countBits);
    }
}
