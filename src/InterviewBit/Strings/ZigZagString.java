package InterviewBit.Strings;

public class ZigZagString {
    public String convert(String A, int B) {
        if(B==0) return "";
        if(B==1) return A;
        String [] rows = new String[B];
        for(int i=0;i<B;i++){
            rows[i] = "";
        }
        int pos = 0, row = 0;
        boolean inc = true;
        while(pos<A.length()){
            rows[row] += A.charAt(pos);
            row = inc ? row+1 : row-1;
            if(row==B-1) inc = false;
            else if(row==0) inc = true;
            pos++;
        }
        String ans = "";
        for(int i=0;i<rows.length;i++){
            ans += rows[i];
        }
        return ans;
    }
}
