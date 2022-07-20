package InterviewBit.LinkedList;

import LinkedLists.ListNode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode A) {
        if(A==null) return null;
        ListNode temp = A, t2 = A.next;
        while(temp!=null && t2!=null){
            while(t2!=null && t2.val==temp.val){
                t2 = t2.next;
            }
            temp.next = t2;
            temp = t2;
            t2 = t2==null ? null : t2.next;
        }
        return A;
    }
}
