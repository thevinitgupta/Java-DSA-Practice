package POTD;

import Trees.Node;

import java.util.Stack;

public class ConstructExpressionTree {
    public static Node constructTree(char pf[])
    {
        Stack<Node> st = new Stack<>();
        for(char ch: pf){
            if(Character.isAlphabetic(ch)){
                st.push(new Node(ch));
            }
            else{
                Node node = new Node(ch);
                node.right = st.pop();
                node.left = st.pop();
                st.push(node);
            }
        }
        return st.peek();
    }
}
