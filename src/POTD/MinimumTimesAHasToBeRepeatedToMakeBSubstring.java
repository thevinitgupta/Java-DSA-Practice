package POTD;

public class MinimumTimesAHasToBeRepeatedToMakeBSubstring {
    static int minRepeats(String A, String B) {
        int div = B.length()/A.length(), count = 0;
        if(div<=0) div = 1;
        String rep = "";
        while(count<div){
            rep += A;
            count++;
        }
        int wind = B.length();
        for(int i=0;i<(rep.length()-wind)+1;i++){
            if(rep.substring(i,i+wind).equals(B)) return div;
        }
        rep += A;
        div++;
        for(int i=0;i<rep.length()-wind;i++){
            if(rep.substring(i,i+wind).equals(B)) return div;
        }
        return -1;
    }
}
