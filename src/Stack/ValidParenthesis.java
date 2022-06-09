package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String exp) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                st.push(ch);
            }
            else {
                if(st.isEmpty()) return false;
                else {
                    if(ch==')' && st.peek()!='(' ) return false;
                    else if(ch=='}' && st.peek()!='{' ) return false;
                    else if(ch==']' && st.peek()!='[' ) return false;
                    else st.pop();
                }
            }
        }
        return st.size()==0;
    }
}
