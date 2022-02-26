package LinkedLists;

public class ReverseLinkedListRecursion {
    public ListNode reverseList(ListNode head) {
        return reverse(head,null);
    }
    public static ListNode reverse(ListNode head,ListNode prev){
        if(head==null) return null;
        if(head.next==null) {
            head.next = prev;
            return head;
        }
        ListNode next = head.next;
        head.next = prev;
        prev = head;
        return reverse(next,prev);
    }
}
