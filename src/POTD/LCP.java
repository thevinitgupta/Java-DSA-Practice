package POTD;

public class LCP {
    public String lcp(String s[],int n)
    {
        String longest = s[0];
        int id = 0;
        if(n==1) return s[0];
        for(int i=1;i<n;i++){
            if(s[i].length()<longest.length()) {
                longest = s[i];
                id = i;
            }
        }
        for(int i=0;i<n;i++){
            if(i==id) continue;
            int j=0,k=0;
            String curr = s[i];
            while(j<curr.length() && k<longest.length()){
                if(curr.charAt(j)!=longest.charAt(k)) break;
                j++;
                k++;
            }
            longest = curr.substring(0,Math.min(j,curr.length()));
        }
        return longest.length()==0 ? "-1" : longest;
    }
}
