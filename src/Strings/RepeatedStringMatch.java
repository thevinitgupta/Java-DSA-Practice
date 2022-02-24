package Strings;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {
        if(b.length()==0) return 0;
        int count = 1,first=0,k = b.length()/a.length()+1;
        String str = a;
        while(k>=0){
            for(int i=0;i<=str.length()-b.length();i++){
                if(str.substring(i,i+b.length()).equals(b)) return count;
            }
            str += a;
            count++;
            k--;
        }
        return -1;
    }
}
