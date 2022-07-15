package InterviewBit;

import LinkedLists.ListNode;

public class PalindromeList {
    public int lPalin(ListNode head) {
        ListNode fast = head, slow = head;
        if(head.next==null) return 1;
        while(fast!=null){
            fast = fast.next;
            if(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
        }
        ListNode rev = slow.next;
        slow.next = null;
        rev = reverse(rev,null);
        ListNode t1=head, t2 = rev;
        while(t1!=null && t2!=null){
            if(t1.val!=t2.val) return 0;
            t1 = t1.next;
            t2 = t2.next;
        }
        return 1;
    }
    public static ListNode reverse(ListNode head, ListNode prev){
        ListNode temp = head,next = head.next;
        while(temp!=null){
            temp.next = prev;
            prev = temp;
            temp = next;
            next = next==null ? null : next.next;
        }
        return prev;
    }
}
