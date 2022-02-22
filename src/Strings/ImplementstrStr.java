package Strings;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        //return haystack.indexOf(needle);
         int i=0,j=0,m = haystack.length(), n = needle.length(),first = 0, count = 0;
         while(i<m && j<n){
             first = i;
             while(i<m && j<n && haystack.charAt(i) == needle.charAt(j)) {
                 i++;
                 j++;
                 count++;
             }
             if(count<n) {
                 j=0;
                 count = 0;
                 i = first;
             }
             else break;
             i++;
         }
         return count==n ? first : -1;
    }
}
