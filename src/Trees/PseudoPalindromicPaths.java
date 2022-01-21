package Trees;

public class PseudoPalindromicPaths {
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] freq = new int[10];
        return countPaths(root,freq);
    }
    private static int countPaths(TreeNode root, int[] freq){
        if(root==null) return 0;
        int c = freq[root.val];
        freq[root.val] = c+1;
        if(root.left==null && root.right==null) return checkPalin(freq);
        int res = 0;
        if(root.left!=null){
            res += countPaths(root.left,freq);
            --freq[root.left.val];
        }
        if(root.right!=null){
            res += countPaths(root.right,freq);
            --freq[root.right.val];
        }
        return res;
    }
    private static int checkPalin( int[] freq){
        //System.out.println(Arrays.toString(freq));
        int oddC = 0;
        for(int i=1;i<=9;i++){
            if(freq[i]%2!=0) {
                oddC++;
                if(oddC>1) return 0;
            }
        }
        return 1;
    }
}
