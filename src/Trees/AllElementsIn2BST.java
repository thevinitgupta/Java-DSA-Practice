package Trees;

import java.util.ArrayList;
import java.util.List;

public class AllElementsIn2BST {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> temp  = new ArrayList<>();
        List<Integer> s1 = inOrder(root1,temp);
        temp = new ArrayList<>();
        List<Integer> s2 = inOrder(root2,temp);
        temp = new ArrayList<>();
        int i=0,j=0,m=s1.size(),n = s2.size();
        while(i<m && j<n){
            if(s1.get(i)<s2.get(j)){
                temp.add(s1.get(i));
                i++;
            }
            else {
                temp.add(s2.get(j));
                j++;
            }
        }
        while(i<m){
            temp.add(s1.get(i));
            i++;
        }
        while(j<n){
            temp.add(s2.get(j));
            j++;
        }
        return temp;
    }
    public static List<Integer> inOrder(TreeNode root, List<Integer> sorted){
        if(root==null) return sorted;
        sorted = inOrder(root.left,sorted);
        sorted.add(root.val);
        sorted = inOrder(root.right,sorted);
        return sorted;
    }
}
