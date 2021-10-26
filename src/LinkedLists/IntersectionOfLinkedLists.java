package LinkedLists;

public class IntersectionOfLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode temp1 = headA,temp2 = headB;
        int n = getSize(headA),m=getSize(headB);
        if(n>m) {
            temp1 = headB;
            temp2 = headA;
            int temp = n;
            n = m;
            m = temp;
        }
        while(temp1!=null && temp2!=null){
            while(m>n){
                temp2 = temp2.next;
                m--;
            }
            if(temp1==temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
    static int getSize(ListNode head){
        int count = 1;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
}
