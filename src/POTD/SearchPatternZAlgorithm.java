package POTD;

import java.util.ArrayList;

public class SearchPatternZAlgorithm {
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        ArrayList<Integer> pats = new ArrayList<>();
        int i=0,j=0,n = S.length(),p = pat.length();
        while(i<n){
            int count = 0,k=0;
            j=i;
            while(j<n && k<p && S.charAt(j)==pat.charAt(k)){
                count++;
                k++;
                j++;
            }
            if(count==p) {
                pats.add(i+1);
            }
            i++;
        }
        return pats;
    }
}
