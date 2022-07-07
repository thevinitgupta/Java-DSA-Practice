package InterviewBit.Strings;

public class ReverseTheString {
    public String solve(String A) {
        String [] str = A.split(" ");
        String ans = "";
        for(int i=str.length-1;i>=0;i--){
            if(str[i].length()==0) continue;
            ans += str[i]+" ";
        }
        return ans.trim();
    }
}
