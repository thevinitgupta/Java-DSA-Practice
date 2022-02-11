package POTD;

public class RemoveLeadingZeroesFromIPAddress {
    public String newIPAdd(String S)
    {
        S += ".";
        int n=0,prev = 0,c = 0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.') n++;
        }
        String [] s = new String[n];
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.') {
                StringBuilder curr = new StringBuilder(S.substring(prev,i));
                int j=0;
                while(j<curr.length()-1){
                    if(curr.charAt(j)!='0') break;
                    if(curr.charAt(j)=='0') {
                        curr.deleteCharAt(j);
                    }
                    else j++;
                }
                s[c] = curr.toString();
                c++;
                prev=i+1;
            }
        }
        String res = "";
        for(int i=0;i<n-1;i++){
            res += s[i]+".";
        }
        res += s[n-1];
        return res;
    }
}
