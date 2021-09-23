package POTD;

public class CountTotalSetBits {

    //O(NlogN) solution -> Time Limit Exceeded
    public static int countSetBits(int n){
        // Your code here
        int totCount = 0;
        for(int i=1;i<=n;i++){
            int dup = i,c=0;
            while(dup>0){
                c += dup & 1;
                dup = dup >> 1;
            }
            totCount = totCount + c;
        }
        return totCount;
    }
}
