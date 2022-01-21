package Trees;

import java.util.ArrayList;
import java.util.List;

public class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> rows = new ArrayList<>();
        return getMax(root,0,rows);
    }
    public static List<Integer> getMax(TreeNode root, int row, List<Integer> rows){
        if(root==null) return rows;
        row++;
        if(row>rows.size()) {
            rows.add(root.val);
        }
        else {
            if(rows.get(row-1)<root.val) rows.set(row-1, root.val);
        }

        rows = getMax(root.left,row,rows);
        rows = getMax(root.right,row,rows);
        return rows;
    }
}
