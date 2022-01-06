package POTD;

public class LongestCommonPrefixInAnArray {
    String longestCommonPrefix(String arr[], int n){
        // code here
        StringBuilder longest = new StringBuilder(arr[0]);
        int l = longest.length() ,k=0;
        for(int i=1;i<n;i++){
            String curr = arr[i];
            int j=0,m=curr.length();
            k=0;
            while(j<m && k<l){
                if(curr.charAt(j)!=longest.charAt(k)){
                    longest.delete(j,l);
                    l = longest.length();
                    break;
                }
                j++;
                k++;
            }
            if(m<l){
                longest.delete(m,l);
                l = longest.length();
            }
            if(l==0) return "-1";
        }
        return longest.toString();
    }
}
