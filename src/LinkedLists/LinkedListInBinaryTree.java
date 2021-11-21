package LinkedLists;

import Trees.TreeNode;

public class LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(head.next==null && root!=null && head.val==root.val) return true;
//        else if(head.val==root.val)
        return false;
    }
}
