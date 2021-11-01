package LinkedLists;

public class AddTwoNumbers2 {
    public static ListNode reverse(ListNode head){
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        l1 = reverse(l1);
        l2 = reverse(l2);
        int carry = 0;
        ListNode tempS= new ListNode(),temp1 = l1, temp2 = l2;
        while(temp1!=null || temp2!=null){
            int v1 = temp1==null? 0 : temp1.val;
            int v2 = temp2==null? 0 : temp2.val;
            int sum = v1+v2+carry;
            tempS.val = sum%10;
            ListNode node = new ListNode();
            node.next = tempS;
            tempS = node;
            carry = sum/10;
            temp1 = temp1==null ? null : temp1.next;
            temp2 = temp2==null ? null : temp2.next;
        }
        if(carry>0) {
            tempS.val = carry;
            return tempS;
        }
        return tempS.next;
    }
}
