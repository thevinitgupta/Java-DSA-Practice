package InterviewBit.StacksAndQueues;

import java.util.Stack;

public class SimplifyDirectory {
    public String simplifyPath(String A) {
        Stack<String> st = new Stack<>();
        String [] arr = A.split("/");
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("..")){
                if(!st.isEmpty()) st.pop();
            }
            else if(!arr[i].equals(".")){
                st.push(arr[i]);
            }
        }
        // System.out.println(st);
        String res = "";
        while(!st.isEmpty()){
            String curr = st.pop();
            if(curr.length()!=0) res = "/"+curr+""+res;
        }
        if(res.length()==0) res = "/";
        return res;
    }
}
