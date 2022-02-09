package Trees;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBT {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String str = serial(root);
        return str;
    }
    public static String serial(TreeNode root){
        if(root==null) return "#,";
        String encoding = root.val+",";
        encoding += serial(root.left);
        encoding += serial(root.right);
        return encoding;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(",")));
        return deserial(nodes);
    }
    public static TreeNode deserial(Queue<String> vals){
        String val = vals.poll();
        if(val.equals("#")) return null;
        TreeNode root = new TreeNode(Integer.valueOf(val));
        root.left = deserial(vals);
        root.right = deserial(vals);
        return root;
    }
}
