package BitManipulation;

public class MinimumBitFlipsToConvertANumber {
    public int minBitFlips(int start, int goal) {
        //this gives the different bits b/w start and goal as 1
        int xor= start ^ goal;
        int count=0;
        while(xor>0){

            //xor-1 => removes the last set bit from the number
            xor = xor & (xor-1);
            count++;
        }
        return count;
    }
}
