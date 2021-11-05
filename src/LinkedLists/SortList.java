package LinkedLists;

public class SortList {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    public static int getSize(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public static ListNode mergeSort(ListNode head){
        if(head==null || head.next==null) return head;
        int n = getSize(head);
        int mid = n/2,c = 1;
        ListNode temp = head,lh = head,rh = temp;
        while(c<mid){
            temp = temp.next;
            c++;
        }
        rh = temp.next;
        temp.next = null;
        return mergeSorted(mergeSort(lh), mergeSort(rh));
    }
    public static ListNode mergeSorted(ListNode l1, ListNode l2) {
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
}
