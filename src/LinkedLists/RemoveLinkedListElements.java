package LinkedLists;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null || (head.next==null && head.val==val) ) return null;
        ListNode prev = null,next = head;
        while(next!=null){
            while(next!=null && next.val==val) {
                if(prev==null) head = next.next;
                else prev.next = next.next;
                next = next.next;
            }
            prev = next;
            next = next==null ? null : next.next;
        }
        return head;
    }
}
