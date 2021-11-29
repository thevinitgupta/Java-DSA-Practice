package POTD;

import java.util.Arrays;
import java.util.Stack;

public class HelpClassmates {
    public static int[] help_classmate(int arr[], int n)
    {
        // Your code goes here
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
        st.push(0);
        int i=0,j=1;
        while(j<n){
            if(st.isEmpty()) {
                st.push(j);
                j++;
            }
            if(arr[st.peek()]<=arr[j]) {
                st.push(j);
                j++;
            }
            else {
                res[st.pop()] = arr[j];
            }
        }
        while(!st.isEmpty()){
            res[st.pop()] = -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(help_classmate(arr,arr.length)));
    }
}
