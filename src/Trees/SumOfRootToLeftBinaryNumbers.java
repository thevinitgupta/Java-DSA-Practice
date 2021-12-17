package Trees;
import java.util.ArrayList;
public class SumOfRootToLeftBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        ArrayList<String> bins = getBinaryStrings(root,root.val+"");
        //System.out.println(bins);
        int sum = 0;
        for(int i=0;i<bins.size();i++){
            sum += Integer.parseInt(bins.get(i),2);
        }
        return sum;
    }

    private static ArrayList getBinaryStrings(TreeNode root, String curr){
        ArrayList<String> currBins = new ArrayList<>();
        if(root.left==null && root.right==null) {
            currBins.add(curr);
            //System.out.println(currBins);
            return currBins;
        }
        //curr = curr+root.val;
        if(root.left!=null){
            String left = curr+ root.left.val;
            currBins.addAll(getBinaryStrings(root.left,left));
        }
        if(root.right!=null) {
            String right = curr + root.right.val;
            currBins.addAll(getBinaryStrings(root.right,right));
        }
        return currBins;
    }
}
