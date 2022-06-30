package InterviewBit.Strings;

import java.util.HashMap;

public class VowelsAndConsonantSubstrings {
    public int solve(String A) {
        int len = A.length(), count=0;
        int [] vc = new int[len];
        int [] cc = new int[len];
        HashMap<Character, Boolean> vMap = new HashMap<>();
        vMap.put('a',true);
        vMap.put('e',true);
        vMap.put('i',true);
        vMap.put('o',true);
        vMap.put('u',true);

        if(vMap.containsKey(A.charAt(len-1))){
            vc[len-1]=1;
        }
        else {
            cc[len-1]=1;
        }

        for(int i=len-2;i>=0;i--){
            if(vMap.containsKey(A.charAt(i))){
                vc[i]=1+vc[i+1];
                cc[i] = cc[i+1];
            }
            else {
                cc[i]=1+cc[i+1];
                vc[i] = vc[i+1];
            }
        }

        if(cc[0]==len || vc[0]==len) return 0;
        for(int i=0;i<len;i++){
            if(vMap.containsKey(A.charAt(i))){
                count+= cc[i]%1000000007;
            }
            else {
                count+= vc[i]%1000000007;
            }
        }
        return count%1000000007;
    }
}
