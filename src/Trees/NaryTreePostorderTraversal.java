package Trees;
import java.util.*;
class NNode {
    public int val;
    public List<NNode> children;

    public NNode() {
    }

    public NNode(int _val) {
        val = _val;
    }

    public NNode(int _val, List<NNode> _children) {
        val = _val;
        children = _children;
    }
}
public class NaryTreePostorderTraversal {
    static List<Integer> nary;
    public List<Integer> postorder(NNode root) {
        nary = new ArrayList<Integer>();
        getPost(root);
        return nary;
    }
    private static void getPost(NNode root){
        if(root==null) return;
        List<NNode> childr = root.children;
        for(int i=0;i<childr.size();i++){
            getPost(childr.get(i));
        }
        nary.add(root.val);
    }
}
