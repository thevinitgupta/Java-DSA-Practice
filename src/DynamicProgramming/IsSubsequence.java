package DynamicProgramming;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,m = s.length(), n = t.length();
        while(i<m && j<n){
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i>=m;
    }
}
