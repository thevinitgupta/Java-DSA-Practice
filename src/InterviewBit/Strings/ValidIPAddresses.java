package InterviewBit.Strings;

import java.util.ArrayList;

public class ValidIPAddresses {
    public ArrayList<String> restoreIpAddresses(String A) {
        ArrayList<String> ips = new ArrayList<>();
        generate(A,ips,4,"",A.length());
        return ips;
    }
    public static void generate(String s, ArrayList<String> ips, int len, String prev, int n){
        if(len==0) {
            if(prev.length()==(n+3)){
                ips.add(prev);
            }
            return;
        }
        String curr = "";
        for(int i=0;i<s.length();i++){
            curr += s.charAt(i);
            int c = Integer.parseInt(curr);
            if(curr.length()!=(c+"").length()) continue;
            if(curr.charAt(0)==0){
                if(prev.length()==0) generate(s.substring(i+1),ips,len-1,"0",n);
                else generate(s.substring(i+1),ips,len-1,(prev+"."+0),n);
            }
            // System.out.println(c);
            else if(c<=255) {
                if(prev.length()==0) generate(s.substring(i+1),ips,len-1,curr,n);
                else generate(s.substring(i+1),ips,len-1,(prev+"."+curr),n);
            }
            else break;
        }
        return;
    }
}
