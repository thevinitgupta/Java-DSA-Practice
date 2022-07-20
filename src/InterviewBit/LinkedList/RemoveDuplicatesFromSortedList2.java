package InterviewBit.LinkedList;

import LinkedLists.ListNode;

public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null) return null;

        ListNode dHead = new ListNode(-1);

        dHead.next = head;

        ListNode temp = head, prev = dHead, next = head.next;

        if(next==null) return head;

        while(temp!=null){

            boolean dup = false;

            while(next!=null && next.val==temp.val){

                next = next.next;

                dup = true;

            }

            if(dup){

                prev.next = next;

                temp = next;

                next = next==null ? null : next.next;

            }

            else {

                prev = temp;

                temp = temp==null ? null : temp.next;

                next = temp==null ? null : temp.next;

            }

        }

        return dHead.next;

    }
}
