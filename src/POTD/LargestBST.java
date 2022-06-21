package POTD;

import Trees.Node;

public class LargestBST {
    static int max_size = 1;
    private static int[] rec(Node root)
    {
        if(root==null) return new int[]{0, +10000000, -10000000};

        int l[] = rec(root.left);
        int r[] = rec(root.right);


        if(r[0]==-1 || l[0]==-1 || root.data<=l[2] || root.data>=r[1])
        {
            return new int[]{-1, 0, 0};
        }

        max_size = Math.max(max_size, l[0]+r[0]+1);

        return new int[]{l[0] + r[0] + 1, Math.min(root.data, l[0]==0 ? root.data : l[1]), Math.max(root.data, r[0]==0 ? root.data : r[2])};


    }

    static int largestBst(Node root)
    {
        max_size = 1;

        rec(root);

        return max_size;


    }
}
