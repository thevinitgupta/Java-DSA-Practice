package POTD;

import java.util.Stack;

public class ParanthesisChecker {
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        if(x.length()%2!=0) return false;
        for(int i=0;i<x.length();i++){
            char ch = x.charAt(i);
            char prev = '0';
            if(!st.isEmpty())
                prev = st.peek();

            if(ch=='{' || ch=='[' || ch=='(') st.push(ch);
            else {
                if(ch=='}' && prev=='{') st.pop();
                else if(ch==']' && prev=='[') st.pop();
                else if(prev=='(' && ch==')') st.pop();
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ispar("{([[])}"));
    }
}
