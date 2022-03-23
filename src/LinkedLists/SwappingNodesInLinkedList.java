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

    // swap without changing values
    public ListNode swapNodes2(ListNode head, int K) {
        int num = getSize(head);
        if(K>num) return head;
        int pos = num-(K-1), curr = 1;
        ListNode dHead = new ListNode(-1);
        dHead.next = head;
        ListNode temp = head, prev = dHead, first = null, second = null;
        while(temp!=null){
            if(curr==K) {
                first = prev;
            }
            if(curr==pos) {
                second = prev;
            }
            prev = temp;
            temp = temp.next;
            curr++;
        }
        ListNode fn = first.next, fnn = fn.next, sn = second.next;
        if(num%2==0 && K==num/2){
            ListNode snn = sn==null? null : sn.next;
            first.next = sn;
            sn.next = fn;
            fn.next = snn;
            return dHead.next;
        }
        first.next = sn;
        fn.next = sn.next;
        sn.next = fnn;
        second.next = fn;
        return dHead.next;
    }
}
