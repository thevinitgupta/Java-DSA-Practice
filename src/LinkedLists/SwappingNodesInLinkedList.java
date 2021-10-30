package LinkedLists;

public class SwappingNodesInLinkedList {
    static int getSize(ListNode root){
        int count = 1;
        while(root.next!=null){
            root = root.next;
            count++;
        }
        return count;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int n = getSize(head);
        int count = 1;
        ListNode left = head,temp = head;

        //to handle case when the k from end is to the left of k from start
        if((n-k)+1 < k) k = (n-k)+1;
        while(temp!=null){
            if(count==k) left = temp;
            if(count==((n-k)+1)) {
                int val = left.val;
                left.val = temp.val;
                temp.val = val;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }
}
