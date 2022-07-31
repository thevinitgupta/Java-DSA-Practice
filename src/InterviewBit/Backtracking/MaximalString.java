package InterviewBit.Backtracking;

public class MaximalString {
    public String solve(String A, int B) {
        return swap(A,B);
    }
    public static String swap(String s, int swaps){
        if(swaps==0) return s;

        StringBuilder str = new StringBuilder(s);
        Long max = Long.parseLong(s);

        for(int i=0;i<s.length();i++){
            char c = str.charAt(i);
            for(int j=i+1;j<s.length();j++){
                char c1 = str.charAt(j);
                str.setCharAt(j,c);
                str.setCharAt(i,c1);
                max = Math.max(max, Long.parseLong(swap(str.toString(),swaps-1)));
                str = new StringBuilder(s);
            }
        }
        return max+"";
    }
}
