package LinkedLists;
import static LinkedLists.ReverseLinkedList.reverseList;

public class ReverseLinkedList2 {
    public static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev= null,curr = head,next = head.next;
        while(curr.next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = curr.next;
        }
        curr.next = prev;
        head = curr;
        return head;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right) return head;
        ListNode dHead = new ListNode(-501);
        dHead.next = head;
        ListNode temp = head,l = dHead,r = dHead,rev = head;
        int count = 1;
        while(temp!=null){
            if(count<left){
                l=l.next;
            }
            else if(count==left) rev = temp;
            if(count==right){
                r = temp.next;
                temp.next =null;
                break;
            }
            temp = temp!=null ? temp.next : null;
            count++;
        }
        l.next = reverseList(rev);
        temp = l.next;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = r;
        return dHead.next;
    }
}
