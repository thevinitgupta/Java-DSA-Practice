package POTD;

import Trees.Node;
class Pair3
{
    int first, second;
    Pair3(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
public class MaximumSumOfNonAdjacentNodes {
    static Pair3 maxSumHelper(Node root)
    {
        //if root is null, we return two zeroes in pair.
        if (root == null)
        {
            Pair3 sum = new Pair3(0, 0);
            return sum;
        }

        //calling function recursively for left and right subtrees.
        Pair3 sum1 = maxSumHelper(root.left);
        Pair3 sum2 = maxSumHelper(root.right);
        Pair3 sum = new Pair3(0, 0);

        //current node is included (Left and right children are not included).
        sum.first = sum1.second + sum2.second + root.data;

        //current node is excluded (Either left or right child is included).
        sum.second = Math.max(sum1.first, sum1.second) +
                Math.max(sum2.first, sum2.second);

        return sum;
    }

    //Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root)
    {
        Pair3 res = maxSumHelper(root);
        //returning the maximum between the elements in pair(res).
        return Math.max(res.first, res.second);
    }
}
