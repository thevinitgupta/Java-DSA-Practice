package Trees;

import LinkedLists.ListNode;

public class ConvertListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return new TreeNode(head.val);
        ListNode dHead = new ListNode(-100001);
        dHead.next = head;
        ListNode prev = dHead, curr = head, next = head;
        while(next.next!=null){
            prev = curr;
            curr = curr.next;
            next = next.next;
            if(next.next!=null) next = next.next;
        }
        prev.next = null;
        next = curr.next;
        TreeNode root = new TreeNode(curr.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(next);
        return root;
    }
}
