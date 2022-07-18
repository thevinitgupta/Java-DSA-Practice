package InterviewBit.LinkedList;

import LinkedLists.ListNode;

public class PartitionList {
    public ListNode partition(ListNode A, int B) {
        ListNode low = new ListNode(-1);
        ListNode high = new ListNode(-1);
        ListNode t1 = low, t3 = high, temp = A;
        while(temp!=null){
            if(temp.val<B){
                t1.next = temp;
                temp = temp.next;
                t1 = t1.next;
                t1.next = null;
            }
            else{
                t3.next = temp;
                temp = temp.next;
                t3 = t3.next;
                t3.next = null;
            }
        }
        t1.next = high.next;
        return low.next;
    }
}
