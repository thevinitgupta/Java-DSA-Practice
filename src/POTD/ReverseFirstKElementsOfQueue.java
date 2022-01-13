package POTD;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack();
        int n = q.size();
        int c = 0;
        while(q.peek()!=null && c<k){
            st.push(q.remove());
            c++;
        }
        while(st.size()!=0){
            q.add(st.pop());
        }
        c = n-k;

        while(c>0){
            int pop = q.remove();
            q.add(pop);
            c--;
        }
        return q;
    }
}
