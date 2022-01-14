package Trees;

public class SumOfNodesWithEvenValuedGrandParent {

    // 2ms Solution -> faster than 50%
    public int sumEvenGrandparent(TreeNode root) {
        return getEvenSum(root,false,false,0);
    }
    public static int getEvenSum(TreeNode root, boolean parent, boolean grandP,int sum){
        if(root==null) return sum;
        if(grandP==true) {
            sum+= root.val;
        }
        if(root.val%2!=0){
            sum = getEvenSum(root.left,false,parent,sum);
            sum = getEvenSum(root.right,false,parent,sum);
        }
        else {
            sum = getEvenSum(root.left,true,parent,sum);
            sum = getEvenSum(root.right,true,parent,sum);
        }
        return sum;
    }
}
