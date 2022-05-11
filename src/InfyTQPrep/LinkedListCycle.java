package InfyTQPrep;

import LinkedLists.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode fast = head.next.next, slow = head;
        while(fast!=null && slow!=null){
            if(fast==slow) return true;
            slow = slow.next;
            fast = fast.next;
            if(fast!=null) fast = fast.next;
        }
        return false;
    }
}
