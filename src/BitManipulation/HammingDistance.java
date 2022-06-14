package BitManipulation;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int count = 0;
        while(xor!=0){
            xor &= xor-1;
            count++;
        }
        return count;
    }
    public int hammingDistanceOld(int x, int y) {
        int z = x^y;
        int count = 0;
        while(z>0){
            if(z%2==1) count++;
            z = z/2;
        }
        return count;
    }

}
