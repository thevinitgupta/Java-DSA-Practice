package BitManipulation;

public class LargestCombinationOfBitwiseANDGreaterThanZero {
    public int largestCombination(int[] candidates) {
        int [] bits = new int[32];
        for(int i=0;i<32;i++){
            for(int candi : candidates){
                if(((candi>>i)&1) == 1) bits[i]++;
            }
        }
        int max = 0;
        for(int bit : bits){
            max = Math.max(bit, max);
        }
        return max;
    }
}
