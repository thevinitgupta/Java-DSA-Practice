package LinkedLists;
import static LinkedLists.ReverseLinkedList.reverseList;

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right) return head;
        ListNode l=head,r=head,temp = head,rev = head;
        int count = 1;
        while(temp!=null && count<=right){
            if(count==(left-1)) {
                l = temp;
                rev = temp.next;
            }
            if(count==right){
                r = temp.next;
                temp.next = null;
                temp = r;
            }
            temp = temp.next;
            count++;
        }
        rev = reverseList(rev);
        temp = rev;
        l.next = rev;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = r;
        return head;
    }
}
