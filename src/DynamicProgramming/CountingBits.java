package DynamicProgramming;

public class CountingBits {
    public int[] countBits(int n) {
        int [] bits = new int[n+1];
        for(int i=1;i<n+1;i++){
            if(i%2!=0) {
                bits[i] = 1+bits[i/2];
            }
            else bits[i] = bits[i/2];
        }
        return bits;
    }
}
