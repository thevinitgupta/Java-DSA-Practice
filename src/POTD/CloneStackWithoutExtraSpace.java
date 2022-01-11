package POTD;
import java.util.Stack;

public class CloneStackWithoutExtraSpace {

    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        int count=0;
        while(count!=st.size()-1){
            int top = st.pop();
            while(count!=st.size()){
                int t = st.pop();
                //System.out.println(t);
                cloned.push(t);
            }
            st.push(top);

            while(cloned.size()!=0){
                int t = cloned.pop();
                st.push(t);
            }
            //System.out.println(st);
            count++;
        }
        while(!st.isEmpty()){
            cloned.push(st.pop());
        }
    }
}
