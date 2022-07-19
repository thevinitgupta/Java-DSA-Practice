package InterviewBit.StacksAndQueues;

import java.util.Stack;

public class BalanceParanthesis {
    public int solve(String A) {

        Stack<Character> st = new Stack<>();

        st.add(A.charAt(0));

        int i = 1;

        while(i<A.length()){

            char ch = A.charAt(i);



            if(!st.isEmpty() && ch==')' && st.peek()=='(') st.pop();

            else {

                st.add(ch);

            }

            i++;

        }

        if(st.isEmpty()) return 1;

        else return 0;

    }

}
