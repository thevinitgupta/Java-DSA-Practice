package Stack;

import java.util.Stack;

public class ValidateStackSequence {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0,m = pushed.length,n = popped.length;
        Stack<Integer> st = new Stack<>();
        st.push(pushed[i]);
        i++;
        while(i<m && j<n){
            if(st.isEmpty() || st.peek()!=popped[j] ) {
                st.push(pushed[i]);
                i++;
            }
            else {
                st.pop();
                j++;
            }
        }

        while(!st.isEmpty() && j<n){
            if( st.peek()!=popped[j]) {
                return false;
            }
            st.pop();
            j++;
        }
        return true;
    }
}
