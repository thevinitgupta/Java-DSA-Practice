package POTD;

public class OnesComplement {
    static String onesComplement(String S,int N){
        //code here
        StringBuilder s = new StringBuilder();
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='1') s.append('0');
            else s.append('1');
        }
        return s.toString();
    }
}
