package InterviewBit.LinkedList;

import LinkedLists.ListNode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode merged = new ListNode(-1);
        ListNode temp = merged, t1 = A, t2 = B;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next = new ListNode(t1.val);
                t1 = t1.next;
            }
            else {
                temp.next = new ListNode(t2.val);
                t2 = t2.next;
            }
            temp = temp.next;
        }
        while(t1!=null){
            temp.next = new ListNode(t1.val);
            t1 = t1.next;
            temp = temp.next;
        }
        while(t2!=null){
            temp.next = new ListNode(t2.val);
            t2 = t2.next;
            temp = temp.next;
        }
        return merged.next;
    }
}
