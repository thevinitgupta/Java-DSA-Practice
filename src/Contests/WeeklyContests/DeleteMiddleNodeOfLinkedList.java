package Contests.WeeklyContests;

import LinkedLists.ListNode;

public class DeleteMiddleNodeOfLinkedList {
    public static int getSize(ListNode head){
        int count=0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
    public ListNode deleteMiddle(ListNode head) {
        int n = getSize(head);
        if(n==1) return null;
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead,curr = head;
        int c = 0,mid = n/2;
        while(c < mid){
            prev = curr;
            curr=curr.next;
            c++;
        }
        prev.next = curr==null ? null : curr.next;
        return head;
    }
}
