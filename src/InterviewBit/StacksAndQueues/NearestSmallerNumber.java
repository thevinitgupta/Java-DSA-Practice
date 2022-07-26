package InterviewBit.StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallerNumber {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> smaller = new ArrayList<>();
        smaller.add(-1);
        st.add(A.get(0));
        for(int i=1;i<A.size();i++){
            while(!st.isEmpty() && A.get(i)<=st.peek()) st.pop();
            smaller.add(st.isEmpty() ? -1 : st.peek());
            st.add(A.get(i));
        }
        return smaller;
    }
}
