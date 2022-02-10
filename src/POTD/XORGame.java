package POTD;

public class XORGame {
    static int xorCal(int k){
        if(k == 1)
            return 2;
        if((k & (k+1)) == 0)
            return k/2;
        return -1;
    }
}
