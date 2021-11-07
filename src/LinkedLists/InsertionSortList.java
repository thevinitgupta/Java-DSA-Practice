package LinkedLists;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head.next==null) return head;
        ListNode sorted = new ListNode();
        ListNode curr = head,temp,s = sorted.next;

        while(curr!=null){
            ListNode tempS=sorted;
            while(s!=null && s.val<curr.val){
                tempS = s;
                s=s.next;
            }

            tempS.next = curr;
            temp = curr.next;

            if(s==null){
                curr.next = null;
            }
            else {
                curr.next = s;
            }
            s = sorted.next;
            curr = temp;
        }

        return sorted.next;
    }
}
