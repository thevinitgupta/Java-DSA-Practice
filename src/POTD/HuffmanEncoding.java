package POTD;
import java.util.*;
public class HuffmanEncoding {
    class Node {
        int data;
        Node left;
        Node right;
        Node(int a) {
            this.data = a;
            this.left = null;
            this.right = null;
        }
    }

    public ArrayList < String > huffmanCodes(String S, int f[], int n) {

        PriorityQueue < Node > q = new PriorityQueue < > (new Comparator < Node > () {

            public int compare(Node n1, Node n2) {
                if (n1.data == n2.data)
                    return 1;
                return Integer.compare(n1.data, n2.data);
            }
        });

        for (int i = 0; i < n; i++) q.add(new Node(f[i]));

        while (q.size() != 1) {
            Node first=q.remove();
            Node second = q.remove();
            Node result = new Node(first.data + second.data);
            result.left = first;
            result.right = second;
            q.add(result);
        }

        ArrayList < String > al = new ArrayList < > ();
        Node root = q.remove();
        preOrder(root, "", al);
        return al;
    }

    public static void preOrder(Node root, String s, ArrayList < String > al) {

        if (root == null)
            return;
        if (root.left == null && root.right == null)
            al.add(s);
        preOrder(root.left, s + "0", al);
        preOrder(root.right, s + "1", al);
    }

}
