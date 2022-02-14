package LinkedLists;

public class SortListUsingQuickSort {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode tail = head;
        while(tail.next!=null) tail = tail.next;

        quickSort(head,tail);

        return head;
    }

    public static void quickSort(ListNode head, ListNode tail){
        if(head==tail) return;

        ListNode [] pivot = partition(head,tail);

        if(pivot[0]!=null) quickSort(head, pivot[0]);
        if(pivot[1]!=null) quickSort(pivot[1],tail);
    }

    public static ListNode[] partition(ListNode head, ListNode tail){

        ListNode i = head, j = head,pivot = tail,prev = null;
        //System.out.println(pivot.val);
        while(j!=tail){
            if(j.val<=tail.val){
                int temp = i.val;
                i.val = j.val;
                j.val = temp;
                prev = i;
                i = i.next;
            }
            j = j.next;
        }
        ListNode [] nodes = new ListNode[2];
        //System.out.println(i==null? "i= null" : "i="+i.val);
        int temp = i.val;
        i.val = pivot.val;
        pivot.val = temp;

        nodes[0] = prev;
        nodes[1] = i;
        //System.out.println(prev.val+", "+nodes[1].val);
        return nodes;
    }
}
