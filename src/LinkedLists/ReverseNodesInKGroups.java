package LinkedLists;

import java.util.ArrayList;

public class ReverseNodesInKGroups {
    public ListNode reverseKGroup(ListNode head, int k) {
        int currCount = 1;
        if(head.next==null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, curr = head, next = head.next;
        while(curr!=null){
            if(currCount==k){
                curr.next = null;
                ArrayList<ListNode> revs = reverseLinkedList(prev.next);
                prev.next = revs.get(0);
                ListNode rev1 = revs.get(1);
                rev1.next = next;
                curr = next;
                prev = rev1;
                next = next==null? null :  next.next;
                currCount=1;
            }
            else{
                curr = next;
                next = next==null? null : next.next;
                currCount++;
            }
        }
        return dummy.next;
    }
    public static ArrayList reverseLinkedList(ListNode head){
        ArrayList<ListNode> res = new ArrayList<>();
        if(head==null || head.next==null) {
            res.add(head);
            res.add(head);
            return res;
        }
        ListNode prev= null,curr = head,next = head.next;
        while(curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        res.add(head);
        head = curr;
        res.add(0,head);
        curr = head;
        return res;
    }
}
