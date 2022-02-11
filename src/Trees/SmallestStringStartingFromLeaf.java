package Trees;

public class SmallestStringStartingFromLeaf {
    public String smallestFromLeaf(TreeNode root) {
        return maxLeaf(root,"",0,""+(char)123);
    }
    public static String maxLeaf(TreeNode root, String str, int curr, String m){
        if(root==null) return m;
        str = (char) (97+root.val) + str;
        curr += root.val;
        if(root.left==null && root.right==null){
            if(str.compareTo(m)<0) m = str;
            return m;
        }
        String ls = maxLeaf(root.left, str, curr, m);
        String rs = maxLeaf(root.right, str, curr, m);
        if(ls.compareTo(rs)<0) return ls;
        else return rs;
    }
}
