package LinkedLists;

public class SwapNodesInPairs {
    public ListNode swapPair(ListNode head) {
        if(head==null) return null;
        ListNode dHead = new ListNode(-1);
        dHead.next = head;
        ListNode prev = dHead, curr = head;
        ListNode temp = head.next;
        while(temp!=null){
            prev.next = temp;
            curr.next = temp.next;
            temp.next = curr;
            prev = curr;
            curr = curr.next;
            temp = curr==null? null : curr.next;
        }
        return dHead.next;
    }
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
