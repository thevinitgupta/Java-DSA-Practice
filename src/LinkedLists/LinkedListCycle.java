package LinkedLists;

import java.util.HashMap;

public class LinkedListCycle {

    //O(N) time and Space Solution
//    public boolean hasCycle(ListNode head) {
//        HashMap<ListNode, Boolean> map = new HashMap<>();
//        ListNode temp = head;
//        while(temp!=null){
//            if(map.containsKey(temp)) return true;
//            map.put(temp,true);
//            temp = temp.next;
//        }
//        return false;
//    }

    //faster than 100% solution with O(1) space
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode slow = head,fast = head.next.next;
        while(fast!=null && slow!=null){
            if(fast==slow) return true;
            slow = slow.next;
            fast = fast.next;
            if(fast!=null) fast = fast.next;
        }
        return false;
    }
}
