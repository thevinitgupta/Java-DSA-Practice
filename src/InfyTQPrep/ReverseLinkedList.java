package InfyTQPrep;

import LinkedLists.ListNode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }


    public ListNode reverseListRecursive(ListNode head) {
        if(head==null) return null;
        return reverse(head,null);
    }
    public static ListNode reverse(ListNode head, ListNode prev){
        if(head==null) return prev;
        ListNode next = head.next;
        head.next = prev;
        return reverse(next,head);
    }
}
