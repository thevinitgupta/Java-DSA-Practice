package Contests.GFGStackQueue;

import java.util.ArrayList;
import java.util.Stack;

public class MakeArrayBeautiful {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        ArrayList<Integer> beauty = new ArrayList<>();
        int n = arr.length,i=0;
        Stack<Integer> st = new Stack<>();
        st.add(arr[0]);
        for(i=1;i<n;i++){
            if(st.isEmpty()){
                st.add(arr[i]);
                continue;
            }
            int pop = st.pop();
            if(pop>=0 && arr[i]>=0 || pop<0 && arr[i]<0){
                st.add(pop);
                st.add(arr[i]);
            }

        }

        beauty.addAll(st);

        return beauty;
    }
}
