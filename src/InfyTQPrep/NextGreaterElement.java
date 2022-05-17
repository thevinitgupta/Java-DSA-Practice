package InfyTQPrep;

import java.util.Stack;

public class NextGreaterElement {
    public static long[] nextLargerElement(long[] nums, int n)
    {
        Stack<Integer> st = new Stack<>();
        long [] ng = new long[n];
        st.push(0);
        int pos = 1;
        while(pos<n){
            if(!st.isEmpty() && nums[pos] > nums[st.peek()]){
                int curr = st.pop();
                ng[curr] = nums[pos];
            }
            else{
                st.push(pos);
                pos++;
            }
        }
        while(!st.isEmpty()){
            ng[st.pop()] = -1;
        }
        return ng;
    }
}
