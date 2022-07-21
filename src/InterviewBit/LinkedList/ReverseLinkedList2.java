package InterviewBit.LinkedList;

import LinkedLists.ListNode;

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode A, int m, int n) {
        if(A==null || m==n){
            return A;
        }

        ListNode fakeHead=new ListNode(-1);
        fakeHead.next=A;
        int pos=1;
        //go m-1 places
        ListNode start=fakeHead;
        ListNode curr=A;
        while(pos<m){
            start=curr;
            curr=curr.next;
            pos++;
        }

        //reverse n posits
        ListNode prev=null;
        ListNode tail=curr;
        while(pos<=n){
            ListNode future=curr.next;
            curr.next=prev;
            prev=curr;
            curr=future;
            pos++;
        }
        start.next=prev;
        tail.next=curr;
        return fakeHead.next;
    }

}
