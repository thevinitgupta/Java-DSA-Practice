package LinkedLists;

import static LinkedLists.ReverseLinkedList.reverseList;

public class ReorderList {
    static ListNode headNode;
    public static int getSize(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void reorderList(ListNode head) {
        if(head.next == null) return ;
        //0 based size
        int n = getSize(head);
        int  mid = n/2;
        int count = 0;
        ListNode temp = head;

        //loop to reach the middle element after which the reversing will begin
        while (count<mid-1){
            temp = temp.next;
            count++;
        }
        ListNode rev = temp.next;
        temp.next = null;
        rev = reverseList(rev);
        temp = head;
        ListNode tr = rev,next = tr.next,tNext = temp.next,prev = temp;

        while(temp!=null && tr!=null){
            tr.next = temp.next;
            temp.next = tr;
            prev = tr;
            tr = next;
            next = tr==null ? null : tr.next;
            temp = tNext;
            tNext = temp==null ? null : temp.next;
        }
        if(tr!=null){
            prev.next = tr;
        }
        return ;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(1);
        headNode = head;
        System.out.println(headNode.next.val);
        reorderList(head);
        System.out.println(headNode.next.val);
    }
}
