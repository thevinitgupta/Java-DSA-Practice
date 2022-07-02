package InterviewBit.Strings;

public class ImplementStrStr {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        int i=0,len = B.length();
        while(i<(A.length()-len)+1){
            if(A.substring(i,i+len).equals(B)) return i;
            i++;
        }
        return -1;
    }
}
