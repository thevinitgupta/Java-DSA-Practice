package InterviewBit.LinkedList;

import LinkedLists.ListNode;

public class AddTwoNumbersAsList {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode sum = new ListNode(-1), temp = sum;

        // A = reverse(A,null);
        // B = reverse(B,null);
        int carry = 0;
        while(A!=null || B!=null){
            int v1 = A == null ? 0 : A.val;
            int v2= B == null ? 0 : B.val;
            int cs = v1+v2+carry;
            temp.next = new ListNode(cs%10);
            carry = cs/10;
            A = A==null ? null : A.next;
            B = B==null ? null: B.next;
            temp = temp.next;
        }
        if(carry>0) temp.next = new ListNode(carry);
        return sum.next;
    }
    public static ListNode reverse(ListNode head, ListNode prev){
        ListNode temp = head, next = head.next;
        if(next==null) return head;
        while(temp!=null){
            temp.next = prev;
            prev = temp;
            temp = next;
            next = temp.next;
        }
        return prev;
    }
}
