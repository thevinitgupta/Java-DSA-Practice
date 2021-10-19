package POTD;

import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangularAreaInHistogram {
    public static long getMaxArea(long [] hist, long n)
    {
        // your code here
        int [] left  = new int[(int)n];
        int [] right = new int[(int)n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.empty() && hist[i] <= hist[st.peek()]){
                st.pop();
            }

            if(st.empty()) left[i]=0;
            else left[i]=st.peek()+1;
            st.push(i);
        }
        st=new Stack<>();
        for(int i=(int)n-1;i>=0;i--){
            while(!st.empty() && hist[i] <= hist[st.peek()]){
                st.pop();
            }
            if(st.empty()) right[i]=(int)n-1;
            else right[i]=st.peek()-1;
            st.push(i);
        }
        long max=0;
        for(int i=0;i<n;i++){
            long i1 = right[i] - left[i] + 1;
            if(max < i1 * hist[i])
                max= i1 * hist[i];
        }
        return max;
    }

    public static void main(String[] args) {
        long [] arr = {6,2,5,4,5,1,6};
        System.out.println("Max Area = "+getMaxArea(arr,arr.length));
    }
}
