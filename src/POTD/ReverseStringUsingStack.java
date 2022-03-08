package POTD;

import java.util.Stack;

public class ReverseStringUsingStack {
    public String reverse(String S){
        //code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<S.length();i++){
            st.push(S.charAt(i));
        }
        S = "";
        while(!st.isEmpty()){
            S += st.pop();
        }
        return S;
    }
}
