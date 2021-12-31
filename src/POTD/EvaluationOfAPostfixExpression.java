package POTD;

import java.util.Stack;

public class EvaluationOfAPostfixExpression {
    public static int evaluatePostFix(String S)
    {
        // Your code here
        int res=0;
        Stack<String> s=new Stack<>();
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            if(c=='*'|| c=='/' || c=='+' || c=='-')
            {

                res=operation(c,Integer.valueOf(s.pop()),
                        Integer.valueOf(s.pop()));
                s.push(String.valueOf(res));
                //System.out.println(s);
            }
            else
                s.push(String.valueOf(c));
        }

        return res;
    }

    static int operation(char op,int a,int b)
    {
        if(op=='+')
            return b+a;
        else if(op=='-')
            return b-a;
        else if(op=='*')
            return b*a;
        return b/a;
    }
}
