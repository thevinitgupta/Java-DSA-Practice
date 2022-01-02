package POTD;

public class KthSmallestFactor {
    static int kThSmallestFactor(int N , int k) {
        // code here
        int i=1;
        while(i<=N && k>=1){
            if(N%i==0){
                //System.out.println(i+", "+k);
                if(k==1) return i;
                else k--;
            }
            i++;
        }
        return -1;
    }
}
