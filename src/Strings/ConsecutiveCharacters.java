package Strings;

public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int i=0,j=1,n=s.length();
        if(n==1) return 1;
        int pow = 1,curr=1;
        while(j<n){
            char left = s.charAt(i);
            while(j<n && s.charAt(j)==left){
                //System.out.println(s.charAt(j));
                j++;
                curr++;
                //System.out.println(curr);
            }
            if(curr>pow) pow = curr;
            curr=1;
            i=j;
            j=i+1;
        }
        return pow;
    }
}
