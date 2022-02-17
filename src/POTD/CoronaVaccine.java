package POTD;

import Trees.Node;

public class CoronaVaccine {
    static int count=0;
    public static int supplyVaccine(Node root)
    {
        // Your code goes here
        count=0;
        int j=corona( root);
        if(j==1)
            return count+1;
        return count;

    }
    static int corona(Node root)
    {
        if(root==null)
            return 0;
        int l=corona(root.left);
        int r=corona(root.right);
        if(l==1 ||r==1)
        {
            count++;
            return 2;
        }
        if(l==2 || r==2)
        {
            return 0;
        }
        return 1;
    }
}
