package InterviewBit.StacksAndQueues;

import java.util.Stack;

public class RedundantBraces {
    public int braces(String A)
    {
        int ans=0;
        Stack<Character> s=new Stack<>();
        A=A.trim();
        int l=A.length();

        for(int i=0;i<l;i++)
        {
            char c=A.charAt(i);
            int t=0;
            if(c=='(' && i+2<l && A.charAt(i+2)==')')
                return 1;
            if(c==')')
            {
                while(!s.empty() && s.peek()!='(')
                {
                    s.pop();
                    t++;
                }
                s.pop();
                if(t==0)
                    return 1;
            }
            else s.push(c);

        }
        if(!s.empty() && s.peek()=='(')
            return 1;

        return 0;

    }
}
