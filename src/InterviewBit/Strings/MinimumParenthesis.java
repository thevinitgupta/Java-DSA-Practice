package InterviewBit.Strings;

import java.util.Stack;

public class MinimumParenthesis {
    public int solve(String A) {
        Stack<Character> st = new Stack<>();
        int i=0;
        while(i<A.length()){
            char ch = A.charAt(i);
            if(ch=='('){
                st.add(ch);
            }
            else if(!st.isEmpty() && st.peek()=='('){
                st.pop();
            }
            else st.add(ch);
            i++;
        }
        return st.size();
    }
}
