package LinkedLists;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1  =l1,t2 = l2,sumHead = new ListNode(0),t3 = sumHead;
        int carry = 0;
        while(t1!=null || t2!=null){
            int sum = (t1!=null ? t1.val : 0) +( t2!=null ? t2.val : 0) + carry;
            carry = sum/10;
            ListNode newNode = new ListNode(sum%10);
            t3.next = newNode;
            t3 = t3.next;
            t1 = t1!=null ? t1.next : null;
            t2 = t2!=null ? t2.next : null;
        }
        if(carry>0) {
            t3.next = new ListNode(carry);
        }
        return sumHead.next;
    }
}
