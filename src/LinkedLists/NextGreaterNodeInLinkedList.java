package LinkedLists;

public class NextGreaterNodeInLinkedList {
    static int getSize(ListNode root){
        int count = 1;
        while(root.next!=null){
            root = root.next;
            count++;
        }
        return count;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = getSize(head);
        int [] nextHigh = new int[size];
        ListNode low = head,high = head;
        int count = 0;
        while(low!=null){
            while(high!=null && low.val>=high.val){
                high = high.next;
            }
            if(high==null){
                nextHigh[count] = 0;
                count++;
                low = low.next;
                high = low;
            }
            else {
                nextHigh[count] = high.val;
                if(low.next!=null && low.val>low.next.val) high = low.next;
                low = low.next;
                count++;
            }
        }
        return nextHigh;
    }
}
