package InterviewBit.Strings;

public class RemoveConsecutiveCharacters {
    public String solve(String A, int B) {
        int i=0,j=0;
        while(i<A.length() && j<A.length()){
            char f = A.charAt(i);
            boolean found = false;
            while(j<A.length() && f==A.charAt(j)){
                j++;
            }
            if(j-i==B){
                A = A.substring(0,i)+A.substring(j);
                j=i;
            }
            else {
                i=j;
                j=i;
            }
        }
        return A;
    }
}
