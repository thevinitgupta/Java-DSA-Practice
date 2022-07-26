package InterviewBit.StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

public class MAXSPPROD {
    public int maxSpecialProduct(ArrayList<Integer> A) {
        // 1,4,3,4

        // long max = 0;
        // Stack<Integer> st = new Stack<>();
        // int[] left = new int[A.size()];
        // int[] right = new int[A.size()];
        // Arrays.fill(left,-1);
        // Arrays.fill(right,-1);
        // st.add(0);
        // for(int i=1;i<A.size()-1;i++){
        //     while(!st.isEmpty() && A.get(i)>=A.get(st.peek())){
        //         st.pop();
        //     }
        //     if(!st.isEmpty()) left[i] = st.peek();
        //     st.add(i);
        // }
        // st = new Stack<>();
        // st.add(A.size()-1);
        // for(int i=A.size()-2;i>0;i--){
        //     while(!st.isEmpty() && A.get(i)>=A.get(st.peek())){
        //         st.pop();
        //     }
        //     if(!st.isEmpty()) right[i] = st.peek();
        //     st.add(i);
        // }

        // for(int i=0;i<left.length;i++){
        //     if(left[i]!=-1 && right[i]!=-1) {
        //         long curr = left[i] *right[i];
        //         max = Math.max(max,curr);
        //     }
        // }

        // return (int)(max%1000000007);
        if (A.size() <= 2) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        long[] prods = new long[A.size()];
        stack.push(0);
        for (int i = 1; i< A.size(); i++) {
            while (!stack.isEmpty() && A.get(stack.peek()) <= A.get(i)) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                prods[i] = stack.peek() % 1000000007;
            }
            stack.push(i);
        }
        stack = new Stack<>();
        stack.push(A.size() - 1);
        for (int i = A.size() - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A.get(stack.peek()) <= A.get(i)) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                prods[i] *= (stack.peek() % 1000000007);
            }
            else {
                prods[i] = 0;
            }
            stack.push(i);
        }
        long maxVal = 0;
        for (int i = 0; i < A.size(); i++) {
            if (prods[i] > maxVal) {
                maxVal = prods[i];
            }
        }
        return (int) (maxVal % 1000000007);
    }
}
