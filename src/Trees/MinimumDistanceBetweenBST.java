package Trees;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDistanceBetweenBST {
//    public int minDiffInBST(TreeNode root) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr = getMin(root,arr);
//        Collections.sort(arr);
//        int min = Integer.MAX_VALUE;
//        for(int i=1;i<arr.size();i++){
//            int diff = arr.get(i) - arr.get(i-1);
//            min = Math.min(min,diff);
//        }
//        return min;
//    }
//
//    private static ArrayList<Integer> getMin(TreeNode root,ArrayList<Integer> arr){
//        if(root==null) return arr;
//        arr.add(root.val);
//        arr = getMin(root.left,arr);
//        arr = getMin(root.right,arr);
//        return arr;
//    }

    //faster solution
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = getMin(root,arr);
        //Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            int diff = arr.get(i) - arr.get(i-1);
            min = Math.min(min,diff);
        }
        return min;
    }
    private static ArrayList<Integer> getMin(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return arr;
        arr = getMin(root.left,arr);
        arr.add(root.val);
        arr = getMin(root.right,arr);
        return arr;
    }
}

