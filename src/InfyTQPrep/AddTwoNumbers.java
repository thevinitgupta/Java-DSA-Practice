package InfyTQPrep;

import LinkedLists.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }
    public static ListNode add(ListNode l1, ListNode l2, int carry){
        if(l1==null && l2==null) return carry>0 ? new ListNode(carry) : null;
        int v1 = l1==null? 0 : l1.val, v2 = l2==null ? 0 : l2.val;
        int sum = v1+v2+carry;
        ListNode curr = new ListNode(sum%10);
        carry = sum/10;
        l1 = l1==null ? null : l1.next;
        l2 = l2==null ? null : l2.next;
        curr.next = add(l1,l2,carry);
        return curr;
    }
}
