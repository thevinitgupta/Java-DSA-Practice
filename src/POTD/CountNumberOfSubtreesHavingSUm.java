package POTD;

import Trees.Node;

public class CountNumberOfSubtreesHavingSUm {
    static int count = 0;
    int countSubtreesWithSumX(Node root, int X)
    {
        //Add your code here.
        count=0;
        getSum(root,X);
        return count;
    }
    static int getSum(Node root,int x){
        if(root==null) return 0;
        int leftSum = getSum(root.left,x);
        int rightSum = getSum(root.right,x);
        int tot = root.key + leftSum + rightSum;
        if(tot == x) count++;
        return tot;
    }
}
