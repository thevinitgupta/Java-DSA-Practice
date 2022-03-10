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

    public ListNode addTwoNumbersCleaner(ListNode l1, ListNode l2) {
        ListNode sHead = new ListNode(-1);

        ListNode temp1 = l1, temp2 = l2, temp3 = sHead;
        int carry = 0;
        while(temp1!=null && temp2!=null){
            int sum = temp1.val + temp2.val +carry;
            temp3.next = new ListNode(sum%10);
            carry = sum<10 ? 0 : 1;
            temp1 = temp1.next;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        while(temp1!=null) {
            int sum = temp1.val + carry;
            temp3.next = new ListNode(sum%10);
            carry = sum<10 ? 0 : 1;
            temp1 = temp1.next;
            temp3 = temp3.next;
        }
        while(temp2!=null) {
            int sum = temp2.val + carry;
            temp3.next = new ListNode(sum%10);
            carry = sum<10 ? 0 : 1;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        if(carry>0) {
            temp3.next = new ListNode(carry);
        }
        return sHead.next;
    }
}
