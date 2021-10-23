package LinkedLists;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev= head,curr = head.next;
        while(curr!=null){
            while(curr!=null && prev.val==curr.val){
                prev.next = curr.next;
                curr = prev.next;
            }
            prev = curr;
            curr = curr==null ? null : curr.next;
        }
        return head;
    }

}
