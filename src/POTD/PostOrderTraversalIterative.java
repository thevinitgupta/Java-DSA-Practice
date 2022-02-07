package POTD;

import Trees.Node;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversalIterative {
    ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> S = new Stack<Node>();
        if (node == null)
            return list;
        S.push(node);
        Node prev = null;
        while (!S.isEmpty())
        {
            Node current = S.peek();
            if (prev == null || prev.left == current ||
                    prev.right == current)
            {
                if (current.left != null)
                    S.push(current.left);
                else if (current.right != null)
                    S.push(current.right);
                else
                {
                    S.pop();
                    list.add(current.data);
                }

            }
            else if (current.left == prev)
            {
                if (current.right != null)
                    S.push(current.right);
                else
                {
                    S.pop();
                    list.add(current.data);
                }
            }
            else if (current.right == prev)
            {
                S.pop();
                list.add(current.data);
            }

            prev = current;
        }

        return list;
    }
}
