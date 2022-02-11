package Strings;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int [] hash = new int[26] ;
        for(int i=0;i<s1.length();i++){
            hash[s1.charAt(i)-97]++;
        }
        int k=s1.length();
        if(s2.length()<k) return false;
        int i=0,j=k,n = s2.length();
        while(i<n && j<=n){
            if(checkPerm(s2.substring(i,j),k,hash)) return true;
            i++;
            j=i+k;
        }
        return false;
    }
    public static boolean checkPerm(String s, int n, int[] hash){
        // System.out.println(Arrays.toString(hash));
        int [] hash1 = new int[26] ;
        for(int i=0;i<n;i++){
            hash1[s.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++){
            if(hash[i]!=hash1[i]) return false;
        }
        return true;
    }
}
