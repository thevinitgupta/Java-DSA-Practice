package LinkedLists;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd = head,even = head.next,prev = head;
        while(odd!=null && even!=null){

            odd.next = even.next;
            even.next = odd;
            if(odd==head){
                head = even;
            }
            else prev.next = even;
            prev = odd;
            odd = odd.next;
            even = odd==null? null : odd.next;
        }
        return head;
    }
}
