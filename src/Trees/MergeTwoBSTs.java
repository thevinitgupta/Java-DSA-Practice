package Trees;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBSTs {
    public List<Integer> merge(Node root1,Node root2)
    {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        getSorted(root1,l1);
        getSorted(root2,l2);
        return mergeSorted(l1,l2);
    }

    public static List<Integer> mergeSorted(List<Integer> l1, List<Integer> l2){
        if(l1.size()==0) return l2;
        if(l2.size()==0) return l1;
        List<Integer> merged = new ArrayList<>();
        int i=0,j=0;
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i)<l2.get(j)){
                merged.add(l1.get(i));
                i++;
            }
            else {
                merged.add(l2.get(j));
                j++;
            }
        }
        while(i<l1.size()){
            merged.add(l1.get(i));
            i++;
        }
        while(j<l2.size()){
            merged.add(l2.get(j));
            j++;
        }
        return merged;
    }
    public static void getSorted(Node root, List<Integer> arr){
        if(root==null) return;
        getSorted(root.left, arr);
        arr.add(root.data);
        getSorted(root.right,arr);
    }
}
