package LinkedLists;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode lHead = new ListNode(),rHead = new ListNode(),right = rHead,left = lHead,curr = head;
        while(curr!=null){
            if(curr.val<x){
                left.next = curr;
                curr = curr.next;
                left = left.next;
                left.next = null;
            }
            else {
                right.next = curr;
                curr = curr.next;
                right = right.next;
                right.next = null;
            }
        }
        left.next = rHead.next;
        return lHead.next;
    }
}
