package LinkedLists;

import java.util.HashMap;

public class LinkedList2 {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Boolean> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(temp.next!=null && map.containsKey(temp.next)) return temp.next;
            else map.put(temp,true);
            temp = temp.next;
        }
        return null;
    }
}
