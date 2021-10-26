package LinkedLists;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode temp1 = l1,temp2 = l2,curr = l3;
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(temp1.val< temp2.val) {
            curr.val = temp1.val;
            temp1 = temp1.next;
        }
        else {
            curr.val = temp2.val;
            temp2 = temp2.next;
        }
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val) {
                curr.next = temp1;
                temp1 = temp1.next;
            }
            else {
                curr.next = temp2;
                temp2 = temp2.next;
            }
            curr = curr.next;
            curr.next = null;
        }
        if(temp1!=null){
           curr.next = temp1;
        }
        if(temp2!=null){
           curr.next = temp2;
        }
        return l3;
    }

    public static void main(String[] args) {

    }
}
